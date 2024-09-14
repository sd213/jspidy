package one_to_one_bidirectional_with_cascade;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class DeletePersonPanCardbyPersonId {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("devel");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		int person_key=1;
		Person pers = em.find(Person.class,person_key);
		PanCard pan = pers.getPanCard();
		System.out.println(pers);
		System.out.println(pan);
		
		et.begin();
		em.remove(pan);
		em.remove(pers);
		et.commit();
		
		
		
	}
}
