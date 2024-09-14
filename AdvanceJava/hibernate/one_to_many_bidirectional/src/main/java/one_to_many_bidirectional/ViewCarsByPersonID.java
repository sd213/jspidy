package one_to_many_bidirectional;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ViewCarsByPersonID {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("devel");
		EntityManager em  = emf.createEntityManager();
		
		int pid = 1;
		
		Person p = em.find(Person.class, pid);
		List<Car> lc = p.getCars();
		
		System.out.println("Person :- "+p);
		System.out.println("Cars:- "+lc);
	}

}
