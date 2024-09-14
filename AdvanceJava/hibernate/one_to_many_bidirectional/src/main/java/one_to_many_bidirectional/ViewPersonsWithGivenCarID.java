package one_to_many_bidirectional;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ViewPersonsWithGivenCarID {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("devel");
		EntityManager em  = emf.createEntityManager();
		
		int cid = 2;
		Car c = em.find(Car.class, 2);
		System.out.println("Car :- "+c);
		
		Person p = c.getPerson();
		System.out.println("Owner:- "+p);
	}
}
