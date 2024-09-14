package one_to_one_bidirectional_with_cascade;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class DeletePanCardOnlyByPersonID {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("devel");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		int per_id = 2;
		Person person = em.find(Person.class, per_id);
		PanCard pan = person.getPanCard();
		
		person.setPanCard(null);
		pan.setPerson(null);
		et.begin();
		em.merge(person);
		em.remove(pan);
		et.commit();
	}
}
