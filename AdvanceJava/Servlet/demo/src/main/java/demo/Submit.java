package demo;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Submit extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Name: "+req.getParameter("name"));

		System.out.println("Email: "+req.getParameter("email"));
		System.out.println("Age: "+req.getParameter("age"));
		System.out.println("Gender: "+req.getParameter("gender"));
		System.out.println("Comments : "+req.getParameter("comments"));
	}
	
}
