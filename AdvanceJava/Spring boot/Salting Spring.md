# how to do salting in spring boot

Salting is a technique used to add an extra layer of security to password hashing by adding random data (the "salt") to each password before it is hashed. This prevents attackers from using precomputed hash tables (rainbow tables) to crack passwords. In **Spring Boot**, salting is automatically handled when using the **BCrypt** password encoder.

Here’s how you can implement **salting** and secure password storage in a Spring Boot project using **BCryptPasswordEncoder**, which automatically applies salt to each password.

### Steps to Implement Salting in Spring Boot

1. **Add Spring Security Dependencies**: If you don’t have Spring Security in your project yet, add it in your `pom.xml` (for Maven) or `build.gradle` (for Gradle).

#### Maven:
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-security</artifactId>
</dependency>
```

#### Gradle:
```gradle
implementation 'org.springframework.boot:spring-boot-starter-security'
```

2. **Create a Password Encoder Bean**: Spring Security’s **BCryptPasswordEncoder** automatically generates a salt internally and appends it to the password hash.

#### Configuration Class:
```java
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SecurityConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
```

3. **Hashing Passwords with Salt**: When registering users or changing passwords, use the `BCryptPasswordEncoder` to hash the password. Each time you hash a password with **BCrypt**, a unique salt is generated and stored with the hashed password.

#### User Registration Example:
```java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserRepository userRepository;

    public void registerUser(String email, String plainPassword) {
        String encodedPassword = passwordEncoder.encode(plainPassword);
        
        // Save the encoded password to the database
        User user = new User(email, encodedPassword);
        userRepository.save(user);
    }
}
```

#### Example Entity (User):
```java
import javax.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;
    private String password;

    public User() {}

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    // Getters and setters omitted for brevity
}
```

4. **Verify Passwords**: When a user logs in, compare the stored hash with the password they provide. The `BCryptPasswordEncoder` automatically extracts the salt from the stored hash and verifies the password.

#### Login Example:
```java
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public boolean login(String email, String plainPassword) {
        User user = userRepository.findByEmail(email);
        
        if (user != null) {
            // Compare the plain password with the stored hashed password
            return passwordEncoder.matches(plainPassword, user.getPassword());
        }
        return false;
    }
}
```

### 5. **Why Use BCrypt?**

- **BCrypt** is a strong hashing algorithm that includes a unique salt for each password automatically, which is stored with the hash.
- The salt is embedded into the hash itself, so you don’t need to manage salt storage manually.
- **BCrypt** is computationally expensive, which makes it resistant to brute force attacks.

### 6. **Checking the Hashed Password Format**
When using **BCrypt**, the resulting hashed password will be a string like this:
```
$2a$10$DOWsdkwg.T7bsgaXsh//AeoRuOeqQnZcFqZNUFNUgvSxlEIOwtCDe
```
- **`$2a$`**: Specifies the **BCrypt** version.
- **`10`**: Indicates the **work factor** (cost factor), which controls how expensive the hash computation is.
- **`DOWsdkwg.T7bsgaXsh//A`**: The **salt**.
- **`eoRuOeqQnZcFqZNUFNUgvSxlEIOwtCDe`**: The actual hashed password.

### 7. **Customizing BCrypt Work Factor**
You can increase the **work factor** to make the hashing slower and more secure, but be mindful of performance trade-offs.

#### Example:
```java
@Bean
public PasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder(12); // Default is 10, increase for more security
}
```

### Conclusion
In Spring Boot, **salting** is automatically handled when using **BCryptPasswordEncoder**. By simply using `BCryptPasswordEncoder`, Spring Security will take care of:
1. Generating a unique salt for each password.
2. Storing the salt within the hashed password.
3. Verifying the password with the stored hash during login.

This approach provides strong protection against common password attacks such as rainbow table attacks and brute force attacks.