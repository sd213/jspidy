package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FirstConnection {
	public static void main(String[] args) {
		Connection con = null;
		String url = "jdbc:mysql://localhost:3306/sakila";
		String user = "root";
		String password = "toor";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, user, password);
//			con.
			System.out.println(con);
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			System.out.println("Exeception raised....");
		}
	}
}
