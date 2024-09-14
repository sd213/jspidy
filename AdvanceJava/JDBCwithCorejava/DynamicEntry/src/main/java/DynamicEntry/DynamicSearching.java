package DynamicEntry;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;

public class DynamicSearching {

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
//			ps = con.prepareStatement("select first_name from employees where first_name like '/?/*'");
			ps = con.prepareStatement("select * from employees where first_name like ?");
//			ps.setString(1, name);
			ps.setString(1, name+"%");
			
			ps.execute();
			ResultSet r = ps.getResultSet();
			int row = ps.getUpdateCount();
			System.out.println(row + " : Row Affected");
			
			while(r.next()) {
				
				if(r.getString(2).charAt(0)>='A'&& r.getString(2).charAt(0)<='Z') {
					System.out.println(
							r.getInt(1)+" , "+r.getString(2)+" , "+r.getString(3)+" , "+r.getString(4)+" , "+r.getInt(5)+" , "+r.getString(6));
				}
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}
	}

}
