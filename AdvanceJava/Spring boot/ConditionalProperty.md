# What @conditionalOnProperty does

`@ConditionalOnProperty` is a powerful annotation in Spring Boot used to conditionally enable or disable beans based on the presence or value of specific properties in the application’s configuration (typically found in `application.properties` or `application.yml`). This feature allows developers to create flexible and customizable applications that can adapt to different environments or configurations.

### Purpose

The main purpose of `@ConditionalOnProperty` is to enable or disable a bean's registration based on whether a particular property is defined and what its value is. This can be especially useful for:

- Configuring optional features in your application.
- Activating beans only in certain environments (like development, testing, or production).
- Avoiding the loading of beans that are not needed based on configuration settings.

### How It Works

You can use `@ConditionalOnProperty` directly on a bean method in a `@Configuration` class or on a class annotated with `@Component`, `@Service`, or similar. Here’s how to use it:

### Syntax

```java
@ConditionalOnProperty(name = "property.name", havingValue = "desiredValue", matchIfMissing = false)
```

- **`name`**: The name of the property to check (e.g., `feature.enabled`).
- **`havingValue`**: The value that the property must have for the bean to be created. If not provided, the default value of `true` is assumed.
- **`matchIfMissing`**: If set to `true`, the condition will match if the property is not defined. If set to `false`, the property must be defined for the condition to match.

### Example Usage

#### Step 1: Define a Property in Configuration

In your `application.properties` or `application.yml`, define a property:

```properties
# application.properties
feature.enabled=true
```

#### Step 2: Use `@ConditionalOnProperty` in a Configuration Class

Now, you can use `@ConditionalOnProperty` to conditionally create a bean based on this property:

```java
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeatureConfig {

    @Bean
    @ConditionalOnProperty(name = "feature.enabled", havingValue = "true")
    public MyFeature myFeature() {
        return new MyFeature(); // Only created if feature.enabled is true
    }
}
```

#### Step 3: Create a Class That Depends on the Conditional Bean

If you have a service that depends on `MyFeature`, it can be injected like any other Spring bean:

```java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    private final MyFeature myFeature;

    @Autowired
    public MyService(MyFeature myFeature) {
        this.myFeature = myFeature; // Will be null if MyFeature is not created
    }

    public void performAction() {
        if (myFeature != null) {
            myFeature.execute();
        } else {
            System.out.println("Feature is not enabled.");
        }
    }
}
```

### Summary

- `@ConditionalOnProperty` is useful for conditionally enabling or disabling beans based on properties defined in your application's configuration.
- It enhances the flexibility and configurability of your application, allowing you to easily toggle features based on environment-specific settings.
- This annotation can be particularly beneficial in microservices or modular applications where different components might need to be activated or deactivated depending on the configuration.

### Example Application Properties

You can set up your `application.properties` or `application.yml` with different configurations for various environments:

```properties
# application.properties for production
feature.enabled=true

# application.properties for development
feature.enabled=false
```

In this way, you can control the behavior of your Spring Boot application without changing the code, just by modifying the properties.

If you have more questions or need further examples, feel free to ask!