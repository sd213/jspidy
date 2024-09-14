package emsmanagement;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CreateEmployee {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/company";
		String user = "root";
		String pass = "toor";
		try (Scanner sc = new Scanner(System.in)) {
			Connection con = null;
			PreparedStatement pst = null;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection(url,user,pass);
				pst = con.prepareStatement("INSERT INTO EMP VALUES(?,?,?,?,?)");
				
				System.out.print("Enter ID :- ");
				pst.setInt(1,sc.nextInt());
				
				System.out.print("Enter Name :- ");
				pst.setString(2,sc.next());
				
				System.out.print("Enter Sal :- ");
				pst.setDouble(3,sc.nextDouble());
				
				System.out.print("Enter DeptNO. :- ");
				pst.setInt(4,sc.nextInt());
				
				System.out.println("Enter Hire Date :- ");
				pst.setDate(5, Date.valueOf(sc.next()));
				
				int row = pst.executeUpdate();
				System.out.println(row + " Row Affected ");
				
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
