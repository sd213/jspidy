package mobilemanf;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestRunner {
	public static void main(String[] args) {
		System.out.println("Start");
		ApplicationContext ac = new AnnotationConfigApplicationContext(Configuration.class);
		

		Sim s = ac.getBean(Sim.class);
		s.setId(39);
		s.setCompany("Airtel");
		System.out.println(s);
		
		Mobile m = ac.getBean(Mobile.class);
		m.setBrand("Apple");
		System.out.println(m);
		System.out.println(m.getSim());
		
		
		System.out.println("End");
	}
}
