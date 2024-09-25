In Spring's XML-based configuration, **Setter Injection** can be performed in multiple ways. The setter injection allows Spring to inject dependencies via setter methods after the bean is created. Let's explore different ways to perform setter injection using XML configuration.

### 1. **Basic Setter Injection with `<property>` Tag**

This is the most common and straightforward way to perform setter injection. The `<property>` tag is used to specify the bean or value that will be injected.

#### Example:

```xml
<bean id="engine" class="com.example.Engine" />

<bean id="car" class="com.example.Car">
    <!-- Setter Injection of Engine dependency -->
    <property name="engine" ref="engine" />
</bean>
```

In this example:
- The `Car` class has a `setEngine()` method.
- The `engine` bean is injected into the `Car` bean using the `ref` attribute of the `<property>` tag.

### 2. **Setter Injection with Literal Values**

You can inject literal values (strings, integers, booleans, etc.) directly into the bean using the `<property>` tag.

#### Example:

```xml
<bean id="car" class="com.example.Car">
    <!-- Setter Injection of string literal -->
    <property name="brand" value="Toyota" />
    
    <!-- Setter Injection of integer literal -->
    <property name="year" value="2020" />
    
    <!-- Setter Injection of boolean literal -->
    <property name="isElectric" value="true" />
</bean>
```

In this case:
- The `brand` (string), `year` (integer), and `isElectric` (boolean) values are injected into the `Car` bean via its setter methods (`setBrand()`, `setYear()`, `setIsElectric()`).

### 3. **Setter Injection with Inner Bean**

You can also inject an inner bean directly inside the `<property>` tag. This is useful when you want to create and inject a bean instance inline, without defining it separately.

#### Example:

```xml
<bean id="car" class="com.example.Car">
    <!-- Setter Injection using inner bean -->
    <property name="engine">
        <bean class="com.example.Engine">
            <property name="type" value="V8" />
        </bean>
    </property>
</bean>
```

Here:
- The `Engine` bean is created inline within the `Car` bean's `<property>` tag.
- The `type` property of the `Engine` is also set via setter injection.

### 4. **Setter Injection with Collection Types**

Spring allows injecting collections like `List`, `Set`, `Map`, and `Properties` through XML configuration.

#### Injecting a List:

```xml
<bean id="car" class="com.example.Car">
    <property name="features">
        <list>
            <value>Sunroof</value>
            <value>Leather Seats</value>
            <value>Bluetooth</value>
        </list>
    </property>
</bean>
```

#### Injecting a Set:

```xml
<bean id="car" class="com.example.Car">
    <property name="uniqueFeatures">
        <set>
            <value>All-Wheel Drive</value>
            <value>Keyless Entry</value>
        </set>
    </property>
</bean>
```

#### Injecting a Map:

```xml
<bean id="car" class="com.example.Car">
    <property name="specifications">
        <map>
            <entry key="color" value="Red" />
            <entry key="engineType" value="V6" />
        </map>
    </property>
</bean>
```

In these cases:
- A `List` of features, a `Set` of unique features, and a `Map` of specifications are injected into the `Car` bean via setter injection.

### 5. **Setter Injection with Null Values**

If you want to explicitly set a property to `null`, you can use the `<null/>` element within the `<property>` tag.

#### Example:

```xml
<bean id="car" class="com.example.Car">
    <property name="engine"><null/></property>
</bean>
```

This will inject a `null` value into the `Car` bean's `engine` property.

### 6. **Setter Injection with `p-namespace`**

The **p-namespace** is a shorthand for injecting dependencies in XML configuration, reducing verbosity. It allows you to set properties directly in the `<bean>` tag attributes instead of using `<property>` tags.

To use the p-namespace, you need to add the appropriate XML namespace in the `beans.xml` file:

```xml
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:p="http://www.springframework.org/schema/p"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
           http://www.springframework.org/schema/beans/spring-beans.xsd">
    
    <bean id="car" class="com.example.Car" p:engine-ref="engine" p:brand="Toyota" p:year="2020" />
    
    <bean id="engine" class="com.example.Engine" />
</beans>
```

