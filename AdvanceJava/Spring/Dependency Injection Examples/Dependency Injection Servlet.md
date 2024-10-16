# ServletConfig object injection in servlet

## In the context of **Servlets**, when the servlet container creates a servlet class object, it also **injects** the `ServletConfig` object into the servlet. This is indeed a form of **dependency injection**, as the servlet class (target class) depends on the `ServletConfig` object, and the servlet container provides it automatically'.'

### ServletConfig Injection as Dependency Injection

**ServletConfig** is an object provided by the servlet container (like Apache Tomcat, Jetty, etc.) that holds initialization parameters and configuration information for the servlet. The servlet container is responsible for:

1. **Creating the servlet instance**.
2. **Injecting** the `ServletConfig` object into the servlet instance before calling its `init()` method.

This can be considered a **type of dependency injection** because the container supplies the required `ServletConfig` object to the servlet without the servlet having to manually obtain it.

### How ServletConfig Works

When a servlet is created, the container does the following:

- Calls the servlet’s **`init()`** method.
- Passes an instance of **`ServletConfig`** to this method, which can be used to access initialization parameters and other configuration data.

The servlet doesn’t have to create or manage the `ServletConfig`; it is injected by the container, just like DI provides dependencies to a class without the class having to manually create them.

### Example of ServletConfig Dependency Injection

```java
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MyServlet extends HttpServlet {

    private String dbName;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        
        // Using the injected ServletConfig object to retrieve initialization parameters
        dbName = config.getInitParameter("databaseName");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
        throws ServletException, IOException {
        
        // Responding with the injected dependency (databaseName)
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Connected to Database: " + dbName + "</h1>");
    }
}
```

### web.xml Configuration for Servlet Initialization Parameters

You can define the initialization parameters for the servlet in the `web.xml` file:

```xml
<servlet>
    <servlet-name>MyServlet</servlet-name>
    <servlet-class>MyServlet</servlet-class>
    <init-param>
        <param-name>databaseName</param-name>
        <param-value>myDatabase</param-value>
    </init-param>
</servlet>

<servlet-mapping>
    <servlet-name>MyServlet</servlet-name>
    <url-pattern>/db</url-pattern>
</servlet-mapping>
```

### Explanation

- **Dependency Injection**: The servlet container creates an instance of `ServletConfig` and injects it into the servlet using the `init()` method.
- **Servlet Class Dependency**: The servlet depends on the `ServletConfig` object to access initialization parameters like the database name.
- **Inversion of Control**: The servlet doesn’t control how the `ServletConfig` is created; the servlet container manages that, which is a key principle of dependency injection and inversion of control.

### Comparison with Traditional Dependency Injection

- In traditional DI, the dependencies (such as services or configurations) are injected via constructor, setters, or fields.
- In the servlet world, **ServletConfig** is injected by the servlet container into the servlet, similar to how a framework like Spring would inject dependencies.

### Conclusion

In the servlet lifecycle, the **injection** of the `ServletConfig` object by the servlet container is indeed a form of **dependency injection**, where the servlet (the dependent class) receives the `ServletConfig` object from the container, just as it would with DI in other design patterns.
