package one_to_one_bidirectional;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class CreateAndMapPersonAndPanCard {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("devel");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Person p = new Person();
		p.setName("som");
		p.setEmail("som@gmail.com");
		
		PanCard pc = new PanCard();
		pc.setPanNo("HSBLD4949A");
		pc.setPinCode(560004);
		
		p.setPanCard(pc);
		pc.setPerson(p);
		
		et.begin();
		em.persist(p);
		em.persist(pc);
		et.commit();
		
		
	}

}
