package one_to_one_bidirectional;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ViewPersonPanCardbyPersonID {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("devel");
		EntityManager em = emf.createEntityManager();
		
		PanCard pan = em.find(PanCard.class, 1);
		Person person = pan.getPerson();
		System.out.println(pan + " "+ person);
	}
}
