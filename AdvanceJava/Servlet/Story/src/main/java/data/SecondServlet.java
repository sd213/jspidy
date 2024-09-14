package data;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/SecondServ")
public class SecondServlet  extends HttpServlet{
	
//	@Override
//		public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
//			// TODO Auto-generated method stub
//			super.service(req, res);
//		}
	@Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Custom service logic if needed
        System.out.println("Child Method Service");
        // Call the parent service method to ensure HTTP method-specific dispatching
        super.service(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Handle GET request
        System.out.println("Do Get Method of protected doGet()");
    }
}
