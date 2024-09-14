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
@WebServlet(urlPatterns = "/insert")
public class InsertServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		int deptId = Integer.parseInt(req.getParameter("deptid"));
		double salary = Double.parseDouble(req.getParameter("sal"));
		String pass = req.getParameter("pass");
		System.out.println(pass);
		System.out.println(req.getParameter("passw"));
		if(pass.equals(req.getParameter("passw"))) {
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","toor");
				PreparedStatement ps = con.prepareStatement("INSERT INTO emps (id, name, email, password, deptid,sal) VALUES (?,?,?,?,?,?);");
				ps.setInt(1, id);
				ps.setString(2, name);
				ps.setString(3, email);
				ps.setString(4,pass);
				ps.setInt(5,deptId);
				ps.setDouble(6, salary);
				int row = ps.executeUpdate();
				System.out.println(row+ " row affected");
				
				ps.close();
				ps=con.prepareStatement("SELECT * FROM EMPS");
				ResultSet rs=ps.executeQuery();
				req.setAttribute("resultset", rs);
				RequestDispatcher rd = req.getRequestDispatcher("Home.jsp");
				rd.forward(req, resp);
				
			} catch(com.mysql.cj.jdbc.exceptions.MysqlDataTruncation e) {
				PrintWriter pw = resp.getWriter();
				pw.write("<html> <body> <h1 style='text-align:center;color:red'>"+e.getMessage()+"</h1></body></html>");
				
			}
			catch(java.sql.SQLIntegrityConstraintViolationException e) {
				PrintWriter pw = resp.getWriter();
				pw.write("<html> <body> <h1 style='text-align:center;color:red'> Id Already Exists so Try new One... </h1></body></html>");
				
			}
			catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}finally {
				RequestDispatcher rd = req.getRequestDispatcher("CreateEmp.jsp");
				
//				rd.forward(req, resp);
				rd.include(req, resp);
				
				System.out.println("A failed Register");
			}
			
		}
		else {
			PrintWriter pw = resp.getWriter();
			pw.write("<html> <body> <h1 style='text-align:center;color:red'> Passwords Do Not Match</h1></body></html>");
			RequestDispatcher rd = req.getRequestDispatcher("CreateEmp.jsp");
			
//			rd.forward(req, resp);
			rd.include(req, resp);
			
			System.out.println("A failed Register");
		
		}
	}
}
