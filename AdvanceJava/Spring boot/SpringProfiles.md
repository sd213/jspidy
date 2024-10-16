# how to use Spring profiles 

Spring Profiles allow you to define different configurations for different environments (like **development**, **testing**, **staging**, **production**). By using profiles, you can manage environment-specific properties, beans, and components more efficiently, without changing the core application code. Spring profiles allow you to load specific beans and configurations based on the active profile.

### Key Concepts of Spring Profiles:
1. **Profiles in Configuration Files**: Properties or YAML files can have profile-specific configurations.
2. **Profile-Specific Beans**: You can create beans that are only available in certain profiles using the `@Profile` annotation.
3. **Active Profiles**: You can activate profiles through configuration files, command-line arguments, or programmatically.

### How to Use Spring Profiles:

#### 1. **Profile-Specific Configuration Files**

You can have different configuration files for each profile, like `application-dev.properties`, `application-prod.properties`, etc. The profile-specific properties file overrides the default `application.properties` or `application.yml` values when the corresponding profile is active.

##### Directory structure:
```
src
│
├── main
│   ├── resources
│   │   ├── application.properties
│   │   ├── application-dev.properties
│   │   ├── application-prod.properties
```

**Default Configuration (`application.properties`):**
```properties
# application.properties
spring.datasource.url=jdbc:mysql://localhost:3306/default_db
spring.datasource.username=default_user
```

**Development-Specific Configuration (`application-dev.properties`):**
```properties
# application-dev.properties
spring.datasource.url=jdbc:mysql://localhost:3306/dev_db
spring.datasource.username=dev_user
```

**Production-Specific Configuration (`application-prod.properties`):**
```properties
# application-prod.properties
spring.datasource.url=jdbc:mysql://localhost:3306/prod_db
spring.datasource.username=prod_user
```

The `application.properties` file will provide default configuration values, and the profile-specific files will override these based on the active profile.

#### 2. **Activating a Profile**

You can activate a specific profile in several ways:

##### Option 1: **Using `application.properties`**
You can specify the active profile directly in the `application.properties` or `application.yml` file:

```properties
# application.properties
spring.profiles.active=dev
```

##### Option 2: **Using Command-Line Arguments**
You can also activate profiles when running the Spring Boot application using the command line:

```bash
$ java -jar myapp.jar --spring.profiles.active=prod
```

##### Option 3: **Programmatically via `SpringApplication`**
You can activate profiles programmatically in the main class by calling `setAdditionalProfiles()`:

```java
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyApplication {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(MyApplication.class);
        app.setAdditionalProfiles("prod"); // Activating the "prod" profile
        app.run(args);
    }
}
```

##### Option 4: **Using Environment Variables**
You can also set the profile as an environment variable:

```bash
$ export SPRING_PROFILES_ACTIVE=prod
```

#### 3. **Using `@Profile` Annotation for Conditional Beans**

You can create beans that are only loaded for specific profiles by using the `@Profile` annotation on classes or methods. This is useful when different environments require different beans or services.

##### Example: `@Profile` on a Class

```java
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("dev")
@Service
public class DevDatabaseService implements DatabaseService {
    @Override
    public void connect() {
        System.out.println("Connected to DEV database.");
    }
}
```

```java
@Profile("prod")
@Service
public class ProdDatabaseService implements DatabaseService {
    @Override
    public void connect() {
        System.out.println("Connected to PROD database.");
    }
}
```

When the `dev` profile is active, `DevDatabaseService` will be used. When the `prod` profile is active, `ProdDatabaseService` will be used.

##### Example: `@Profile` on a Method in `@Configuration` Class

```java
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class DatabaseConfig {

    @Bean
    @Profile("dev")
    public DatabaseService devDatabaseService() {
        return new DevDatabaseService();
    }

    @Bean
    @Profile("prod")
    public DatabaseService prodDatabaseService() {
        return new ProdDatabaseService();
    }
}
```

#### 4. **Using `@Profile` for Component Scanning**

You can also apply `@Profile` to component-scanned classes (like `@Controller`, `@Service`, etc.):

```java
@Profile("prod")
@Controller
public class ProdController {
    // Controller for production
}
```

When the profile is active, only the beans or components annotated with the matching profile will be instantiated.

#### 5. **Fallback Profile with `@Profile("default")`**

If you don’t specify an active profile, Spring uses the default profile. You can create beans for this fallback using `@Profile("default")`.

```java
@Profile("default")
@Service
public class DefaultDatabaseService implements DatabaseService {
    @Override
    public void connect() {
        System.out.println("Connected to DEFAULT database.");
    }
}
```

You can also explicitly set a default profile if none is active:

```properties
# application.properties
spring.profiles.default=dev
```

#### 6. **Using `@ConditionalOnProperty` with Profiles**

In addition to `@Profile`, you can use `@ConditionalOnProperty` to conditionally load beans based on properties from different profiles.

```java
@Bean
@ConditionalOnProperty(name = "my.feature.enabled", havingValue = "true", matchIfMissing = false)
public MyFeature myFeature() {
    return new MyFeature();
}
```

You can define `my.feature.enabled` in different profiles and conditionally enable or disable beans.

### Example Scenario

Let's say you want to use different implementations of a service (`EmailService`) in development and production environments.

#### 1. Profile-Specific Beans

```java
@Profile("dev")
@Service
public class DevEmailService implements EmailService {
    @Override
    public void sendEmail() {
        System.out.println("Sending email in DEVELOPMENT mode...");
    }
}

@Profile("prod")
@Service
public class ProdEmailService implements EmailService {
    @Override
    public void sendEmail() {
        System.out.println("Sending email in PRODUCTION mode...");
    }
}
```

#### 2. Application Properties

```properties
# application-dev.properties
spring.profiles.active=dev

# application-prod.properties
spring.profiles.active=prod
```

#### 3. Activate the Profile

For development, you can run the app with:

```bash
$ java -jar myapp.jar --spring.profiles.active=dev
```

For production:

```bash
$ java -jar myapp.jar --spring.profiles.active=prod
```

### Conclusion

- **Profiles** allow you to separate configurations and bean definitions for different environments.
- You can define profile-specific properties using files like `application-dev.properties` and `application-prod.properties`.
- Use the `@Profile` annotation to load beans conditionally based on the active profile.
- Profiles can be activated through the properties file, environment variables, command-line arguments, or programmatically.
  
This approach ensures that your Spring application is flexible and environment-specific configurations are managed cleanly without hardcoding.

Let me know if you need further clarification or additional examples!