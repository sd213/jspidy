package many_to_many_bidirectional;

import java.util.Iterator;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ViewBatchByStudentID {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		
		int sid = 1;
		Student s = em.find(Student.class, sid);
		System.out.println(s);
		List<Batch> b = s.getBatches();
	
		Iterator<Batch>  i = b.listIterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
