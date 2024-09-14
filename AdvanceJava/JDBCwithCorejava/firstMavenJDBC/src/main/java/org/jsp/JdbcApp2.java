package org.jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcApp2 {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/second","root","toor");
			Statement s = con.createStatement();
			
			
			s.execute ("update employees set first_name = 'ABCD' where id = 105" );
			int row = s.getUpdateCount();
			System.out.println(row + " Row affected ... ");
			
			
			s.execute ("update employees set first_name = 'ABCD' where id = 104" );
			row = s.getUpdateCount();
			System.out.println(row + " Row affected ... ");
			
			s.close(); // wrong way of closing resource statement
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
