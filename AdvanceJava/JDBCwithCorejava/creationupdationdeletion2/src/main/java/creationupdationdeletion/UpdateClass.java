package creationupdationdeletion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateClass {
	
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/";
		String db;
		String table;
		String name;
		double salary;
		String gender;
		int id;
		String user = "root";
		String pass = "toor";
		Scanner sc = new Scanner(System.in);
		
		
		Connection connection = null;
	    PreparedStatement pstatement = null;
	    try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			System.out.println("Enter Database Name:- ");
			db = sc.next();
			
			connection = DriverManager.getConnection(url+db,user,pass);
			
			System.out.println("Enter Table Name:- ");
			table = sc.next();
			
//			pstatement = connection.prepareStatement("UPDATE "+table+" SET name = ?, salary = ?, gender = ? WHERE id = ?");			
			
			pstatement = connection.prepareStatement("UPDATE "+table+" SET name = ?, salary = ? WHERE id = ?");			
			
			
			System.out.println("Enter Value of id  of Record :- ");
			id = sc.nextInt();
			
			System.out.println("Enter name of Record :- ");
			name = sc.next();
			
			System.out.println("Enter salary of Record :- ");
			salary = sc.nextDouble();
		
			
			
			
			pstatement.setString(1,name);
			pstatement.setDouble(2,salary);
			pstatement.setInt(3,id);
			
			
			pstatement.execute();
			int row = pstatement.getUpdateCount();
			
			if(row>0) System.out.println( row +" record updated Successfully");
			else System.out.println("No record updated");
			
			connection.close();
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
