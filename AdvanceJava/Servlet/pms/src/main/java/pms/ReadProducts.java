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

@WebServlet(urlPatterns = "/viewAll")
public class ReadProducts extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			Class.forName("org.postgresql.Driver");
			String url = "jdbc:postgresql://localhost/pms1";
			Properties props = new Properties();
			props.setProperty("user", "postgres");
			props.setProperty("password", "root");
			props.setProperty("ssl", "false");
			Connection conn = DriverManager.getConnection(url, props);
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM public.products ORDER BY id");
			ResultSet rs = ps.executeQuery();
			
			req.setAttribute("rset", rs);
			RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
			rd.forward(req, resp);
//			String url = "jdbc:postgresql://localhost/test?user=fred&password=secret&ssl=true";
//			Connection conn = DriverManager.getConnection(url);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
