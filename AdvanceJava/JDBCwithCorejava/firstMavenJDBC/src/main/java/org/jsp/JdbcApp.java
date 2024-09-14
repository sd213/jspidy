package org.jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcApp {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/";
		String db = "SD";
		String user = "root";
		String pass = "toor";
		String sql = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//CREATING CONNECTION AND STATEMENT
			Connection con = DriverManager.getConnection(url, user, pass);
			System.out.println(con + " is succesffully connected");
			Statement stmt = con.createStatement();
			
			sql = "CREATE DATABASE IF NOT EXISTS "+db;
//			stmt.executeQuery(sql); // it  executeQuery can only execute DQL query
			stmt.executeUpdate(sql);
			System.out.println("Database : "+db+"is either Created or Existed before " );
			
//			con.setCatalog(url+db);;
			con.close(); // not good practice to do it to change connection
			stmt.close();
			con = DriverManager.getConnection(url+db,user,pass);
			stmt = con.createStatement();
			
			sql = "CREATE TABLE IF NOT EXISTS EMP (id INT NOT NULL PRIMARY KEY, name VARCHAR(50),age INT,GENDER VARCHAR(50)) ";
			stmt.execute(sql);
			System.out.println("Creating Table Database Emp ");
			
//			stmt.execute("TRUNCATE emp");
			

			System.out.println("Inserting data into Table Database Emp ");
			sql = "INSERT INTO EMP VALUES(103,'Som',12,'Male'),(102,'Dasia',123,'Female'),(104,'Bruce',35,'Male')";
			stmt.execute(sql);
			

			System.out.println("Updating data into Table Database Emp ");
			sql = "UPDATE EMP SET NAME = 'JOKER' WHERE ID=104";
			stmt.execute(sql);
			

			System.out.println("deleting data into Table Database Emp ");
			sql = "DELETE  FROM EMP WHERE ID = 104";
			stmt.execute(sql);
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
