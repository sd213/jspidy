package springmvc2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MySecondController {

	@RequestMapping("/hi")
	public String hi() {
		System.out.println("hi method invoked");
		return "hi.jsp";
	}
//	@RequestMapping("/print")
//	public String print(@RequestParam String name,@RequestParam String place) {
//		System.out.println(name+"\n"+place);
//		System.out.println("Print Method Invoked");
//		return "print.jsp"; //MODEL GETS RETURNED AS IN STRING 
//	}
	@RequestMapping("/print")
	public ModelAndView print(@RequestParam String name,@RequestParam String place) {
		System.out.println("Print Method Invoked");
		System.out.println(name+"\n"+place);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("print.jsp");
		mv.addObject("name",name);
		mv.addObject("place",place);
		return mv; // MODEL WITH PROPERTIES NAME AND PLACE GET RETURNED
	}
	
	@RequestMapping("/print2")
	public ModelAndView print2(@RequestParam String name, @RequestParam String phonenum,@RequestParam String email,@RequestParam String passw , @RequestParam String place) {
		System.out.println("Print2 Method Invoked");
		System.out.println(name+"\n"+place+"\n"+email+"\n"+passw+"\n"+phonenum);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("print2.jsp");
		mv.addObject("name",name);
		mv.addObject("place",place);
		mv.addObject("email",email);
		mv.addObject("phonenum",phonenum);
		mv.addObject("passwd",passw);
		return mv; // MODEL WITH PROPERTIES NAME AND PLACE GET RETURNED

	}
	@RequestMapping("/calculator")
	public ModelAndView calculator() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("calculator.jsp");
		return mv;
	}

//	@RequestMapping("/addition")
//	public ModelAndView addition(@RequestParam long num1 , @RequestParam long num2) {
//		firstway of accepting as RequestParam
//		int n1 = Integer.parseInt(num1);
//		int n2 = Integer.parseInt(num2);
//		int sum = n1+n2;
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("calculate-result.jsp");
//	    mv.addObject("operation","sum");
//		mv.addObject("total",sum);
//		return mv;
//	}
	
	@RequestMapping("/addition")
	public ModelAndView addition(@RequestParam long num1 , @RequestParam long num2) {
		System.out.println("Second Way");
		long sum = num1+num2;
		ModelAndView mv = new ModelAndView();
		mv.setViewName("calculator.jsp");
		mv.addObject("operation","Sum");
		mv.addObject("total",sum);
		return mv;
	}
	@RequestMapping("/multiply")
	public ModelAndView multiply(@RequestParam long num1 , @RequestParam long num2) {
		System.out.println("Second Way");
		long multi = num1*num2;
		ModelAndView mv = new ModelAndView();
		mv.setViewName("calculator.jsp");
		mv.addObject("operation","Multiplication");
		mv.addObject("total",multi);
		return mv;
	}
	
	@RequestMapping("/substract")
	public ModelAndView substract(@RequestParam long num1 , @RequestParam long num2) {
		System.out.println("Second Way");
		long sub = num1-num2;
		ModelAndView mv = new ModelAndView();
		mv.setViewName("calculate-result.jsp");
		mv.addObject("operation","Substract");
		mv.addObject("total",sub);
		return mv;
	}
	@RequestMapping("/divide")
	public ModelAndView divide(@RequestParam double num1 , @RequestParam double num2) {
		System.out.println("Second Way");
		double div = num1/num2;
		ModelAndView mv = new ModelAndView();
		mv.setViewName("calculate-result.jsp");
		mv.addObject("operation","Division");
		mv.addObject("total",div);
		return mv;
	}
}
