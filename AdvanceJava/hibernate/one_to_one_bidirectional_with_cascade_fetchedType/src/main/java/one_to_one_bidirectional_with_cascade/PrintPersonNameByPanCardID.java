package one_to_one_bidirectional_with_cascade;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class PrintPersonNameByPanCardID {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("devel");
		EntityManager em = emf.createEntityManager();
		
		int pan_key=1;
		PanCard pan = em.find(PanCard.class,pan_key);
		Person person = pan.getPerson();
		System.out.println(person);
		
		
	}

}
