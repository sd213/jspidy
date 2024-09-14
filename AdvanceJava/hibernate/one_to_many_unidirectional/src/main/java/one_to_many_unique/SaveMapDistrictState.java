package one_to_many_unique;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class SaveMapDistrictState {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("devel");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		State st = new State();
		st.setId(24);
		st.setName("TamilNadu");
		st.setCapital("Chennai");
		
		District dt1 = new District(4,"Coimbatore");
		District dt2 = new District(5,"Erode");
		District dt3 = new District(6, "Krishnagiri");
		
		List<District> dl = new ArrayList<District>();
		dl.add(dt1);
		dl.add(dt2);
		dl.add(dt3);
		
		st.setDistricts(dl);
		et.begin();
		em.persist(dt1);

		em.persist(dt2);

		em.persist(dt3);
		em.persist(st);
		et.commit();
		
	}
}
