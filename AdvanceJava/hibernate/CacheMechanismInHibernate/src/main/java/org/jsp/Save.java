package org.jsp;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Save {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		User u1 = new User();
		u1.setName("Smith");
		u1.setEmail("smith@gmail.com");
		
		
		User u2 = new User();
		u2.setName("laxmi");
		u2.setEmail("laxmikant@gmail.com");
		
		User u3 = new User();
		u3.setName("Som");
		u3.setEmail("dassomit@gmail.com");
		
		et.begin();
		em.persist(u1);
		em.persist(u2);
		em.persist(u3);
		et.commit();
	}
}
