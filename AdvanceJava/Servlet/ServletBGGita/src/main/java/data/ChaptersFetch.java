package data;

import java.io.IOException;
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
@WebServlet(urlPatterns = "/chaps")
public class ChaptersFetch extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(req.getParameter("chapterwise"));
		String chtr=req.getParameter("chapterwise"); 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bg","root","toor");
			PreparedStatement ps = con.prepareStatement("SELECT VERSE_NUMBER,CHAPTER_NUMBER FROM "+chtr);

			ResultSet rs = ps.executeQuery();
			
			req.setAttribute("resultset", rs);
			RequestDispatcher rd = req.getRequestDispatcher("chapters.jsp");
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
