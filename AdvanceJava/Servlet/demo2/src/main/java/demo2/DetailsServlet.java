package demo2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class DetailsServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String age = req.getParameter("age");
		
		System.out.println(fname+ " "+lname+ "  ,  "+age);
		PrintWriter pw = res.getWriter();
		pw.write("<html><body style='background:black;'><h1 style='color:red;text-align:center;'>"+fname+ " "+lname+ "  ,  "+age+"</h1></body></html>");
		
	}

}
