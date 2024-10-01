# how many to maps http request in spring boot


In **Spring Boot**, there are several ways to map an HTTP request to a specific method in a controller. These mappings allow the application to handle different types of HTTP requests like `GET`, `POST`, `PUT`, `DELETE`, etc.

Here’s a breakdown of the most commonly used annotations to map HTTP requests in **Spring Boot**:

---

## 1. `@RequestMapping`
- **Purpose**: This is the most generic annotation that can map a wide variety of HTTP methods. It can be used at both the class and method levels to define a path and HTTP method.
- **Supported Methods**: By default, it supports all HTTP methods (`GET`, `POST`, `PUT`, `DELETE`, etc.), but you can specify which one by using the `method` attribute.

### Example:
```java
@RestController
@RequestMapping("/api/users")
public class UserController {

    // Map any HTTP method (GET, POST, PUT, etc.) to this method
    @RequestMapping("/getUser")
    public String getUser() {
        return "This is a generic RequestMapping";
    }
    
    // Specific to GET requests
    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    public String getUserById() {
        return "This is a GET Request";
    }
}
```

### Common Attributes of `@RequestMapping`:
- `value` or `path`: Define the URL path.
- `method`: Define the HTTP method (e.g., `RequestMethod.GET`, `RequestMethod.POST`).
- `params`: Specify required parameters (e.g., `"myParam=someValue"`).
- `headers`: Specify required HTTP headers.
- `consumes`: Specify the type of input data (e.g., `application/json`).
- `produces`: Specify the type of output data (e.g., `application/json`).

---

## 2. `@GetMapping`
- **Purpose**: Shortcut for `@RequestMapping(method = RequestMethod.GET)`. It is used to map **GET** requests, commonly used for retrieving data.
  
### Example:
```java
@RestController
@RequestMapping("/api")
public class UserController {

    @GetMapping("/users")
    public List<User> getUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }
}
```

---

## 3. `@PostMapping`
- **Purpose**: Shortcut for `@RequestMapping(method = RequestMethod.POST)`. It is used to map **POST** requests, commonly used for creating resources or submitting data.

### Example:
```java
@RestController
@RequestMapping("/api")
public class UserController {

    @PostMapping("/users")
    public User createUser(@RequestBody User user) {
        return userService.saveUser(user);
    }
}
```

---

## 4. `@PutMapping`
- **Purpose**: Shortcut for `@RequestMapping(method = RequestMethod.PUT)`. It is used to map **PUT** requests, commonly used for updating resources.

### Example:
```java
@RestController
@RequestMapping("/api")
public class UserController {

    @PutMapping("/users/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user) {
        return userService.updateUser(id, user);
    }
}
```

---

## 5. `@DeleteMapping`
- **Purpose**: Shortcut for `@RequestMapping(method = RequestMethod.DELETE)`. It is used to map **DELETE** requests, commonly used for deleting resources.

### Example:
```java
@RestController
@RequestMapping("/api")
public class UserController {

    @DeleteMapping("/users/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }
}
```

---

## 6. `@PatchMapping`
- **Purpose**: Shortcut for `@RequestMapping(method = RequestMethod.PATCH)`. It is used to map **PATCH** requests, commonly used for partial updates of resources.

### Example:
```java
@RestController
@RequestMapping("/api")
public class UserController {

    @PatchMapping("/users/{id}")
    public User updateUserPartially(@PathVariable Long id, @RequestBody Map<String, Object> updates) {
        return userService.updateUserPartially(id, updates);
    }
}
```

---

## 7. `@PathVariable`
- **Purpose**: Maps dynamic values from the URL to method parameters. It is commonly used for passing parameters via the URL.
  
### Example:
```java
@RestController
@RequestMapping("/api")
public class UserController {

    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }
}
```

---

## 8. `@RequestParam`
- **Purpose**: Maps query parameters from the URL to method parameters. Useful for extracting data from the URL query string.

### Example:
```java
@RestController
@RequestMapping("/api")
public class UserController {

    @GetMapping("/users")
    public List<User> getUsers(@RequestParam(value = "page", required = false) int page) {
        return userService.getUsersByPage(page);
    }
}
```

---

## 9. `@RequestBody`
- **Purpose**: Maps the HTTP request body to a Java object. Typically used in POST or PUT requests where the request body contains the data to create or update a resource.

### Example:
```java
@PostMapping("/users")
public User createUser(@RequestBody User user) {
    return userService.saveUser(user);
}
```

---

## 10. `@RequestHeader`
- **Purpose**: Maps the value of a specific HTTP header to a method parameter. Useful when handling custom headers or extracting metadata from requests.

### Example:
```java
@GetMapping("/users")
public List<User> getUsers(@RequestHeader("Authorization") String authToken) {
    // Process the authToken
    return userService.getAllUsers();
}
```

---

## 11. `@ModelAttribute`
- **Purpose**: Binds form data or query parameters from a request to a model attribute (Java object). Commonly used for form submission.

### Example:
```java
@PostMapping("/users")
public String createUser(@ModelAttribute User user) {
    userService.saveUser(user);
    return "redirect:/success";
}
```

---

## 12. `@MatrixVariable`
- **Purpose**: Maps matrix variables (part of the URL path) to method parameters. Matrix variables are rarely used but are part of the URL specification.

### Example:
```java
@GetMapping("/users/{filters}")
public List<User> getFilteredUsers(@MatrixVariable(pathVar = "filters") Map<String, List<String>> filters) {
    // Handle the matrix variables like /users;age=25;height=180
    return userService.getFilteredUsers(filters);
}
```

---

### Summary of HTTP Mapping Annotations:

| Annotation      | HTTP Method | Use Case                                      |
|-----------------|-------------|-----------------------------------------------|
| `@RequestMapping` | Any         | Generic request mapping for any HTTP method  |
| `@GetMapping`    | GET         | Retrieve resources (fetch data)              |
| `@PostMapping`   | POST        | Create resources or submit data              |
| `@PutMapping`    | PUT         | Update resources (full update)               |
| `@DeleteMapping` | DELETE      | Delete resources                             |
| `@PatchMapping`  | PATCH       | Partial update of resources                  |
| `@PathVariable`  | Any         | Extract dynamic values from URL path         |
| `@RequestParam`  | Any         | Extract query parameters from URL            |
| `@RequestBody`   | POST/PUT    | Map request body to Java object              |
| `@RequestHeader` | Any         | Extract data from HTTP headers               |
| `@ModelAttribute`| Any         | Bind request parameters to model attributes  |
| `@MatrixVariable`| Any         | Bind matrix variables from URL               |

These mappings give you flexibility in how you handle different types of HTTP requests in **Spring Boot**. They allow you to interact with various aspects of the HTTP request (path, query parameters, headers, body) and route it to the appropriate controller method.