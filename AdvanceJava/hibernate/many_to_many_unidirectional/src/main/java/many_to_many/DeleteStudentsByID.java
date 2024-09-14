package many_to_many;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class DeleteStudentsByID {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("devel");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		int sid = 2;
		Student foundStudent = em.find(Student.class, sid);
		
		Query q = em.createQuery("FROM Batch");
		List<Batch> batchList = q.getResultList();
		for(Batch b : batchList) {
			List<Student> bs = b.getStudents();
			List<Student> updateStudentList = new ArrayList<Student>();
			for(Student s : bs) {
				if(s.getId()!=sid) {
					updateStudentList.add(s);
				}
			}
			b.setStudents(updateStudentList);
			et.begin();
			em.merge(b);
			et.commit();
		}
		et.begin();
		em.remove(foundStudent);
		et.commit();
	}
}
