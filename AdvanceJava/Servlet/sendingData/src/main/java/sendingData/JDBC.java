package sendingData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBC {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			Connection con = null;
			PreparedStatement st = null;
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/second","root","toor");
				st = con.prepareStatement("INSERT INTO emp values (?,?,?,?)");
				System.out.println("Enter ID:- ");
				st.setInt(1, sc.nextInt());
				System.out.println("Enter Name:- ");
				st.setString(2,sc.next());
				System.out.println("Enter Sal:- ");
				st.setDouble(3, sc.nextDouble());
				System.out.println("Enter Dept:- ");
				st.setInt(4, sc.nextInt());
				
				st.execute();
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
