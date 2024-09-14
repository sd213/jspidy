package org.jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class LaptopObject {

	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		String sql ;
		String url="jdbc:mysql://localhost:3306/";
		String user = "root";
		String pass = "toor";
		String dbName = "LAPTOP";
		String tableName = "laps";
		int rowAffect ;
		
		

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,user,pass);
			stmt = con.createStatement();
			//Checking if Database does not exists;
			sql = "CREATE DATABASE IF NOT EXISTS "+dbName;
			stmt.execute(sql);
			System.out.println("Either Database Exists or created");
			
			System.out.println("\n\nSetting to Database Name");
			sql = "USE "+dbName;
			stmt.execute(sql);
			
			sql = "CREATE TABLE IF NOT EXISTS "+tableName+"(id INT NOT NULL PRIMARY KEY,"
					+ "name VARCHAR(50) NOT NULL,"
					+ "brand VARCHAR(50),"
					+ "price DECIMAL(10,2),"
					+ "color VARCHAR(10))";
			stmt.execute(sql);
			System.out.println("Table exists or newly Created");
			
			try {
				sql = "INSERT INTO "+tableName+" VALUES(101,'ASUS X570zd-dm226t','ASUS','500.0','BLACK'),"
						+ "( 102,'ACER NITRO 6','ACER',6000.0,'RED'),"
						+ "( 105,'HP Chrome Book','HP','2500.0','WHITE'),"
						+ "( 106,'DELL XPS 17','DELL','8400.0','BLACK'),"
						+ "(107,'LENEVO YOGA 2i','LENEVO','680.0','GRAY'),"
						+ "( 109,'SAMSUNG GALAXY BOOK 1','SAMSUNG','520.0','BLACK'),"
						+ "( 121,'ASUS VIVOBOOK 14','ASUS','480.0','BLACK')";
				rowAffect = stmt.executeUpdate(sql);
				System.out.println("Rows: "+rowAffect+" Affected");
			}catch(SQLException e) {
				System.out.println(e.getMessage());
			}
			
			
			System.out.println("\nUpdating data into Table  "+tableName);
			sql = "UPDATE "+tableName+" SET NAME = 'JOKER' WHERE ID=105";
			rowAffect = stmt.executeUpdate(sql);
			System.out.println("Rows: "+rowAffect+" Affected");
			
			System.out.println("\nUpdating data into Table  "+tableName);
			sql = "UPDATE "+tableName+" SET NAME = 'BATMAN' WHERE ID=104";
			stmt.execute(sql);
			rowAffect = stmt.getUpdateCount();
			System.out.println("Rows: "+rowAffect+" Affected");
			

			System.out.println("\ndeleting data into Table Database  "+tableName);
			sql = "DELETE  FROM "+tableName+" WHERE ID = 105";
			stmt.execute(sql);
			rowAffect = stmt.getUpdateCount();
			System.out.println("Rows: "+rowAffect+" Affected");
//			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(con != null) {
				try {
					con.close();
				}
				catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
