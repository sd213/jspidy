package springmvc1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	@RequestMapping("/hello")
	public String hello() {
		System.out.println("Hello Method Invoked .... ");
		return "hello.jsp";
	}
	
	@RequestMapping("/hi")
	public String hi() {
		System.out.println("Hi Method Invoked...");
		return "hi.jsp";
	}
}
