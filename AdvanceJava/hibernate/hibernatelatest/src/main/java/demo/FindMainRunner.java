package demo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class FindMainRunner {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
        EntityManager em = emf.createEntityManager();

//        em.getTransaction().begin();
        Person2 person2 = new Person2(1, "John Doe");
        User2 foundUser = em.find(User2.class, person2);
        System.out.println("Found User: " + foundUser);

	}
}
