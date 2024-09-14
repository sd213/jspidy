package many_to_one_uni;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class ViewDirectorByMovies {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		
		int mid=1;
		Movie m = em.find(Movie.class, mid);
	
		Director d = m.getDirector();
		System.out.println(m);
		System.out.println(d);
	}
}
