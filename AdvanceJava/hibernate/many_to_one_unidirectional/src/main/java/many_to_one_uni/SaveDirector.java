package many_to_one_uni;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class SaveDirector {
	
	public static void main(String[] args) {
		Director d = new Director();
		d.setId(1);
		d.setName("S.S RajMouli");
		d.setIndustry("TollyWood");
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		em.persist(d);
		et.commit();
	}
}
