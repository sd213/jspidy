# Different types of annotations in Spring and Spring boot

## Spring and Spring Boot provide a rich set of annotations to simplify the development of enterprise applications. These annotations help manage application components, inject dependencies, handle configurations, and manage web requests.

Here's a detailed list of the most common annotations in **Spring** and **Spring Boot**, grouped by category, along with their significance and examples.

---

## 1. **Core Annotations (Spring Framework)**

### 1.1. `@Component`
- **Purpose**: Marks a class as a Spring-managed bean, meaning Spring will automatically detect and register it in the application context.
- **Use Case**: Generic stereotype for any Spring-managed component.
  
  **Example**:
  ```java
  @Component
  public class MyService {
      public void performTask() {
          System.out.println("Task performed");
      }
  }
  ```

### 1.2. `@Service`
- **Purpose**: Specialization of `@Component`. Indicates that the class provides some business logic. This annotation doesn't add extra behavior compared to `@Component`, but it helps in clearly marking the class's role.
  
  **Example**:
  ```java
  @Service
  public class UserService {
      public String getUser() {
          return "John Doe";
      }
  }
  ```

### 1.3. `@Repository`
- **Purpose**: Specialization of `@Component`. Marks a class as a DAO (Data Access Object). Spring provides additional capabilities like translating database-related exceptions to runtime exceptions when using this annotation.
  
  **Example**:
  ```java
  @Repository
  public class UserRepository {
      public User findUserById(Long id) {
          // Logic to find user by id
      }
  }
  ```

### 1.4. `@Controller`
- **Purpose**: Specialization of `@Component`. Marks a class as a Spring MVC controller, handling web requests and returning views.
  
  **Example**:
  ```java
  @Controller
  public class HomeController {
      @GetMapping("/home")
      public String home() {
          return "home";  // returns view "home.html"
      }
  }
  ```

### 1.5. `@RestController`
- **Purpose**: A combination of `@Controller` and `@ResponseBody`. It is used to create REST APIs. The return value of methods is automatically serialized as JSON/XML and sent in the HTTP response body.
  
  **Example**:
  ```java
  @RestController
  public class UserController {
      @GetMapping("/users")
      public List<User> getAllUsers() {
          return userService.getAllUsers();
      }
  }
  ```

---

## 2. **Dependency Injection Annotations**

### 2.1. `@Autowired`
- **Purpose**: Used to automatically inject dependencies by type. Spring resolves and injects beans into the annotated fields, constructors, or methods.

  **Example**:
  ```java
  @Service
  public class OrderService {
      @Autowired
      private ProductService productService;
  
      public void processOrder() {
          productService.processProduct();
      }
  }
  ```

### 2.2. `@Qualifier`
- **Purpose**: Helps resolve ambiguity when multiple beans of the same type exist. Specifies which bean should be injected.

  **Example**:
  ```java
  @Service
  public class OrderService {
      @Autowired
      @Qualifier("fastShipping")
      private ShippingService shippingService;
  
      // logic
  }
  ```

### 2.3. `@Primary`
- **Purpose**: Marks a bean as the primary one when multiple beans of the same type exist. Spring uses the primary bean unless another one is specified via `@Qualifier`.
  
  **Example**:
  ```java
  @Service
  @Primary
  public class DefaultShippingService implements ShippingService {
      // logic
  }
  ```

### 2.4. `@Value`
- **Purpose**: Injects values from property files into fields.

  **Example**:
  ```java
  @Component
  public class AppConfig {
      @Value("${app.name}")
      private String appName;
  
      public void printAppName() {
          System.out.println(appName);
      }
  }
  ```

---

## 3. **Configuration Annotations**

### 3.1. `@Configuration`
- **Purpose**: Marks a class as a configuration class. Such classes are used to define beans using `@Bean` methods.

  **Example**:
  ```java
  @Configuration
  public class AppConfig {
      @Bean
      public DataSource dataSource() {
          return new DataSource();
      }
  }
  ```

### 3.2. `@Bean`
- **Purpose**: Used inside `@Configuration` classes to define beans. The method annotated with `@Bean` returns an object that is registered as a Spring bean.

  **Example**:
  ```java
  @Configuration
  public class AppConfig {
      @Bean
      public MyService myService() {
          return new MyService();
      }
  }
  ```

