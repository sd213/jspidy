package jdbc1;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class FirstStatement {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/second";
		String user = "root";
		String password = "toor";
		Connection con = null;
		Statement st = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, user, password);
			System.out.println(con);
			st = con.createStatement();
			System.out.println(st);
//			st.execute("INSERT INTO EMP VALUES(102,'GAGAN',123,10)");
//			st.execute("INSERT INTO EMP VALUES(103,'GAGAN',123,10)");
//			st.execute("INSERT INTO EMP VALUES(104,'GAGAN',123,10)");
//			st.execute("INSERT INTO EMP VALUES(105,'GAGAN',123,10)");
//			
			st.execute("INSERT INTO EMP VALUES(103,'GAGAN',123,10),(102,'GAGAN',123,10),(104,'GAGAN',123,10)");
			
			System.out.println("Query Executed....");
			
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			System.out.println("Exeception raised....");
		}
	}

}
