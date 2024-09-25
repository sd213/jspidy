package ums;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import mms.Mobile;
import mms.Sim;



public class Test {
	public static void main(String[] args) {
		System.out.println("Start");
		ApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
		

		Sim s = ac.getBean(Sim.class);
		Sim s2 = ac.getBean(Sim.class);
		
		s.setId(30);
		s.setCompany("Airtel");
		System.out.println(s);
		System.out.println(s2);
		
		Mobile m = ac.getBean(Mobile.class);
		m.setBrand("Apple");
		System.out.println(m);
		System.out.println(m.getSim());
		
		User u = ac.getBean(User.class);
		System.out.println(u);
		
		System.out.println("End");
	}
}
