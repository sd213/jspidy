package jdbctwodbconnect;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;
import java.util.Properties;

public class Temp {
	static Connection con = null;
	static PreparedStatement pstmt = null;
	static FileInputStream fis;
	static ResultSet rs;
	public static void main(String[] args) {
		displayEmployee();
		
	}
	
	public static void displayEmployee() {
		
		try {
//			fis = new FileInputStream("C:\\Users\\somit\\OneDrive\\Desktop\\dbinfo2.txt");
//
			fis = new FileInputStream("C:\\Users\\somit\\OneDrive\\Desktop\\dbinfo1.properties");
			
			Properties p = new Properties();
			
			p.load(fis);
			
			String url = p.getProperty("url");
			String user = p.getProperty("user");
			String pwd = p.getProperty("password");
			System.out.println(url+" ,"+user+" ,"+pwd);
			
			
			
//			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,user,pwd);
			
			
//			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/company","postgres","root");
			pstmt = con.prepareStatement("SELECT * FROM EMP");
			pstmt.execute();
			rs = pstmt.getResultSet();
			System.out.println(rs + ","+pstmt+","+con+"\n\n");
			while(rs.next()) {
				System.out.println(rs.getInt(1) + " , "+ rs.getString(2) + " , "+ rs.getDouble(3) + " , "+rs.getInt(4));
			}
			
			System.out.println("\n\n"+rs + ","+pstmt+","+con);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {

			System.out.println("In TryCatch Method");
			System.out.println(rs + ","+pstmt+","+con);
			closingConnection();
			
		}
		
	}
	public static void databaseTableCreation() {
//		Connection con;
//		try {
//			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","toor");
//			Statement s = con.createStatement();
//			
//			s.execute("CREATE DATABASE IF NOT EXISTS hELLOSTUPIDWORLD");
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	}
	public static void closingConnection() {
		System.out.println("In closingConnection Method");
		System.out.println(rs + ","+pstmt+","+con);
		if(rs!=null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(con!=null) {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println("End of  closingConnection Method");
		System.out.println(rs + ","+pstmt+","+con);
	}
}
