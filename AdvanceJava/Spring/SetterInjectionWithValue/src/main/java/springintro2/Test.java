package springintro2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String[] args) {
		Resource r = new ClassPathResource("config.xml");
		
		BeanFactory bfac = new XmlBeanFactory(r);
		
//		System.out.println(bfac.getBean("developer"));
//		System.out.println(bfac.getBean("laptop"));
//		System.out.println(bfac.getBean("desktop"));
		
		Developer dev = (Developer) bfac.getBean("developer");
		Laptop lap = (Laptop) bfac.getBean("laptop");
		Desktop desk = (Desktop) bfac.getBean("desktop");
		
		
		System.out.println("Developer Reference :- "+dev);
		System.out.println("Developer Name :- "+dev.develname);
		System.out.println("Laptop Reference :- "+lap);
		System.out.println("Desktop Reference :- "+desk);
	}
}
