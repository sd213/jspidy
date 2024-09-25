Injection with with xml only and manually without component scanning

for direct field injection must not be private

In Spring, field injection allows for injecting dependencies directly into fields (class properties) using annotations like @Autowired. However, when using XML-based configuration, field injection is not directly supported in the same way it is in annotation-based configuration. Instead, setter injection or constructor injection is used more commonly in XML configuration.