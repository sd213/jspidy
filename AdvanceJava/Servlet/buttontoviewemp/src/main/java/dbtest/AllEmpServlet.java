package dbtest;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import com.mysql.cj.protocol.Resultset;
@WebServlet(urlPatterns = "/allemp")
public class AllEmpServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		System.out.println("hdslfdkls");

		System.out.println(req.getParameter("hello"));
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","toor");
			PreparedStatement ps = con.prepareStatement("SELECT * FROM EMP");
			ResultSet rs = ps.executeQuery();
			String s="";
			while(rs.next()) {
//				 System.out.println(rs.getInt(2)+" , "+rs.getInt(3)+" , "+rs.getString(4)+" , "+rs.getString(5)+ " , "+rs.getString(6));
				System.out.println(rs.getInt(1)+" , "+rs.getString(2)+" , "+rs.getDouble(3)+" , "+rs.getInt(4));
				s = s+"\n"+rs.getInt(1)+" , "+rs.getString(2)+" , "+rs.getDouble(3)+" , "+rs.getInt(4);
				
			}
			PrintWriter pw = resp.getWriter();
			pw.write("<html><body style='text-align:center'>"+s+"</body></html>");
			rs.close();
			ps.close();
			con.close();
		}
		catch(SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
