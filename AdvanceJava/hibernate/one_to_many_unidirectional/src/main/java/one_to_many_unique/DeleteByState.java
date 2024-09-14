package one_to_many_unique;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class DeleteByState {
	public static void main(String[] args) {
		

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("devel");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		State s = em.find(State.class, 23);
		et.begin();
		em.remove(s);
		et.commit();
	}
}
