package demo;

import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class UseOfCreateQuery2 {

	public static void main(String[] args) {

		EntityManagerFactory emf =  Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Query q1 = em.createQuery("SELECT t from User t where t.name='Puspa'"); //static Query
		List<User> list1 = q1.getResultList();
//		System.out.println(list1);
		
		ListIterator<User> l = list1.listIterator();
		while(l.hasNext()) {
			System.out.println("\n"+l.next());
		}
		
		for(User u:list1) {
			System.out.println("\n"+u);
		}
		
		
		Query q2 = em.createQuery("SELECT u from User u  where u.name=?1 "); //dynamic Query
		System.out.println("Enter Name ");
		q2.setParameter(1, new Scanner(System.in).next());
		List<User> list2 = q2.getResultList();
		
		for(User u : list2) {
			System.out.println("\n"+u);
		}
		
//		Query q3 = em.createQuery("SELECT u from User u  where u.name=?21"); // org.hibernate.QueryException: Expected ordinal parameter labels to start with 1, but found - 21
//		q3.setParameter(21, "Puspa");
//		List<User> list3 = q3.getResultList();
//		
//		for(User u : list3) {
//			System.out.println("\n"+u);
//		}
		
		
		Query q4 = em.createQuery("SELECT u from User u  where u.name=:name and u.email = :email ");
		System.out.println("Enter Name ");
		q4.setParameter("name",new Scanner(System.in).next());
		
		System.out.println("Enter Email ");
		q4.setParameter("email",new Scanner(System.in).next());
		
		List<User> list4= q4.getResultList();
		
		for(User u : list4) {
			System.out.println("\n"+u);
		}
		
	}
	

	
}
