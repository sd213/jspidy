package springintro;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Library {
	public static void main(String[] args) {
		Resource res = new ClassPathResource("config.xml");
		BeanFactory bFactory = new XmlBeanFactory(res);
		
		System.out.println(bFactory.getBean("author"));
		System.out.println(bFactory.getBean("book"));
	}
}

