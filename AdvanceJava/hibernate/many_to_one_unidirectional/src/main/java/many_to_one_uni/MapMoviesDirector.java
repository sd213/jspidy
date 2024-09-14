package many_to_one_uni;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class MapMoviesDirector {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Director d = em.find(Director.class, 1);
		Movie m1 = em.find(Movie.class, 1);
		Movie m2 = em.find(Movie.class, 2);
		
		m1.setDirector(d);
		m2.setDirector(d);
		
		et.begin();
		em.merge(m1);
		em.merge(m2);
		et.commit();
	}

}
