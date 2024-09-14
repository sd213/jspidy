package personEntityManagementSystem;

import java.util.Scanner;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class PersonSaver {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		

		EntityManagerFactory emf  = Persistence.createEntityManagerFactory("devel");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		int options;
		do {
			System.out.println("Enter Options\n  1.Create Task\n  2.Update Task\n  3.View Task\n  4.Remove Task\n  0.Exit app ");
			options = sc.nextInt();
			switch(options) {
			
			case 1:
					System.out.println("Creating Person");
					createPerson(em,et);
					break;
			case 2:
					System.out.println("Updating Person");
					updatePerson(em,et);
					break;
					
			case 3:
					System.out.println("Viewing Person");
					viewPerson(em);
					break;
					
			case 4:
					System.out.println("Removing Person");
					removePerson(em,et);
					break;
					
			case 0: 
					em.close();
					emf.close();
					System.out.println("Exiting...");
					options = 0;
					break;
					
			default :
					System.out.println("Invalid Option");
			}
		}while(options != 0);
		
		

	}
	private static void createPerson(EntityManager em, EntityTransaction et) {
		// TODO Auto-generated method stub
		
	}
	private static void updatePerson(EntityManager em, EntityTransaction et) {
		// TODO Auto-generated method stub
		
	}
	private static void viewPerson(EntityManager em) {
		// TODO Auto-generated method stub
		
	}
	private static void removePerson(EntityManager em, EntityTransaction et) {
		// TODO Auto-generated method stub
		
	}

}
