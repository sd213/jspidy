package loadandStartup;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/a2",loadOnStartup = 1)
public class MyServlet2 extends HttpServlet {
	
	public MyServlet2() {
		System.out.println("MyServlet2 No Arg Const ...");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		System.out.println("myServlet do GetMethod.....");
	}
}
