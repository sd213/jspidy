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

@WebServlet(urlPatterns = "/UPDATE")
public class UpdateServlet  extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(req.getParameter("id"));
		int id = Integer.parseInt(req.getParameter("id"));
		
		
//		if(req.getParameter("name")==null||req.getParameter("email")==null||req.getParameter("deptid") ==null||req.getParameter("sal")== null || req.getParameter("pass")==null) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","toor");
				PreparedStatement ps=con.prepareStatement("SELECT * FROM EMPS WHERE ID = "+id);
				ResultSet rs=ps.executeQuery();
				req.setAttribute("resultset", rs);
				RequestDispatcher rd = req.getRequestDispatcher("UpdateEmp.jsp");
				rd.forward(req, resp);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
//		else {		}
//	}
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
			System.out.println("Password Equal");
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","toor");
				PreparedStatement ps = con.prepareStatement("UPDATE EMPS SET NAME=?,EMAIL=?,PASSWORD=?,DEPTID=?,SAL=? WHERE ID = ?");
//									
				ps.setString(1, name);
				ps.setString(2, email);
				ps.setString(3,pass);
				ps.setInt(4,deptId);
				ps.setDouble(5, salary);
				ps.setInt(6, id);
				int row = ps.executeUpdate();
				System.out.println(row+ " row affected");
				
				ps.close();
				ps=con.prepareStatement("SELECT * FROM EMPS");
				ResultSet rs=ps.executeQuery();
				req.setAttribute("resultset", rs);
				RequestDispatcher rd = req.getRequestDispatcher("Home.jsp");
				rd.forward(req, resp);
				
			}
			catch(com.mysql.cj.jdbc.exceptions.MysqlDataTruncation e) {
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
				
			}
			
		
	}
	else {
			PrintWriter pw = resp.getWriter();
			pw.write("<html> <body> <h1 style='text-align:center;color:red'> Passwords Do Not Match</h1></body></html>");
			System.out.println("A failed Register");
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","toor");
				PreparedStatement ps=con.prepareStatement("SELECT * FROM EMPS WHERE ID = "+id);
				ResultSet rs=ps.executeQuery();
				req.setAttribute("resultset", rs);
				RequestDispatcher rd = req.getRequestDispatcher("UpdateEmp.jsp");
				rd.include(req, resp);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
	}
	
	}
}
