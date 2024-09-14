package many_to_many;

import java.util.ArrayList;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class SaveBatchAndStudents {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("devel");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        Student s1 = new Student();
        s1.setName("Manoj");
        s1.setEmail("Manoj@gmail.com");
        s1.setPhone(394994040L);

        Student s2 = new Student();
        s2.setName("Avinash");
        s2.setEmail("Avinash@gmail.com");
        s2.setPhone(49494940030L);

        Student s3 = new Student();
        s3.setName("Mohan");
        s3.setEmail("mohan@gmail.com");
        s3.setPhone(95959959595L);

        Student s4 = new Student();
        s4.setName("Somit Das");
        s4.setEmail("smithson@gmail.com");
        s4.setPhone(9394993949L);

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(s1);
        students.add(s2);
        students.add(s3);

        ArrayList<Student> students1 = new ArrayList<Student>();
        students1.add(s1);
        students1.add(s2);
        students1.add(s4);

        Batch b1 = new Batch();
        b1.setName("Core Java");
        b1.setStudents(students);

        Batch b2 = new Batch();
        b2.setName("J2EE");
        b2.setStudents(students);

        Batch b3 = new Batch();
        b3.setName("Spring");
        b3.setStudents(students);

        Batch b4 = new Batch();
        b4.setName("DSA");
        b4.setStudents(students1);

        et.begin();
        em.persist(s1);
        em.persist(s2);
        em.persist(s3);
        em.persist(s4);
        et.commit();

        et.begin();
        em.persist(b1);
        em.persist(b2);
        em.persist(b3);
        em.persist(b4);
        et.commit();

        em.close();
        emf.close();
    }
}
