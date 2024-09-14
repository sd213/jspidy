package many_to_many_bidirectional;

import java.util.Iterator;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ViewStudentByBatchID {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		int bid = 2;
		Batch b = em.find(Batch.class,bid);
		System.out.println(b);
		
		
		List<Student> sl = b.getStudents();
	
		Iterator<Student>  i = sl.listIterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