### 3.3. `@PropertySource`
- **Purpose**: Specifies the location of the properties file to be used in the application.
  
  **Example**:
  ```java
  @Configuration
  @PropertySource("classpath:application.properties")
  public class AppConfig {
      // Configuration logic
  }
  ```

---

## 4. **Spring Boot Specific Annotations**

### 4.1. `@SpringBootApplication`
- **Purpose**: A combination of three annotations: `@Configuration`, `@EnableAutoConfiguration`, and `@ComponentScan`. It enables automatic configuration, component scanning, and defines beans.

  **Example**:
  ```java
  @SpringBootApplication
  public class Application {
      public static void main(String[] args) {
          SpringApplication.run(Application.class, args);
      }
  }
  ```

### 4.2. `@EnableAutoConfiguration`
- **Purpose**: Automatically configures Spring beans based on the classpath and the beans you define. It is often used in conjunction with `@SpringBootApplication`.

  **Example**:
  ```java
  @EnableAutoConfiguration
  public class Application {
      public static void main(String[] args) {
          SpringApplication.run(Application.class, args);
      }
  }
  ```

### 4.3. `@ConfigurationProperties`
- **Purpose**: Binds external properties (from properties or YAML files) to a Java object. Used to configure beans by reading the properties.

  **Example**:
  ```java
  @ConfigurationProperties(prefix = "app")
  public class AppConfigProperties {
      private String name;
      private int version;
  
      // getters and setters
  }
  ```

### 4.4. `@SpringBootTest`
- **Purpose**: Used for writing integration tests in Spring Boot. It loads the complete Spring application context and allows testing the application as a whole.

  **Example**:
  ```java
  @SpringBootTest
  public class ApplicationTests {
      @Test
      void contextLoads() {
          // test logic
      }
  }
  ```

---

## 5. **Spring MVC/Web Annotations**

### 5.1. `@RequestMapping`
- **Purpose**: Maps web requests (HTTP requests) to handler methods or classes. It can handle all HTTP methods (GET, POST, etc.).

  **Example**:
  ```java
  @Controller
  @RequestMapping("/api")
  public class ApiController {
      @RequestMapping("/users")
      public List<User> getUsers() {
          return userService.getAllUsers();
      }
  }
  ```

### 5.2. `@GetMapping`, `@PostMapping`, `@PutMapping`, `@DeleteMapping`
- **Purpose**: Specialized versions of `@RequestMapping` for specific HTTP methods like GET, POST, PUT, and DELETE.

  **Example**:
  ```java
  @RestController
  public class UserController {
      @GetMapping("/users")
      public List<User> getUsers() {
          return userService.getAllUsers();
      }
  
      @PostMapping("/users")
      public void createUser(@RequestBody User user) {
          userService.save(user);
      }
  }
  ```

### 5.3. `@PathVariable`
- **Purpose**: Binds URI template variables to method parameters.

  **Example**:
  ```java
  @GetMapping("/users/{id}")
  public User getUserById(@PathVariable Long id) {
      return userService.getUserById(id);
  }
  ```

### 5.4. `@RequestParam`
- **Purpose**: Binds HTTP request parameters to method arguments.

  **Example**:
  ```java
  @GetMapping("/search")
  public List<User> searchUsers(@RequestParam String name) {
      return userService.findByName(name);
  }
  ```

---

## 6. **Spring Security Annotations**

### 6.1. `@PreAuthorize`
- **Purpose**: Used to define authorization rules at the method level based on Spring Security expressions.
  
  **Example**:
  ```java
  @Service
  public class AdminService {
  
      @PreAuthorize("hasRole('ADMIN')")
      public void performAdminTask() {
          // logic
      }
  }
  ```

### 6.2. `@Secured`
- **Purpose**: Defines method-level security based on roles.
  
  **Example**:
  ```java
  @Service
  public

 class AdminService {
  
      @Secured("ROLE_ADMIN")
      public void performAdminTask() {
          // logic
      }
  }
  ```

---

