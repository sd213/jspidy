# i want do more than 6 rounds of salting then how to do it

In **Spring Boot**, you can customize the number of **rounds** (or "strength") for salting and hashing with **BCryptPasswordEncoder** by increasing its **work factor**. The work factor represents the number of rounds of hashing and salting the password goes through, making it more computationally expensive and harder for attackers to crack. The default work factor in **BCrypt** is 10, but you can increase it to any value (e.g., 12, 14, etc.) to make the hashing process more secure.

The formula to set the number of rounds (salting strength) is simple: the **BCryptPasswordEncoder** constructor accepts an integer that defines the number of **logarithmic rounds**. Each increase in the number effectively doubles the computational cost.

### Steps to Customize the Number of Rounds in BCrypt

### 1. **Increase the BCrypt Strength (Rounds)**

By default, **BCrypt** applies 10 rounds of hashing. If you want more than that, you can specify it in the constructor.

- **BCryptPasswordEncoder(int strength)**: The `strength` parameter controls the number of hashing rounds. Each increment increases the time required to generate the hash, making it harder for brute-force attacks to succeed.

#### Example: Increasing to 12 Rounds
```java
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SecurityConfig {

    // Set the work factor to 12 rounds (or more)
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder(12); // Increase rounds for more security
    }
}
```

### 2. **Hashing the Password with Increased Rounds**
Once you've configured the `BCryptPasswordEncoder` with a higher strength, you can use it in your service to hash passwords as before.

#### Example: Hashing a Password
```java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    public void registerUser(String email, String plainPassword) {
        // Hash the password with the specified rounds of BCrypt
        String hashedPassword = passwordEncoder.encode(plainPassword);
        // Save the hashed password to the database (with salt included)
        User user = new User(email, hashedPassword);
        // Save user logic...
    }
}
```

### 3. **Performance Considerations**

Increasing the **BCrypt rounds** adds more computational cost to the password hashing process, making it slower. This is useful to prevent brute-force attacks, but it may affect application performance. Test different work factors (e.g., 12, 14, etc.) to find a balance between security and performance.

#### Time Complexity of BCrypt
- Each increment in the work factor doubles the amount of time required to compute the hash.
- Example: If hashing with a work factor of 10 takes **100ms**, then a work factor of 12 will take roughly **400ms**.

Make sure to adjust the work factor according to your application’s needs and resources.

### 4. **Example Comparison**
Let's compare different rounds of salting with **BCrypt**. Here’s how to implement and compare the time taken for each:

```java
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BCryptExample {
    public static void main(String[] args) {
        String plainPassword = "securePassword123";

        for (int rounds = 10; rounds <= 15; rounds++) {
            BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(rounds);
            long startTime = System.currentTimeMillis();
            String hashedPassword = encoder.encode(plainPassword);
            long endTime = System.currentTimeMillis();
            
            System.out.println("Rounds: " + rounds + " | Time taken: " + (endTime - startTime) + " ms | Hashed: " + hashedPassword);
        }
    }
}
```

### 5. **Verifying Passwords**
The BCrypt password verification process remains the same regardless of the number of rounds. You use `matches()` to compare the plain password with the stored hash, and BCrypt automatically takes care of extracting the salt and applying the correct number of rounds during verification.

#### Example: Verifying Passwords
```java
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserRepository userRepository;

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

### Conclusion

- **BCrypt** automatically handles salting, so you don't need to manage salt separately.
- Increasing the number of rounds in **BCrypt** makes the hashing more secure by making it harder for attackers to crack passwords.
- You can configure the number of rounds by passing the desired strength (work factor) into the `BCryptPasswordEncoder` constructor.
- Be mindful of performance impacts when increasing the number of rounds.