package pms;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/update")
public class UpdateProducts extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		try {
			Class.forName("org.postgresql.Driver");
			String url = "jdbc:postgresql://localhost/pms1";
			Connection conn = DriverManager.getConnection(url,"postgres","root");
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM public.products WHERE ID = "+id);
			ResultSet rs = ps.executeQuery();
			req.setAttribute("rset", rs);
			RequestDispatcher rd = req.getRequestDispatcher("UpdateProducts.jsp");
			rd.forward(req, resp);
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		super.doGet(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		String details = req.getParameter("details");
		String catagory = req.getParameter("catagory");
		Double price = Double.parseDouble(req.getParameter("price"));
		try {
			Class.forName("org.postgresql.Driver");
			Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/pms1","postgres","root");
			PreparedStatement ps = conn.prepareStatement("UPDATE public.products SET NAME = ?, DETAILS = ?, CATAGORY= ?, PRICE= ? WHERE ID = ? ");
			ps.setInt(5, id);
			ps.setString(1, name);
			ps.setString(2, details);
			ps.setString(3, catagory);
			ps.setDouble(4, price);
			int row = ps.executeUpdate();
			System.out.println(row + " rows affected... ");
			ps.close();
			ps = conn.prepareStatement("SELECT * FROM public.products ORDER BY id");
			ResultSet rs = ps.executeQuery();
			req.setAttribute("rset", rs);
			RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
			rd.forward(req, resp);
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
