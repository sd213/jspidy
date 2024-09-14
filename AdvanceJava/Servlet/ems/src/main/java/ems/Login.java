package ems;

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

@WebServlet(urlPatterns = "/login",loadOnStartup = 5)
public class Login extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email = req.getParameter("email");
		String pass = req.getParameter("passw");
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","toor");
			PreparedStatement ps = con.prepareStatement("SELECT * FROM EMPS WHERE EMAIL = ? AND PASSWORD = ?");
			ps.setString(1,email);
			ps.setString(2,pass);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				System.out.println(rs.getString(3));

				System.out.println(rs.getString(4));
//				if(rs.getString(3).equals(email) && rs.getString(4).equals(pass)) { // no need as statement we send contains and operation of both email and password , so if we get query back that means email with specified password matched/found
					System.out.println("hello");
					ps.close();
					rs.close();
					ps=con.prepareStatement("SELECT * FROM EMPS");
					rs=ps.executeQuery();
					req.setAttribute("resultset", rs);
					RequestDispatcher rd = req.getRequestDispatcher("Home.jsp");
					
					rd.forward(req, resp);
//				}
				
			}
			else {
				PrintWriter pw = resp.getWriter();
				pw.write("<html> <body> <h1 style='text-align:center;color:red'> Invalid Credentials</h1></body></html>");
				RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
				
//				rd.forward(req, resp);
				rd.include(req, resp);
				pw.write("<html> <body> <h1 style='text-align:center;color:red'> Invalid Credentials</h1></body></html>");
				
				System.out.println("A failed Logged In");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
		System.out.println(email);
		System.out.println(pass);
//		super.doGet(req, resp);
	}
}
