# How to add security to  spring project

Adding security to a Spring project typically involves integrating **Spring Security**, which is a powerful and highly customizable framework for securing Java applications. Below are the key steps and strategies for securing a Spring Boot project.

### 1. **Add Spring Security Dependency**
To start using Spring Security, you first need to add the required dependency to your project.

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

### 2. **Basic Authentication (Default Configuration)**
Once you add the Spring Security dependency, it automatically secures your application with basic authentication. The default username is `user`, and a randomly generated password is printed in the console when the application starts.

You can configure your custom username and password using the `application.properties` file:

```properties
spring.security.user.name=admin
spring.security.user.password=adminpassword
```

### 3. **Custom Security Configuration**
You can define custom security rules by creating a `SecurityConfig` class. This allows you to customize authentication mechanisms, authorization rules, and CSRF protection.

#### Example Security Configuration:
```java
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .csrf().disable() // Disable CSRF for simplicity
            .authorizeRequests()
                .antMatchers("/public/**").permitAll() // Public routes
                .anyRequest().authenticated() // All other routes require authentication
                .and()
            .httpBasic(); // Use basic authentication

        return http.build();
    }

    @Bean
    public UserDetailsService userDetailsService() {
        UserDetails user = User.withDefaultPasswordEncoder()
            .username("user")
            .password("password")
            .roles("USER")
            .build();

        return new InMemoryUserDetailsManager(user);
    }
}
```

### 4. **Form-Based Authentication**
If you want to replace basic authentication with form-based authentication, you can modify the `SecurityConfig` to include a login form:

```java
@Bean
public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    http
        .csrf().disable()
        .authorizeRequests()
            .antMatchers("/login", "/public/**").permitAll() // Permit login and public pages
            .anyRequest().authenticated()
            .and()
        .formLogin()
            .loginPage("/login") // Custom login page
            .permitAll()
            .and()
        .logout()
            .permitAll();

    return http.build();
}
```

### 5. **Using a Custom UserDetailsService**
For production-level security, you'll typically want to authenticate users from a database instead of an in-memory store. You can do this by implementing a custom `UserDetailsService` that fetches user credentials from a database (like MySQL, PostgreSQL, etc.).

#### Example:
```java
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // Logic to fetch user details from DB
        return new org.springframework.security.core.userdetails.User(
            "admin", 
            "adminpassword", 
            new ArrayList<>() // roles can be added here
        );
    }
}
```

You can then inject this service in your security configuration.

### 6. **Role-Based Access Control (RBAC)**
Spring Security allows fine-grained role-based access control. You can define roles in your configuration.

#### Example:
```java
http
    .authorizeRequests()
        .antMatchers("/admin/**").hasRole("ADMIN")
        .antMatchers("/user/**").hasRole("USER")
        .anyRequest().authenticated();
```

You can configure different roles for different endpoints, restricting access based on user roles.

### 7. **Password Encryption**
It is critical to store user passwords securely. Spring Security provides **BCryptPasswordEncoder** for encrypting passwords.

#### Example:
```java
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Bean
public BCryptPasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
}
```

You can then encode the password when saving it to the database:

```java
String encodedPassword = passwordEncoder().encode(rawPassword);
```

### 8. **CSRF Protection**
Cross-Site Request Forgery (CSRF) protection is enabled by default in Spring Security. This is important for web applications that process state-changing requests.

You can keep it enabled or disable it as necessary:

- **Enabled by default**: Protects against CSRF attacks.
- **Disable it** for APIs or stateless services:

```java
http.csrf().disable();
```

### 9. **JWT Authentication**
For stateless APIs, you can use JSON Web Tokens (JWT) to secure your endpoints. This is more efficient than sessions for REST APIs.

To implement JWT authentication, follow these steps:
1. Create a JWT utility class to generate and validate tokens.
2. Create a custom authentication filter to intercept and authenticate requests.
3. Configure Spring Security to use the JWT filter.

Here's a **brief outline** of JWT implementation:

#### Step 1: Add JWT Utility
```java
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;

public class JwtUtil {

    private String SECRET_KEY = "mysecret";

    public String generateToken(String username) {
        return Jwts.builder()
            .setSubject(username)
            .setIssuedAt(new Date())
            .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 10)) // 10 hours
            .signWith(SignatureAlgorithm.HS256, SECRET_KEY)
            .compact();
    }

    public String extractUsername(String token) {
        return Jwts.parser().setSigningKey(SECRET_KEY).parseClaimsJws(token).getBody().getSubject();
    }

    // Additional methods to validate the token...
}
```

#### Step 2: Add JWT Filter (Custom Authentication)
You need a filter to check the JWT on every request:

```java
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.web.filter.OncePerRequestFilter;

public class JwtRequestFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
            throws ServletException, IOException {

        final String authorizationHeader = request.getHeader("Authorization");

        String username = null;
        String jwt = null;

        if (authorizationHeader != null && authorizationHeader.startsWith("Bearer ")) {
            jwt = authorizationHeader.substring(7);
            username = jwtUtil.extractUsername(jwt);
        }

        if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {

            // Perform authentication

            UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken =
                    new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());

            usernamePasswordAuthenticationToken
                    .setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
            SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
        }

        chain.doFilter(request, response);
    }
}
```

### 10. **HTTPS for Encryption in Transit**
Lastly, ensure your Spring Boot application is served over **HTTPS** to protect the data in transit. You can easily configure Spring Boot for HTTPS by adding an SSL certificate (like Let’s Encrypt) to your project.

#### Configuration (in `application.properties`):
```properties
server.port=8443
server.ssl.key-store=classpath:keystore.p12
server.ssl.key-store-password=changeit
server.ssl.key-store-type=PKCS12
server.ssl.key-alias=tomcat
```

---

### Conclusion:
To secure your Spring project:
1. Use **Spring Security** to handle authentication and authorization.
2. Implement **role-based access control** for different user roles.
3. Store passwords using **BCrypt** and use **JWT** for stateless authentication in APIs.
4. Ensure data security with **CSRF protection** (for web apps) and **HTTPS** for encrypted transmission.

This provides a strong baseline for a secure Spring application.