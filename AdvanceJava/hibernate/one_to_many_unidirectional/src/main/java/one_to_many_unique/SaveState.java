package one_to_many_unique;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class SaveState {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("devel");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		State st = new State();
		st.setId(23);
		st.setName("Odisha");
		st.setCapital("Bhubaneswar");
		
		et.begin();
		em.persist(st);
		et.commit();
		
	}
}
