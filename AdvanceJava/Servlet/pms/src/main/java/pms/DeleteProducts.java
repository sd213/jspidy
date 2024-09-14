package pms;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/delete")
public class DeleteProducts extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id = Integer.parseInt(req.getParameter("id"));
		try {
			Class.forName("org.postgresql.Driver");
			String url = "jdbc:postgresql://localhost/pms1";
			Connection conn = DriverManager.getConnection(url,"postgres","root");
			PreparedStatement ps = conn.prepareStatement("DELETE FROM public.products WHERE ID = "+id);
			int row  = ps.executeUpdate();
			
			System.out.println("ROW Affected");
			
			ps.close();
			ps = conn.prepareStatement("SELECT * FROM public.products");
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
