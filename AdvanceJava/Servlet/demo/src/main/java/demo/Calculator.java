package demo;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Calculator extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Calculator");
		Double d1 = Double.parseDouble(req.getParameter("inp1")); 
		Double d2 = Double.parseDouble(req.getParameter("inp2"));
		String opera1 = req.getParameter("operat1");
		System.out.println(d1+" "+opera1+" "+d2);
		Double result = 0.0;
		switch(opera1) {
		case "+":
			result = d1+d2;
			break;
		case "-":
			result = d1-d2;
			break;
		case "*":
			result = d1*d2;
			break;
		case "/":
			result = d1/d2;
			break;
		default:
				System.out.println("Given Operator type is not present");
		}
		System.out.println("Resultant of Opration is "+result);
	}
	
}
