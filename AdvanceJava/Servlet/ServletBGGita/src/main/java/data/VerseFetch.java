package data;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet(urlPatterns = "/vers")
public class VerseFetch extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		 HttpSession session = req.getSession();
//	     Set<String> accessedVersed = (Set<String>) session.getAttribute("accessedVersed");
//	        
//	        if (accessedVersed == null) {
//	            accessedVersed = new HashSet<>();
//	        }
//
//	        String vw = req.getParameter("versewise");
//	        accessedVersed.add(vw);
//	        session.setAttribute("accessedVersed", accessedVersed);
	        
		System.out.println(req.getParameter("chapterwise"));
		System.out.println(req.getParameter("versewise"));
		String chtr=req.getParameter("chapterwise"); 
		String num = req.getParameter("versewise");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			PreparedStatement ps=null;
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bg","root","toor");
//			if(Integer.parseInt(chtr)==1) {
				ps = con.prepareStatement("SELECT TEXT FROM CHAPTER"+chtr+" WHERE VERSE_NUMBER="+num);

//				
//			}else {
//				ps = con.prepareStatement("SELECT TEXT,TRANSLITERATION,WORD_MEANINGS FROM CHAPTER"+chtr+" WHERE VERSE_NUMBER="+num);
//			}
			//			ps.setString(1, chtr);
			ResultSet rs = ps.executeQuery();
			
			req.setAttribute("res", rs);
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
