package many_to_many_bidirectional;

import java.util.ArrayList;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class CreateAndMapStudentsAndBatches {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Student s1 = new Student();
		s1.setName("Chintu");
		
		Student s2 = new Student();
		s2.setName("Priyanka");

		Student s3 = new Student();
		s3.setName("Ramesh");
		
		Student s4 = new Student();
		s4.setName("Ranjit");
		
		Student s5 = new Student();
		s5.setName("Somit");
		
//	Batches	
		Batch b1 = new Batch();
		b1.setName("C");
	
		Batch b2 = new Batch();
		b2.setName("Java");
		
		Batch b3 = new Batch();
		b3.setName("C++");
		
		Batch b4= new Batch();
		b4.setName("Spring and Springboot");
		
		Batch b5 = new Batch();
		b5.setName("SQL");

	   ArrayList<Student>sl1 = new ArrayList<Student>();
	   sl1.add(s1);
	   sl1.add(s2);
	   sl1.add(s3);
	   sl1.add(s5);
	   
	   ArrayList<Student>sl2 = new ArrayList<Student>();
	   sl2.add(s5);
	   sl2.add(s4);
	   
	   ArrayList<Batch> bl1 = new ArrayList<Batch>();
	   bl1.add(b2);
	   bl1.add(b4);
	   bl1.add(b5);
	   
	   ArrayList<Batch> bl2 = new ArrayList<Batch>();
	   bl2.add(b1);
	   bl2.add(b3);
	   
	   ArrayList<Batch> all = new ArrayList<Batch>();
	   all.add(b1);
	   all.add(b2);
	   all.add(b3);
	   all.add(b4);
	   all.add(b5);
	
	   b1.setStudents(sl2);
	   b3.setStudents(sl2);
	   
	   s4.setBatches(bl2);
	   
	   
	   
	   b2.setStudents(sl1);
	   b4.setStudents(sl1);
	   b5.setStudents(sl1);
	   
	   s1.setBatches(bl1);
	   s2.setBatches(bl1);
	   s3.setBatches(bl1);
	   
	   s5.setBatches(all);
	
	   
	     
	    et.begin();
	    em.persist(s1);
	    em.persist(s2);
	    em.persist(s3);
	    em.persist(s4);
	    em.persist(s5);
	    em.persist(b1);
	    em.persist(b2);
	    em.persist(b3);
	    em.persist(b4);
	    em.persist(b5);
	
	    et.commit();
	}

}
