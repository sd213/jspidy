package hibernate_LifeCycle;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class TPDTest2 {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
//		System.out.println("In Detached State: "+em.contains(u));
		//Detached State
		User u = em.find(User.class, 1);
		System.out.println("Persistent State: "+em.contains(u));
		
		et.begin();
		System.out.println("Persistent State: "+em.contains(u));
		em.remove(u); //Persistent State

		
		
		et.commit();
		
		System.out.println("Persistent State After Remove: "+em.contains(u));
	}
}
