package demo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class MainRunner2 {
	public static void main(String[] args) {
		
		User u = new User();
		
		u.setId(2);
		u.setName("Puspa");
		u.setEmail("puspa@gmail.com");
		u.setPhone(98565656);
		u.setPassword("pusparasj@fire");
		System.out.println(u);
		
		Person p = new Person();
		p.setId(3);
		p.setName("Pusparaj");
		p.setEmail("rajpuspa@gmail.com");
		p.setPhone(98565656);
		p.setPassword("pusparasj@fire");
		System.out.println(p);
		
		
		EntityManagerFactory emf =  Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
//		et.begin(); 
//		em.persist(u);
//		et.commit();
//		System.out.println("Done...");
		
	
		et.begin();
		em.persist(p); 
		/*
		 * Exception in thread "main" java.lang.IllegalArgumentException: Unable to locate persister: demo.Person
	at org.hibernate.internal.SessionImpl.firePersist(SessionImpl.java:735)
	at org.hibernate.internal.SessionImpl.persist(SessionImpl.java:716)
	at demo.MainRunner2.main(MainRunner2.java:40)
		 */
		et.commit();
		System.out.println("Done...");
	}

}
