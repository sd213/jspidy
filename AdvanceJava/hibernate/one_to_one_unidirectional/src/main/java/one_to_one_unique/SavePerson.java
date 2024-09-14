package one_to_one_unique;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class SavePerson {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("devel");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Person p = new Person();
		p.setId(103);
		p.setEmail("som@gmail.com");
		p.setName("som");
		p.setPassword("mos");
//		p.setPanCard(new PanCard(132,"HSKDK349349",754023)); // not possible this way
		p.setPanCard(null);
		p.setPhone(7605948685L);
		
		et.begin();
		em.persist(p);
		et.commit();
	}
}
