package many_to_many;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class FindBatchsByStudentID {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("devel");
		EntityManager em = emf.createEntityManager();
		int sid = 2;
		Query q = em.createQuery("from Batch");
		Student GivenStudent = em.find(Student.class, sid);
		System.out.println(GivenStudent);
		List<Batch> bl = q.getResultList();
		for(Batch b: bl) {
			List<Student> sl= b.getStudents();
			for(Student s: sl) {
				if(s.getId()==sid) {
					System.out.println(s.getName()+" ---> "+b.getName());
				}
			}
		}
		
		
	}
}
