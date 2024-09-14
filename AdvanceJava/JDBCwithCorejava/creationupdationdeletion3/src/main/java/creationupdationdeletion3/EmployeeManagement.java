package creationupdationdeletion3;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class EmployeeManagement {
	static Scanner sc = new Scanner(System.in);
	static Connection con = null;
	static Statement s = null;
	static PreparedStatement ps = null;
	static String url = "jdbc:mysql://localhost:3306/";
	static String user = "root";
	static String pass = "toor";
	static String db;
	static String table;
	static String sql;
//	static int option;
	
	public static void main(String[] args) {
		int option ;
		boolean count = true;
		do {
			System.out.print("\n\nEnter Option:-\n1. Create DB and Table\n2. Insert Record\n3. Update Record\n4. Find Record\n5. Delete Record\n0. to exit\n Enter Option :- ");
			option = sc.nextInt() ;
			
			switch(option) {
			case 1:
				createDBandTable();
				break;
				
			case 2:
				insertRecord();
				break;
			
			case 3:
				updateRecord();
				break;
			case 4:
				findRecord();
				break;
			case 5:
				deleteRecord();
				break;
			
			case 0:
				count=false;
				break;
				
			default:
				System.out.println("Try Again \n\n");
			}	
			
			
		}while(count);
		
	}
	public static void createDBandTable() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Enter Database Name:- ");
			db = sc.next();
			con = DriverManager.getConnection(url,user,pass);
			s = con.createStatement();
			
			sql = "CREATE DATABASE IF NOT EXISTS "+db;
			s.executeUpdate(sql);
			
			sql = "USE "+db;
			s.execute(sql);
			
			System.out.println("Enter Table Name:- ");
			table = sc.next();
			sql = "CREATE TABLE IF NOT EXISTS "+table+"(id INT NOT NULL PRIMARY KEY, name VARCHAR(50),sal DECIAML(10),deptno INT,hiredate DATE)";
			s.execute(sql);
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(s!=null) {
				try {
					s.close();
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
		}
		
	}
	public static void insertRecord() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.print("\n\nEnter Database You want to Connect:- ");
			db = sc.next();
			con = DriverManager.getConnection(url,user,pass);
			s = con.createStatement();
			
			sql = "CREATE DATABASE IF NOT EXISTS "+db;
			s.executeUpdate(sql);
			
			sql = "USE "+db;
			s.execute(sql);
			
			System.out.println("Enter Table Name:- ");
			table = sc.next();
			sql = "CREATE TABLE IF NOT EXISTS "+table+"(id INT NOT NULL PRIMARY KEY, name VARCHAR(50),sal DECIAML(10),deptno INT,hiredate DATE)";
			s.execute(sql);
			
			con = DriverManager.getConnection(url,user,pass);
			ps = con.prepareStatement("INSERT INTO EMP VALUES(?,?,?,?,?)");
			
			System.out.print("Enter ID :- ");
			ps.setInt(1,sc.nextInt());
			
			System.out.print("Enter Name :- ");
			ps.setString(2,sc.next());
			
			System.out.print("Enter Sal :- ");
			ps.setDouble(3,sc.nextDouble());
			
			System.out.print("Enter DeptNO. :- ");
			ps.setInt(4,sc.nextInt());
			
			System.out.println("Enter Hire Date :- ");
			ps.setDate(5, Date.valueOf(sc.next()));
			
			int row = ps.executeUpdate();
			System.out.println(row + " Row Affected ");
			
		} catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}finally {
			if(s!=null) {
				try {
					s.close();
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
		}
	}
	public static void updateRecord() {
//		update by value 
		//update by id
		//update by age
		
	}
	public static void findRecord() {
		
	}
	public static void deleteRecord() {
		
	}

}
