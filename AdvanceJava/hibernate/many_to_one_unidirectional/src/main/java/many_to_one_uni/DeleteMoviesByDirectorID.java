package many_to_one_uni;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class DeleteMoviesByDirectorID {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		int did=1;
		
	
		Director d = em.find(Director.class, 1);
		System.out.println(d);
		Query q = em.createQuery("FROM Movie");
		
		List<Movie> lm = q.getResultList();
		
		for(Movie m : lm) {
			if(m.getDirector().getId()==did) {
				et.begin();
				em.remove(m);
				et.commit();
			}
		}
		
	}
}
