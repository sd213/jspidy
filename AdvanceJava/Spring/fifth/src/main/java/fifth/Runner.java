package fifth;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Runner {
	public static void main(String[] args) {
		System.out.println("Start");
		//Spring beans created using BeanFactory 
//		Resource res = new ClassPathResource("configuration.xml");
//		BeanFactory fact = new XmlBeanFactory(res);
//		fact.getBean("m");// lazy instantiation
		
		//Spring beans created using Application Context
		ApplicationContext ac = new ClassPathXmlApplicationContext("configuration.xml");
		Mobile m1 = ac.getBean(Mobile.class);
		Mobile m2 = (Mobile) ac.getBean("m");
		Mobile m3 = ac.getBean(Mobile.class);
		Mobile m4 = (Mobile) ac.getBean("m");
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
		
		System.out.println("End");
	}
}
