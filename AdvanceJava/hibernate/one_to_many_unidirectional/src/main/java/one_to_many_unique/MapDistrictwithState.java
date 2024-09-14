package one_to_many_unique;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class MapDistrictwithState {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("devel");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		State st = em.find(State.class, 23);
		District d1 = em.find(District.class, 1);
		District d2 = em.find(District.class, 2);

		District d3 = em.find(District.class, 3);
		
		List<District> ad = new ArrayList<District>();
		ad.add(d1);
		ad.add(d2);
		ad.add(d3);
		
		st.setDistricts(ad);
		et.begin();
		
		em.merge(st);
		et.commit();
	}
}
