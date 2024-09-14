package org.jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcApp3 {

	public static void main(String[] args) {
		Connection con = null;
		Statement s = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/second","root","toor");
			s = con.createStatement();
			
			
			s.execute("insert into emp values(115,'Abc,5151,20),(116,'Abc',5151,20),(117,'Abc',5151,20)");
			int row = s.getUpdateCount();
			System.out.println(row + " Row affected ... ");
			
			
			s.execute ("update employees set first_name = 'ABCD' where id = 104" );
			row = s.getUpdateCount();
			System.out.println(row + " Row affected ... ");
			
//			s.close();
//			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
//			try {
//				s.close();
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//			try {
//				con.close();
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			// here don't try to write those code because when exception ocurred at that time only resources get closed. // not other time
			
		}
		finally {
			// here if we have  to put conditional statement as if exception occurrs before or during initialization of connection (implemented) object at that time  both connection and statement reference pointing to null at that time so if we try to close those resources we will get null pointer exception.
			
			if(s!=null) {
				
				System.out.println("S Close");
				try {
					s.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(con!= null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
