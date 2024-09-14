package demo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class MainRunner {
	public static void main(String[] args) {
		
		User u = new User();
		
		u.setId(2);
		u.setName("Puspa");
		u.setEmail("puspa@gmail.com");
		u.setPhone(98565656);
		u.setPassword("pusparasj@fire");
		System.out.println(u);
	
		
		
		EntityManagerFactory emf =  Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin(); 
		em.persist(u);
		et.commit();
		System.out.println("Done...");
		
		//commenting begin persist commit
		// if comment out begin and commit the row will not affect 
		// if commenting only commit still row will not affect
		// if commentlng only begin , it will give exceptions

	}
}
