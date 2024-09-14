package taskmanagementhibernate;

import java.util.Scanner;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class SaveTask {
	
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
					System.out.println("Creating Task");
					createTask(em,et);
					break;
			case 2:
					System.out.println("Updating Task");
					updateTask(em,et);
					break;
					
			case 3:
					System.out.println("Viewing Task");
					viewTask(em);
					break;
					
			case 4:
					System.out.println("Removing Task");
					removeTask(em,et);
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
	private static void createTask(EntityManager em, EntityTransaction et) {
		Task t = new Task();
		System.out.print("Enter ID :- ");
		t.setId(sc.nextInt());
		sc.nextLine();
		System.out.print("Enter Title:- ");
		t.setTitle(sc.nextLine());
		System.out.print("Enter Description");
		t.setDes(sc.nextLine());
		et.begin();
		em.persist(t);
		et.commit();
		
	}
	private static void updateTask(EntityManager em, EntityTransaction et) {
		System.out.print("Enter Task ID :- ");
		Task t = em.find(Task.class, sc.nextInt());
		sc.nextLine();
		if(t!=null) {
			et.begin();
			int choice;
			do {
				System.out.println("Enter Choice\n 1.Update Title\n 2.Update Description\n 0.To exit\n Choice  : ");
				choice = sc.nextInt();
				sc.nextLine();
				switch(choice){
				case 1: 
					System.out.print("Enter new Title :- ");
					t.setTitle(sc.nextLine());
					break;
				case 2:
					System.out.print("Enter new Description :- ");
					t.setDes(sc.nextLine());
					break;
				case 0:
					choice = 0;
					break;
				default:
					System.out.println("Invalid Choice");
				}
			}while(choice !=0);
			em.merge(t);
			et.commit();
		}else {
			System.out.println("Task does not exist with given ID ");
		}
		
	}
	private static void viewTask(EntityManager em) {
		// TODO Auto-generated method stub
		System.out.print("Enter Task ID :- ");
		Task t = em.find(Task.class, sc.nextInt());
		if(t!=null) {
			System.out.println(t);
		}else {
			System.out.println("Task does not exist with given ID ");
		}
		
	}
	private static void removeTask(EntityManager em, EntityTransaction et) {
		System.out.print("Enter Task ID :- ");
		Task t = em.find(Task.class, sc.nextInt());
		if(t!=null) {
			et.begin();
			em.remove(t);
			et.commit();
			
			
		}else {
			System.out.println("Task does not exist with given ID ");
		}
		
	}
	
}
