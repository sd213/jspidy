package demo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class UseOfMerge {

	public static void main(String[] args) {
		

		User u = new User();
		
		u.setId(2);
		u.setName("Pp");
		u.setEmail("puspa@gmail.com");
		u.setPhone(98565656);
		u.setPassword("pusparasj@fire");
		System.out.println(u);
		
		EntityManagerFactory emf =  Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		em.merge(u);
		et.commit();
		
	}	

}
