package demo2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SubServlet  extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String ns1 = req.getParameter("num1");

		String ns2 = req.getParameter("num2");
		
		int n1 = Integer.parseInt(ns1);
		int n2 = Integer.parseInt(ns2);
		
		int r = n1 - n2;
		System.out.println("R: "+r);
		PrintWriter pw = res.getWriter();
		pw.write("<html><body><h1 style='font-size:50px;'>"+r+"</h1></body></html>");
	}
	
}