These are some of the most commonly used annotations in **Spring** and **Spring Boot**. Each annotation serves a specific purpose, streamlining the development process by reducing boilerplate code and providing clear semantics.

Here’s an extended list of **Spring** and **Spring Boot** annotations, diving deeper into some advanced ones across various categories like **aspects, transactions, caching**, etc.

---

## 7. **Aspect-Oriented Programming (AOP) Annotations**

Spring AOP allows for the modularization of cross-cutting concerns such as logging, security, and transaction management.

### 7.1. `@Aspect`
- **Purpose**: Marks a class as an aspect, defining a collection of advice (code injected at specific join points) to modularize cross-cutting concerns like logging or security.
  
  **Example**:
  ```java
  @Aspect
  @Component
  public class LoggingAspect {
  
      @Before("execution(* com.example.service.*.*(..))")
      public void logBefore(JoinPoint joinPoint) {
          System.out.println("Logging before method: " + joinPoint.getSignature().getName());
      }
  }
  ```

### 7.2. `@Before`
- **Purpose**: Declares advice that runs **before** the method execution.
  
  **Example**:
  ```java
  @Before("execution(* com.example.service.*.*(..))")
  public void logBefore(JoinPoint joinPoint) {
      System.out.println("Logging before: " + joinPoint.getSignature().getName());
  }
  ```

### 7.3. `@After`
- **Purpose**: Declares advice that runs **after** the method execution, regardless of its outcome (success or exception).
  
  **Example**:
  ```java
  @After("execution(* com.example.service.*.*(..))")
  public void logAfter(JoinPoint joinPoint) {
      System.out.println("Logging after: " + joinPoint.getSignature().getName());
  }
  ```

### 7.4. `@AfterReturning`
- **Purpose**: Declares advice that runs **after** the method returns successfully.
  
  **Example**:
  ```java
  @AfterReturning(pointcut = "execution(* com.example.service.*.*(..))", returning = "result")
  public void logAfterReturning(JoinPoint joinPoint, Object result) {
      System.out.println("Method returned: " + result);
  }
  ```

### 7.5. `@AfterThrowing`
- **Purpose**: Declares advice that runs **after** the method throws an exception.
  
  **Example**:
  ```java
  @AfterThrowing(pointcut = "execution(* com.example.service.*.*(..))", throwing = "error")
  public void logAfterThrowing(JoinPoint joinPoint, Throwable error) {
      System.out.println("Exception in method: " + error);
  }
  ```

### 7.6. `@Around`
- **Purpose**: Declares advice that runs **before** and **after** the method execution. It can also prevent the execution of the method altogether.

  **Example**:
  ```java
  @Around("execution(* com.example.service.*.*(..))")
  public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
      System.out.println("Before method: " + joinPoint.getSignature().getName());
      Object result = joinPoint.proceed();
      System.out.println("After method: " + joinPoint.getSignature().getName());
      return result;
  }
  ```

---

## 8. **Transaction Management Annotations**

Spring offers transaction management to ensure atomic operations and data consistency.

### 8.1. `@Transactional`
- **Purpose**: Marks a method or class to participate in a transaction. It allows you to define transaction boundaries declaratively.
  
  **Example**:
  ```java
  @Service
  public class UserService {
  
      @Transactional
      public void createUser(User user) {
          userRepository.save(user);
          // Additional logic within a transaction
      }
  }
  ```

### 8.2. `@EnableTransactionManagement`
- **Purpose**: Enables annotation-driven transaction management, usually added to configuration classes.
  
  **Example**:
  ```java
  @Configuration
  @EnableTransactionManagement
  public class AppConfig {
      // Configuration for DataSource, TransactionManager
  }
  ```

---

## 9. **Caching Annotations**

Spring provides built-in support for caching to optimize performance.

### 9.1. `@Cacheable`
- **Purpose**: Caches the result of a method, so the method isn't executed again if the same input is provided, unless the cache is evicted or updated.

  **Example**:
  ```java
  @Service
  public class UserService {
  
      @Cacheable("users")
      public User getUserById(Long id) {
          // Logic to get user by ID
      }
  }
  ```

