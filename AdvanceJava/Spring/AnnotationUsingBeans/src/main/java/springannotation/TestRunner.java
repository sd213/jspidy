package springannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start");
		ApplicationContext acp = new AnnotationConfigApplicationContext(Config.class);
		
		System.out.println("End");
	}

}
