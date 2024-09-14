package org.jsp;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Find {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		
		em.find(User.class, 1);
		em.find(User.class, 2);
		
		em.find(User.class, 1);
		em.find(User.class, 2);
	}

}
