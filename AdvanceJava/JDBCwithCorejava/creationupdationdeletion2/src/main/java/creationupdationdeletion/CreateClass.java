package creationupdationdeletion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.util.Scanner;

public class CreateClass {
	
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/";
		String db ;
		String table;
		String user = "root";
		String pass = "toor";
		String sql = null;
		
		Connection connection = null;
	    PreparedStatement pstatement = null;
	    try (Scanner sc = new Scanner(System.in)) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("Enter Database Name:- ");
				db = sc.next();
				connection = DriverManager.getConnection(url,user,pass);
				pstatement = connection.prepareStatement("CREATE DATABASE IF NOT EXISTS "+db);
				
				
//			stmt.executeQuery(sql); // it  executeQuery can only execute DQL query
				pstatement.execute();
				pstatement.execute("USE "+db);
				
				System.out.println("Enter Table Name:- ");
				table = new java.util.Scanner(System.in).next();
				
				sql = "CREATE TABLE IF NOT EXISTS "+table+"(id INT NOT NULL PRIMARY KEY, name VARCHAR(50),salary DECIMAL(50),GENDER VARCHAR(50),deptno INT) ";
				pstatement.execute(sql);
				
				pstatement.close();
				pstatement = connection.prepareStatement("INSERT INTO "+table+" VALUES (?,?,?,?,?)");
				
				
				
				System.out.println("Enter Id : ");
				int id = sc.nextInt();
				System.out.println("Enter Name : ");
				String name = sc.next();
				System.out.println("Enter Salary : ");
				Double sal = sc.nextDouble();
				
				System.out.println("Enter Gender :");
				String gender = sc.next();
				System.out.println("Enter DeptNo : ");
				int dNo = sc.nextInt();
				pstatement.setInt(1,id);
				pstatement.setString(2,name);
				pstatement.setDouble(3,sal);
				pstatement.setString(4,gender);
				pstatement.setInt(5,dNo);
				pstatement.execute();
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				if(pstatement != null) {
					try {
						System.out.println("Closing Statement");
						pstatement.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				if(connection != null) {
					try {
						System.out.println("Closing Connection");
						connection.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
		
	}
}
