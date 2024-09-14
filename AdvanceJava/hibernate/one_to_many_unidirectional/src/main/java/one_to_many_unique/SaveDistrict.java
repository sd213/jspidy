package one_to_many_unique;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
public class SaveDistrict {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("devel");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		District dt = new District();
		dt.setId(1);
		dt.setName("Jajpur");
		
		District dt2 = new District(2,"Cuttack");
		
		District dt3 = new District(3,"Bhadrak");
		
		
		et.begin();
		em.persist(dt);
		em.persist(dt2);
		em.persist(dt3);
		et.commit();
	}
}
