package DynamicEntry;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DynamicSearching2 {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement ps = null;
		
		String url = "jdbc:mysql://localhost:3306/second";
		String user = "root";
		String pass = "toor";
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("Enter Id : ");
//		int id = sc.nextInt();
		System.out.println("Enter Name : ");
		String name = sc.next();
		
//		System.out.println("Enter Salary : ");
//		Double sal = sc.nextDouble();
		
//		System.out.println("Enter DeptNo : ");
//		int dNo = sc.nextInt();
//		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,user,pass);
			String sql = "select first_name from employees where first_name like '"+name+"%'";
			Statement ps1 = con.createStatement();
//			ps.setString(1, name);
			ps1.execute(sql);
			ResultSet r = ps1.getResultSet();
			int row = ps1.getUpdateCount();
			System.out.println(row + " : Row Affected");
			
			while(r.next()) {
				System.out.println("id : "+r.getString(1));
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}
	}


}
