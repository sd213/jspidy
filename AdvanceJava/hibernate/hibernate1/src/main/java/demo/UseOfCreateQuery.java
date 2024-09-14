package demo;

import java.util.List;
import java.util.ListIterator;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class UseOfCreateQuery {

	public static void main(String[] args) {

		EntityManagerFactory emf =  Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
//		Query q1 = em.createQuery("SELECT t from User "); 
//		List<User> list1 = q1.getResultList();
//		System.out.println(list1); //exception  org.hibernate.query.SemanticException: Could not interpret path expression 't'
		
		Query q2 = em.createQuery("SELECT t from User t");
		List<User> list2 = q2.getResultList();
		System.out.println(list2);
		
		ListIterator<User> l = list2.listIterator();
		while(l.hasNext()) {
			System.out.println("\n"+l.next());
		}

		Query q3 = em.createQuery("FROM User");
		List<User> list3 = q3.getResultList();
		System.out.println(list3);
		
//		Query q4 = em.createQuery("FROM USER");
//		List<User> list4 = q4.getResultList();
//		System.out.println(list3);  //Caused by: org.hibernate.query.sqm.UnknownEntityException: Could not resolve root entity 'USER'
		
		
	}
	
}
