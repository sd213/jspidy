package demo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class MainRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Person2 person2 = new Person2(1, "John Doe");
        User2 user2 = new User2(person2, "john.doe@example.com", 1234567890L, "password123");

        em.persist(user2);

        em.getTransaction().commit();

       
        em.close();
        emf.close();
    }
}
