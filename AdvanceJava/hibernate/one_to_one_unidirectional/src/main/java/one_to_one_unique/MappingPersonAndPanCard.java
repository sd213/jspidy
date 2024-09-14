package one_to_one_unique;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class MappingPersonAndPanCard {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("devel");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Person p = em.find(Person.class,103);
		PanCard pan = em.find(PanCard.class, 133);
		p.setPanCard(pan);
		
		et.begin();
		em.persist(p);
		et.commit();
	}
}