### 9.2. `@CachePut`
- **Purpose**: Updates the cache with the result of the method, ensuring that the cache is kept in sync with the method's return value.
  
  **Example**:
  ```java
  @CachePut(value = "users", key = "#user.id")
  public User updateUser(User user) {
      return userRepository.save(user);
  }
  ```

### 9.3. `@CacheEvict`
- **Purpose**: Removes a specific entry or all entries from the cache. Can be useful when invalidating stale data.
  
  **Example**:
  ```java
  @CacheEvict(value = "users", key = "#id")
  public void deleteUser(Long id) {
      userRepository.deleteById(id);
  }
  
  @CacheEvict(value = "users", allEntries = true)
  public void clearCache() {
      // Clears the entire cache
  }
  ```

### 9.4. `@EnableCaching`
- **Purpose**: Enables annotation-based caching in the application.
  
  **Example**:
  ```java
  @Configuration
  @EnableCaching
  public class AppConfig {
      // Cache configuration
  }
  ```

---

## 10. **Spring Data Annotations**

Spring Data simplifies data access, especially when working with repositories.

### 10.1. `@Query`
- **Purpose**: Used in Spring Data JPA to define custom JPQL (Java Persistence Query Language) or native SQL queries directly in repository methods.

  **Example**:
  ```java
  public interface UserRepository extends JpaRepository<User, Long> {
      
      @Query("SELECT u FROM User u WHERE u.email = ?1")
      User findByEmail(String email);
  }
  ```

### 10.2. `@Modifying`
- **Purpose**: Marks a method as a query that modifies data (like `INSERT`, `UPDATE`, or `DELETE`). Typically used with `@Query` for executing custom update or delete operations.
  
  **Example**:
  ```java
  @Modifying
  @Query("UPDATE User u SET u.active = false WHERE u.lastLogin < ?1")
  void deactivateOldAccounts(LocalDate lastLoginDate);
  ```

### 10.3. `@Entity`
- **Purpose**: Marks a class as a JPA entity (database table). It's part of JPA and Hibernate ORM mapping.
  
  **Example**:
  ```java
  @Entity
  public class User {
  
      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      private Long id;
  
      private String name;
      private String email;
  
      // getters and setters
  }
  ```

### 10.4. `@Id`
- **Purpose**: Specifies the primary key of an entity.
  
  **Example**:
  ```java
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  ```

### 10.5. `@GeneratedValue`
- **Purpose**: Specifies the strategy for generating the values for primary keys (e.g., `AUTO`, `IDENTITY`, `SEQUENCE`).
  
  **Example**:
  ```java
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private Long id;
  ```

---

## 11. **Validation Annotations (Bean Validation)**

Spring integrates with JSR-303/JSR-380 for validation using annotations on fields or method parameters.

### 11.1. `@Valid`
- **Purpose**: Ensures that a method parameter (typically a request body) is validated according to the annotations applied to it (like `@NotNull`, `@Size`, etc.).

  **Example**:
  ```java
  @PostMapping("/createUser")
  public void createUser(@Valid @RequestBody User user, BindingResult result) {
      if (result.hasErrors()) {
          // Handle validation errors
      }
      userService.save(user);
  }
  ```

### 11.2. `@NotNull`, `@Size`, `@Min`, `@Max`
- **Purpose**: Common JSR-303/JSR-380 validation annotations to enforce field-level validation constraints.

  **Example**:
  ```java
  public class User {
  
      @NotNull
      private String name;
  
      @Size(min = 6, max = 20)
      private String password;
  
      @Min(18)
      @Max(60)
      private int age;
  
      // getters and setters
  }
  ```

---

## 12. **Spring Boot Actuator Annotations**

Spring Boot Actuator provides production-ready monitoring features for applications.

### 12.1. `@Endpoint`
- **Purpose**: Defines a custom Actuator endpoint for exposing application-specific monitoring data.
  
  **Example**:


  ```java
  @Endpoint(id = "customHealth")
  @Component
  public class CustomHealthEndpoint {
  
      @ReadOperation
      public String health() {
          return "Custom Health Check OK";
      }
  }
  ```

---

These annotations offer advanced functionality to handle various aspects of a **Spring** and **Spring Boot** application. You can integrate them depending on the use cases and design requirements of your project.