package dbtest;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/allemp2")
public class AllEmpServlet2 extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		System.out.println("hdslfdkls");
		System.out.println(req.getParameter("hello"));
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","toor");
			PreparedStatement ps = con.prepareStatement("SELECT * FROM EMP");
			ResultSet rs = ps.executeQuery();
			String s="";
			
			req.setAttribute("resultset", rs);
			RequestDispatcher rd = req.getRequestDispatcher("allemp.jsp");
			rd.forward(req, resp);
			rs.close();
			ps.close();
			con.close();
		}
		catch(SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
