package many_to_one_uni;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class DeleteDirectorByMovieID {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		int mid=1;
		
		Movie m = em.find(Movie.class, mid);
		Director d = m.getDirector();
		m.setDirector(null);
		
		Query q = em.createQuery("FROM Movie");
		List<Movie> listMovie = q.getResultList();
		
		for(Movie mov : listMovie) {
			if(mov.getDirector()==d) {
				mov.setDirector(null);
				et.begin();
				em.merge(mov);
				et.commit();
			}
		}
	
		et.begin();
		em.remove(d);
		et.commit();
	}
}
