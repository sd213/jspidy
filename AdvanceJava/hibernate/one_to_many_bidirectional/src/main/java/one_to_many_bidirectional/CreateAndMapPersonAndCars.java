package one_to_many_bidirectional;

import java.util.ArrayList;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class CreateAndMapPersonAndCars {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("devel");
		EntityManager em  = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Person p = new Person();
		p.setName("smith");
		p.setEmail("smith@gmail.com");
		
		Car c1 = new Car();
		c1.setName("Porsche");
		c1.setColor("Olive Green");
		c1.setPrice(200);
		c1.setPerson(p);
		
		Car c2 = new Car();
		c2.setName("BMW");
		c2.setColor("Gray");
		c2.setPrice(2000000000000000.00d);
		c2.setPerson(p);
		
		Car c3 = new Car();
		c3.setName("Rolls Royce");
		c3.setColor("Red");
		c3.setPrice(95596969696699795.00d);
		c3.setPerson(p);
		
		Car c4= new Car();
		c4.setName("Jaguar");
		c4.setColor("black");
		c4.setPrice(95596969696.00d);
		c4.setPerson(p);
		
		ArrayList<Car> ac = new ArrayList<Car>();
		ac.add(c1);
		ac.add(c2);
		ac.add(c3);
		ac.add(c4);
		
		p.setCars(ac);
		
		et.begin();
		em.persist(p);

		et.commit();
		
	}
}
