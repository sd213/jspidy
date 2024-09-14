package creationupdationdeletion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateClass {
	
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/";
		String db ;
		String table;
		String user = "root";
		String pass = "toor";
		String sql = null;
		
		Connection connection = null;
	    Statement statement = null;
		
	    try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Enter Database Name:- ");
			db = new java.util.Scanner(System.in).next();
			connection = DriverManager.getConnection(url,user,pass);
			statement = connection.createStatement();
			
			sql = "CREATE DATABASE IF NOT EXISTS "+db;
//			stmt.executeQuery(sql); // it  executeQuery can only execute DQL query
			statement.executeUpdate(sql);
			connection.close();
			connection = DriverManager.getConnection(url+db,user,pass);
			statement = connection.createStatement();
			System.out.println("Enter Table Name:- ");
			table = new java.util.Scanner(System.in).next();
			sql = "CREATE TABLE IF NOT EXISTS "+table+"(id INT NOT NULL PRIMARY KEY, name VARCHAR(50),age INT,GENDER VARCHAR(50))";
			statement.execute(sql);
			sql = "INSERT INTO "+table+" VALUES "
					+ "(1, 'John Doe', 30, 'Male'),"
					+ "(2, 'Jane Smith', 25, 'Female'),"
					+ "(3, 'Emily Davis', 22, 'Female'),"
					+ "(4, 'Michael Brown', 35, 'Male'),"
					+ "(5, 'Jessica Wilson', 28, 'Female'),"
					+ "(6, 'Daniel Johnson', 40, 'Male'),"
					+ "(7, 'Laura Moore', 32, 'Female'),"
					+ "(8, 'David Taylor', 45, 'Male'),"
					+ "(9, 'Sarah Anderson', 27, 'Female'),"
					+ "(10, 'James Thomas', 31, 'Male'),"
					+ "(11, 'Karen Martin', 33, 'Female'),"
					+ "(12, 'Robert Jackson', 50, 'Male'),"
					+ "(13, 'Mary Lee', 24, 'Female'),"
					+ "(14, 'Paul Harris', 37, 'Male'),"
					+ "(15, 'Nancy Clark', 29, 'Female'),"
					+ "(16, 'Steven Rodriguez', 26, 'Male'),"
					+ "(17, 'Linda Lewis', 42, 'Female'),"
					+ "(18, 'Mark Walker', 38, 'Male'),"
					+ "(19, 'Patricia Hall', 34, 'Female'),"
					+ "(20, 'Charles Allen', 36, 'Male'),"
					+ "(21, 'Jennifer Young', 23, 'Female'),"
					+ "(22, 'George Hernandez', 41, 'Male'),"
					+ "(23, 'Barbara King', 39, 'Female'),"
					+ "(24, 'Thomas Wright', 44, 'Male'),"
					+ "(25, 'Susan Lopez', 21, 'Female'),"
					+ "(26, 'Joseph Hill', 28, 'Male'),"
					+ "(27, 'Karen Scott', 30, 'Female'),"
					+ "(28, 'Christopher Green', 47, 'Male'),"
					+ "(29, 'Dorothy Adams', 26, 'Female'),"
					+ "(30, 'Matthew Baker', 49, 'Male'), (103,'Som',12,'Male'),(102,'Daisy',123,'Female'),(104,'Bruce',35,'Male')";
			statement.execute(sql);
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(statement !=null) {
				try {
					statement.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(connection !=null) {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
}
