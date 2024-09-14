package one_to_one_unique;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class SavePanCard {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("devel");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		PanCard pan = new PanCard(133,"CSKDK449349",754023);
		
		et.begin();
	
		em.persist(pan);
		et.commit();
	}
}
