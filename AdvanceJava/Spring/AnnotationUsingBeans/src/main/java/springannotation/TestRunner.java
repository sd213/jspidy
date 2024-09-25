package springannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestRunner {

	public static void main(String[] args) {
		
		System.out.println("Start");
		ApplicationContext acp = new AnnotationConfigApplicationContext(Config.class);
		//Mobile Class No Arg Constructor...
		//Person Class No Arg Constructor...
		//Here both Class get ready
		System.out.println("End");
	}

}
