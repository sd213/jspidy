package hibernate_LifeCycle;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class TPDTest1 {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		User u = new User(); //Transient State
		u.setName("Raj");
		u.setEmail("raj@gmail.com"); 
		System.out.println("Transient State : "+em.contains(u)); // checking if user  has persist in EM 
		
		et.begin();
		em.persist(u); //persistent State;
		u.setName("Akash"); // whatever changes happen to user will be saved.
		System.out.println("Persistent State: "+em.contains(u));
		et.commit();
		
		u.setName("Som"); // Change is not tracked by EntityManager
		System.out.println("In Persistent State After Commit: "+em.contains(u)); //The transaction is committed, and all changes to the User entity (such as the name change to "Akash") are flushed to the database. The entity remains in the persistent state.
		
		em.detach(u);
		
		System.out.println("Detached State: "+em.contains(u));
	}
}
