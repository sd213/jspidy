package one_to_many_bidirectional;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class DeletePersonCarsByPersonID {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("devel");
		EntityManager em  = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		int pid = 4;
		Person p = em.find(Person.class, pid);
//		List<Car> lc = p.getCars();
//		for(Car c:lc) {
//			et.begin();
//				em.remove(c);
//			et.commit();
//		} // not necessary this code
		et.begin();
		
		em.remove(p);
		et.commit();

	}
}
