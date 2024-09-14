package many_to_many;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class FindStudentByID {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("devel");
    EntityManager em = emf.createEntityManager();
    EntityTransaction et = em.getTransaction();
   
    Student st = em.find(Student.class, 1);
   
   
    
    System.out.println(st);
   
}
}
