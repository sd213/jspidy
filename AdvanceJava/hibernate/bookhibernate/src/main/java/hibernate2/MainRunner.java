package hibernate2;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Scanner;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class MainRunner {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		

		EntityManagerFactory emf =  Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Integer choice;
		do {
			System.out.println("\nOptions:-\n\n  1. For Create and Insert\n  2. For Find Data\n  3. For Update\n  4. For Remove\n  0. To Exit");
			System.out.print("\nEnter Choice :- ");
			choice = sc.nextInt();
			
			switch(choice) {
				case 1:
						System.out.println("Creating and Inserting Data");
						UseOfPersist(em,et);
						break;
				case 2:
						System.out.println("For Finding Data");
						useOfFind(em);
						break;
				case 3:
						System.out.println("For Updating Data");
						useOfUpdate(em,et);
						break;
				case 4:
						System.out.println("Removing Data");
						useOfRemove(em,et);
						break;
				case 0:
						em.close();
						emf.close();
						System.out.println("Exiting");
						choice = null;
						break;
				default :
						System.out.println("Invalid Options");
			}
			
		}while(choice != null );
	}
	private static void UseOfPersist(EntityManager em, EntityTransaction et) {
		// TODO Auto-generated method stub
		BookStore a = new BookStore();
		System.out.print("Enter Primary Key :- ");
		a.setId(sc.nextInt());
		
		System.out.println("Enter Title :- ");
		sc.nextLine();
		a.setTitle(sc.nextLine());
		
		System.out.println("Enter Category :- ");
		
		a.setCategories(sc.nextLine());
		
		System.out.println("Enter PageCount :- ");
		a.setPageCount(sc.nextInt());
		
		System.out.println("Enter ISBN :- ");
		a.setIsbn(sc.nextLong());
		
		System.out.println("Enter Publication Date ");
		a.setPublishedDate(Date.valueOf(sc.next()));
		
		a.setAuthors(addAuthors());
		
		et.begin();
		em.persist(a);
		et.commit();
	}
	private static void useOfFind(EntityManager em) {
		// TODO Auto-generated method stub
		System.out.print("Enter Primary key :- ");
		int primarykey = sc.nextInt();
		BookStore b = (BookStore)em.find(BookStore.class, primarykey);
		if(b!=null) {
			
			System.out.println(b);
		}else {
			System.out.println("Not Found");
		}
		
	}
	private static void useOfUpdate(EntityManager em, EntityTransaction et) {
		// TODO Auto-generated method stub
		System.out.print("Enter Primary Key to See if Entry Exist :- ");
		int primarykey = sc.nextInt();
		BookStore c = (BookStore)em.find(BookStore.class,primarykey);
		System.out.println(c);
		if(c!=null) {
			System.out.println("Updating "+c.getTitle());
			et.begin();
			
			System.out.println("What You Want to Update");
			
			int count;
			do {
				System.out.println("\n  1.title\n  2.isbn\n  3.pagecount\n  4.publishedDate\n  5.categories\n  6.authors\n  0.nothing to update\n  Enter Options:- ");
				count = sc.nextInt();
				sc.nextLine();
				switch(count) {
				case 1:
						
						System.out.println("Enter Title :- ");
						c.setTitle(sc.nextLine());
						break;
				case 2:
						System.out.println("Enter ISBN :- ");
						c.setIsbn(sc.nextLong());
						sc.nextLine();
						break;
				case 3:
						System.out.println("Enter PageCount :- ");
						c.setPageCount(sc.nextInt());
						sc.nextLine();
						break;
				case 4:
						System.out.println("Enter Published Date :- ");
						c.setPublishedDate(Date.valueOf(sc.next()));
					
						break;
				case 5:
						System.out.println("Enter Categories :- ");
						c.setCategories(sc.nextLine());
						break;
				case 6:
						System.out.println("Authors ");
						c.setAuthors(addAuthors());
						break;
				case 0: 
						count = 0;
						break;
				default: 
						System.out.println("Invalid Options");
				}
			}while(count != 0);
			em.merge(c);
			et.commit();
		}else {
			System.out.println("Entry Does Not Exist");
		}
	}
	
	private static void useOfRemove(EntityManager em, EntityTransaction et) {
		// TODO Auto-generated method stub
		System.out.print("Enter Primary key :- ");
		int primarykey = sc.nextInt();
		BookStore e = (BookStore)em.find(BookStore.class, primarykey);
		System.out.println(e);
		
		if(e!=null) {
			System.out.println("Removing "+e.getTitle());
			et.begin();
			em.remove(e);
			et.commit();
		}else {
			System.out.println("That Book Entry Does not Exist");
		}
		
	}

	private static ArrayList<String> addAuthors() {
		System.out.println("Enter Author Numbers:- ");
		int ct = sc.nextInt();
		sc.nextLine();
		ArrayList<String> author = new ArrayList<String>();
		do {
		if(ct >= 1) {
			
			for(int i = 1; i<=ct;i++) {
				System.out.print("Entre Author"+i+" :-");
				
				author.add(sc.nextLine());
			}
			
		}else {
			ct = 0;
			System.out.println("Enter Correct Amount");
		}
		}while(ct == 0);
		return author;
	}
	
}
