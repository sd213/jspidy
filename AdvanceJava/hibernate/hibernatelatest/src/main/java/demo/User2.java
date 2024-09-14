package demo;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class User2 {
    @EmbeddedId
    private Person2 id;
    private String email;
    private long phone;
    private String password;

    public User2() {}

    public User2(Person2 id, String email, long phone, String password) {
        this.id = id;
        this.email = email;
        this.phone = phone;
        this.password = password;
    }

    public Person2 getId() {
        return id;
    }

    public void setId(Person2 id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User2{id=" + id + ", email='" + email + '\'' + ", phone=" + phone + ", password='" + password + '\'' + '}';
    }
}
