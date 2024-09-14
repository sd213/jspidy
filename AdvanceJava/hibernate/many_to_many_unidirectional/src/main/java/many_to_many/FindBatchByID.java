package many_to_many;

import java.rmi.StubNotFoundException;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class FindBatchByID {

	public static void main(String[] args) {
		  EntityManagerFactory emf = Persistence.createEntityManagerFactory("devel");
	        EntityManager em = emf.createEntityManager();
	        EntityTransaction et = em.getTransaction();
	       
	        Batch bt = em.find(Batch.class, 2);
	        if(bt.getStudents() instanceof ArrayList) {
	        	System.out.println("Instance Of ArrayList");
	        	System.out.println("DownCasting Should Happen");
	        }
	        List<Student> st =  bt.getStudents();
	        
	        System.out.println(bt);
	        for(Student s : st) {
	        	System.out.println(s);
	        }
	}
}
