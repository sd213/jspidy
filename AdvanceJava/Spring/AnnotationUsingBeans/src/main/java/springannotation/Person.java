package springannotation;

import org.springframework.stereotype.Component;

@Component
public class Person {
	public Person() {
		System.out.println("Person Class No Arg Constructor...");
	}
}
