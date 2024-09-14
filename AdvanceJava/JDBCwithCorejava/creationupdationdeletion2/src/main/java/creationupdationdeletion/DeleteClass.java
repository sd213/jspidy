package creationupdationdeletion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.PreparedStatement;

public class DeleteClass {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/";
		String db;
		String table;
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
			System.out.println(table);
			
			pstatement = connection.prepareStatement("DELETE FROM "+table+" WHERE id=?");			
			
			
			System.out.println("Enter Value of id  of Record :- ");
			int id = sc.nextInt();
			System.out.println(id);
			
			
			pstatement.setInt(1,id);
			
			pstatement.execute();
			int row = pstatement.getUpdateCount();
			
//			(row>0)?System.out.println("record deleted Successfully"):System.out.println("No record deleted");
			if (row>0) System.out.println( row +" record deleted Successfully");
			else System.out.println("No record deleted");
			
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
