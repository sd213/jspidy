package one_to_many_unique;


import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ViewStateUsingStateID {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("devel");
		EntityManager em = emf.createEntityManager();
		int District = 1;
		State o = em.find(State.class,23);
		List<one_to_many_unique.District> dislist = o.getDistricts();
		
		System.out.println(o);
		System.out.println(dislist);
	}
}
