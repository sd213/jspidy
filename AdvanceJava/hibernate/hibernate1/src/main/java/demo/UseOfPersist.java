package demo;

import java.util.Scanner;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class UseOfPersist {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How Many Users/Records You want to Save :- ");
		int id;
		String name, email,pass;
		Long phone;
		int rows = sc.nextInt();
		if(rows>=1) {
			for(int i = 1; i<=rows ;i++) { 
				System.out.print("Enter ID : ");
				id = sc.nextInt();
				  // Consume the leftover newline
		        sc.nextLine();
				System.out.print("Enter Name : ");
				name = sc.nextLine();
				;
				System.out.print("Enter Email : ");
				email = sc.next();
				System.out.print("Enter Password : ");
				pass = sc.next();

				System.out.print("Enter Phonenum : ");
				phone = sc.nextLong();
				
				CreateorSaveUserasRow(id, name, email, phone, pass);
			}
		}
	}
	public static void CreateorSaveUserasRow(	int id,String name,String email,Long phone,String pass) {
		User u = new User();
		
		u.setId(id);
		u.setName(name);
		u.setEmail(email);
		u.setPhone(phone);
		u.setPassword(pass);
		System.out.println(u);
	
		
		
		EntityManagerFactory emf =  Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin(); 
		em.persist(u);
		et.commit();
		System.out.println("Done...");
	}
}
