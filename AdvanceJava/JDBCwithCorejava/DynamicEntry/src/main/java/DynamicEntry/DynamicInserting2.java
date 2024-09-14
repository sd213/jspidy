package DynamicEntry;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DynamicInserting2 {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement ps = null;
		
		String url = "jdbc:mysql://localhost:3306/second";
		String user = "root";
		String pass = "toor";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Id : ");
		int id = sc.nextInt();
		System.out.println("Enter Name : ");
		String name = sc.next();
		System.out.println("Enter Salary : ");
		Double sal = sc.nextDouble();
		
		System.out.println("Enter DeptNo : ");
		int dNo = sc.nextInt();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,user,pass);
			ps = con.prepareStatement("INSERT INTO EMP VALUES (?,?,?,?)");
			ps.setInt(1,id);
			ps.setString(2,name);
			ps.setDouble(3,sal);
			ps.setInt(4,dNo);
			ps.execute();
			int row = ps.getUpdateCount();
			System.out.println(row + " : Row Affected");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(ps != null) {
				try {
					ps.close();
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
