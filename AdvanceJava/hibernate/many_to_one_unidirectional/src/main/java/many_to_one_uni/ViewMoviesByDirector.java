package many_to_one_uni;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class ViewMoviesByDirector {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		int did= 1;
//		Query q1 = em.createQuery("From Movie m where Movie m.director_id="+did);
//		List<String> l1 = q1.getResultList();
//		System.out.println(l1);
		
		Query q2 = em.createQuery("SELECT m FROM Movie m WHERE m.director.id = "+did);
		List<Movie> l2 = q2.getResultList();
		System.out.println(l2);
		
		Query q3 = em.createQuery("FROM Movie");
		List<Movie> l3 = q3.getResultList();
		for(Movie m:l3) {
			if(m.getDirector().getId() == did);
				System.out.println(m);
		}
		
	}
}
