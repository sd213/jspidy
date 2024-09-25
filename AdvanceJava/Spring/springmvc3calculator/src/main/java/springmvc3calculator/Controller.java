package springmvc3calculator;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {
	@RequestMapping("/calc")
	public String calc() {
		System.out.println("Calc Method Invoked .... ");
		return "calculator.jsp";
	}
	
	
	
}
