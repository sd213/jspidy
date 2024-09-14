package creationupdationdeletion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateClass {
	
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/";
		String db;
		String user = "root";
		String pass = "toor";
		String sql = null;
		String table ;
//		String id ;
		
		Connection connection = null;
	    Statement statement = null;
	    
	    try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Enter Database Name:- ");
			db = new java.util.Scanner(System.in).next();
			connection = DriverManager.getConnection(url,user,pass);
			statement = connection.createStatement();			
			sql = "USE "+db;
//			stmt.executeQuery(sql); // it  executeQuery can only execute DQL query
			statement.execute(sql);
			connection.close();
			connection = DriverManager.getConnection(url+db,user,pass);
			statement = connection.createStatement();
			System.out.println("Enter Table Name:- ");
			table = new java.util.Scanner(System.in).next();
			
//			System.out.println("Enter ID of table you want to update");
//			id = new java.util.Scanner(System.in).next();
			
			sql = "UPDATE "+table+" SET NAME = 'JOKER' WHERE ID=104";
			statement.execute(sql);
			System.out.println("Updating data into Table Database Emp ");
			
			connection.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
