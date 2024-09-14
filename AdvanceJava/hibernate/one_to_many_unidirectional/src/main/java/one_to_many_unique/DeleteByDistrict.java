package one_to_many_unique;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class DeleteByDistrict {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("devel");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		District districtWantoRemove = em.find(District.class, 5);
		Query q = em.createQuery("From State");
		List<State> sl = q.getResultList();
		
		for(State s:sl) {
			
			List <District> oldDistrict = s.getDistricts(); // to fetching a specific districts entities from list.
			List<District> updateDistrict = new ArrayList<District>(); // a new List Entity
			
			for(District district: oldDistrict ) {
				if(district.getId() != districtWantoRemove.getId()) {
					updateDistrict.add(district); // only add the districts which are not equqal d's id;
				}
			}
			s.setDistricts(updateDistrict); //updates district field of each states.
			
			et.begin();
			em.merge(s); //updating States.
			et.commit();
		}
		
		et.begin();
		em.remove(districtWantoRemove);
		et.commit();
	}
}