Here:
- `p:engine-ref="engine"` is shorthand for `<property name="engine" ref="engine"/>`.
- `p:brand="Toyota"` and `p:year="2020"` are shorthand for setting literal values.

### 7. **Setter Injection with Custom Property Editors**

If you need to inject complex types or custom objects, you can define a custom property editor by extending `PropertyEditorSupport` and registering it in the Spring configuration.

#### Example:

**Custom Property Editor:**

```java
import java.beans.PropertyEditorSupport;

public class EngineTypeEditor extends PropertyEditorSupport {
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        if (text.equals("V6")) {
            setValue(new Engine("V6"));
        } else if (text.equals("V8")) {
            setValue(new Engine("V8"));
        } else {
            throw new IllegalArgumentException("Unknown engine type");
        }
    }
}
```

**XML Configuration:**

```xml
<bean id="car" class="com.example.Car">
    <property name="engine">
        <value>V8</value>
    </property>
</bean>

<bean class="org.springframework.beans.factory.config.CustomEditorConfigurer">
    <property name="customEditors">
        <map>
            <entry key="com.example.Engine" value="com.example.EngineTypeEditor" />
        </map>
    </property>
</bean>
```

In this case, the custom `EngineTypeEditor` is used to convert the string `V8` into an `Engine` object when injecting into the `Car` bean.

---

### Summary of Ways to Perform Setter Injection:

1. **Basic Setter Injection with `<property>` and `ref` for beans**.
2. **Literal Value Injection with `<property>` and `value` for strings, integers, etc.**.
3. **Inner Bean Injection using nested `<bean>` tags**.
4. **Collection Injection (`List`, `Set`, `Map`, `Properties`)**.
5. **Null Value Injection using `<null/>`**.
6. **Shorthand Setter Injection with `p-namespace`**.
7. **Custom Property Editors for complex types**.

---

### Markdown Version:

```md
# Ways to Perform Setter Injection in Spring XML

In Spring XML configuration, you can perform setter injection in multiple ways:

### 1. Basic Setter Injection with `<property>` Tag

```xml
<bean id="car" class="com.example.Car">
    <property name="engine" ref="engine" />
</bean>
```

### 2. Setter Injection with Literal Values

```xml
<bean id="car" class="com.example.Car">
    <property name="brand" value="Toyota" />
    <property name="year" value="2020" />
    <property name="isElectric" value="true" />
</bean>
```

### 3. Setter Injection with Inner Bean

```xml
<bean id="car" class="com.example.Car">
    <property name="engine">
        <bean class="com.example.Engine">
            <property name="type" value="V8" />
        </bean>
    </property>
</bean>
```

### 4. Setter Injection with Collection Types

#### List Injection

```xml
<bean id="car" class="com.example.Car">
    <property name="features">
        <list>
            <value>Sunroof</value>
            <value>Leather Seats</value>
            <value>Bluetooth</value>
        </list>
    </property>
</bean>
```

#### Map Injection

```xml
<bean id="car" class="com.example.Car">
    <property name="specifications">
        <map>
            <entry key="color" value="Red" />
            <entry key="engineType" value="V6" />
        </map>
    </property>
</bean>
```

### 5. Setter Injection with Null Values

```xml
<bean id="car" class="com.example.Car">
    <property name="engine"><null/></property>
</bean>
```

### 6. Setter Injection with `p-namespace`

```xml
<bean id="car" class="com.example.Car" p:engine-ref="engine" p:brand="Toyota" p:year="2020" />
```

### 7. Setter Injection with Custom Property Editors

```xml
<bean id="car" class="

com.example.Car">
    <property name="engine">
        <value>V8</value>
    </property>
</bean>

<bean class="org.springframework.beans.factory.config.CustomEditorConfigurer">
    <property name="customEditors">
        <map>
            <entry key="com.example.Engine" value="com.example.EngineTypeEditor" />
        </map>
    </property>
</bean>
```
```