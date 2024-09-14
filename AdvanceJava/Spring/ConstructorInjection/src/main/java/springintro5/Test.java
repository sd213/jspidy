package springintro5;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String[] args) {
		Resource r = new ClassPathResource("config.xml");
		
		BeanFactory bfac = new XmlBeanFactory(r);

		Developer dev = (Developer) bfac.getBean("developer");
	
		
		
		System.out.println(dev);
		
		dev.code();
	}
}
