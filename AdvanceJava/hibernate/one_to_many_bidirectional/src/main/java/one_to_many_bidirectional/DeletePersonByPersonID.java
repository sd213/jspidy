package one_to_many_bidirectional;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class DeletePersonByPersonID { // only person gets deleted
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("devel");
		EntityManager em  = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		int pid = 1;
		Person p = em.find(Person.class, pid);
		System.out.println(p);
		List<Car> lc = p.getCars();
		if(lc!=null) {
			for(Car c:lc) {
				c.setPerson(null);
				System.out.println(c);
				et.begin();
					em.merge(c);
				et.commit();
			}
		}
//		List<Car> lc2 = new ArrayList<Car>();
//		p.setCars(lc2);
		p.setCars(null);
		et.begin();
		em.merge(p);
	
		et.commit();
		et.begin();
		em.merge(p);
		em.remove(p);
		et.commit();
	}
}
