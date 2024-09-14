package many_to_one_uni;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class SaveMovie {
	public static void main(String[] args) {
		
		Movie m1 = new Movie();
		m1.setId(1);
		m1.setName("Bahubali");
		m1.setYor("2014");
		
		Movie m2 = new Movie();
		m2.setId(2);
		m2.setName("Bahubali 2 The Conclusion");
		m2.setYor("2016");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		em.persist(m1);
		em.persist(m2);
		et.commit();
		
	}
}
