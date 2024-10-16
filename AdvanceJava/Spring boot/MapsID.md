# What is @MapsId

The `@MapsId` annotation in JPA (Java Persistence API) is used to map a **shared primary key** relationship between two entities. It allows you to reuse the primary key of one entity as the primary key of another related entity. This is particularly useful when two entities are in a **one-to-one** relationship, and one entity’s primary key should be the same as the primary key of another entity.

In this pattern, the child entity shares its primary key with the parent entity. The `@MapsId` annotation helps map the primary key of the child entity to the foreign key of the parent entity.

### Key Concepts:

- The child entity doesn't define its own primary key; instead, it uses the primary key from the parent entity.
- The foreign key in the child entity is mapped to the primary key of the parent entity, and `@MapsId` tells JPA to use this foreign key as the child entity’s primary key.

### When to Use `@MapsId`:

- When you have a **one-to-one** relationship where the child entity's primary key is the same as the parent entity's primary key.
- For cases where an entity's ID is also its foreign key to another entity (e.g., `FacultyProfile` sharing the ID of `User`).

### Example Scenario

Let's say you have two entities: `User` and `FacultyProfile`. The `FacultyProfile` entity does not have its own ID but shares the same ID as the `User` entity.

### Step-by-Step Example:

#### 1. **User Entity (Parent)**

This entity has a primary key `id`.

```java
import javax.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private String email;
    
    // Getters and Setters
}
```

#### 2. **FacultyProfile Entity (Child)**

This entity uses the `@MapsId` annotation to share the same ID as the `User` entity.

```java
import javax.persistence.*;

@Entity
public class FacultyProfile {

    @Id
    private Long id;  // This ID will be the same as User's ID

    @OneToOne
    @MapsId  // Maps the User ID as the ID of FacultyProfile
    @JoinColumn(name = "user_id")  // Foreign key column
    private User user;

    private String department;
    private String officeHours;
    
    // Getters and Setters
}
```

### Explanation of `FacultyProfile`:
- `@Id`: The `id` in `FacultyProfile` is marked as the primary key.
- `@OneToOne`: This specifies a one-to-one relationship between `FacultyProfile` and `User`.
- `@MapsId`: This tells JPA to use the `user_id` as the primary key for `FacultyProfile`. The `user_id` field is used as both a foreign key to the `User` entity and as the primary key for the `FacultyProfile` entity.
- `@JoinColumn(name = "user_id")`: Specifies the foreign key column in the `FacultyProfile` table, which references the `User` table.

### Database Table Representation

#### User Table:

| id  | name   | email          |
| --- | ------ | -------------- |
| 1   | Alice  | alice@mail.com |
| 2   | Bob    | bob@mail.com   |

#### FacultyProfile Table:

| id  | user_id | department     | office_hours |
| --- | ------- | -------------- | ------------ |
| 1   | 1       | Computer Science | 10:00 - 12:00 |
| 2   | 2       | Mathematics    | 09:00 - 11:00 |

In this case:
- Both the `User` and `FacultyProfile` entities share the same ID (1 and 2), which forms a primary key relationship.
- The `user_id` in `FacultyProfile` is both the primary key and a foreign key that references the `User` entity.

### Benefits of Using `@MapsId`:

1. **Simplified Key Mapping**: The primary key and foreign key are the same, reducing redundancy.
2. **Enforces Relationship**: It guarantees a one-to-one relationship between the entities, since the child entity cannot exist without the parent entity.
3. **Cleaner Data Model**: Sharing the same ID ensures referential integrity between entities and keeps the design clean.

### When Not to Use `@MapsId`:

- **Many-to-one or Many-to-many relationships**: This annotation is specifically for cases where two entities have a **one-to-one** relationship and share the same primary key.
- **If both entities need their own independent primary key**: In such cases, `@MapsId` is not appropriate.

### Example Use Case with Spring Data JPA:

You can now use Spring Data JPA repositories to manage these entities. For example:

```java
public interface UserRepository extends JpaRepository<User, Long> {}

public interface FacultyProfileRepository extends JpaRepository<FacultyProfile, Long> {}
```

Now you can create and manage `User` and `FacultyProfile` entities, with the `FacultyProfile` sharing the same ID as `User`.

### Conclusion

- Use `@MapsId` in JPA when two entities share the same primary key in a one-to-one relationship.
- It is useful when the child entity’s primary key is the foreign key that references the parent entity.
- This pattern enforces a strong relationship and maintains referential integrity in your database.

Let me know if you need further clarification or examples!