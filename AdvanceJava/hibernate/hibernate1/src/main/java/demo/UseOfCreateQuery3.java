package demo;

import java.util.Scanner;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class UseOfCreateQuery3 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		EntityManagerFactory emf =  Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Query q1 = em.createQuery("SELECT t from User t where t.name=:name");
		System.out.println("Enter Name :- ");
		q1.setParameter("name", sc.next());
		System.out.println(q1.getSingleResult());
		
		
		Query q2 = em.createQuery("SELECT t from User t where t.name=:name");
		System.out.println("Enter Name :- ");
		q2.setParameter("name", sc.next());
		System.out.println(q2.getSingleResult()); // if multiple results come out the  then expetion comes that is : Exception in thread "main" jakarta.persistence.NonUniqueResultException: query did not return a unique result: 2
	}
}
