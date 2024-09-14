package jdbc_test;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class hospitalManage {
	static Scanner sc = new Scanner(System.in);
	static Connection con = null;
	static Statement s = null;
	static PreparedStatement ps = null;
	static String url = "jdbc:mysql://localhost:3306/";
	static String db;
	static String table;
	static String user="root";
	static String pass = "toor";
	static String sql;
	
	public static void main(String[] args) {
		Boolean loop = true;
		int choice = 1;
		int innerChoice = 0;
		do {
			
		System.out.println("Enter Choice :"
				+ "\n 1. Register New Patient\n "
				+ "2. Update Information\n"
				+ " 3. Fetch Records\n"
				+ " 4. Delete Records\n"
				+ " 5. Search Patients\n"
				+ " 0. TO EXIT PROGRAM\n"
				+ ":--- "
				);
		choice = sc.nextInt();
		switch(choice) {
		case 1:
				System.out.println("Register New Patient:- ");
				registerNewPatient();
				break;
				
		case 2:
				System.out.println("Update Information:- ");
				System.out.println("Enter Choice :\n"
						+ " 1. Update Disease Information\n "
						+ " 2. Update Phone Number By ID\n"
						+ " 3. Update Phone Number By Name\n");
				innerChoice = sc.nextInt();
				switch(innerChoice) {
				case 1:	
						System.out.println("Update Disease Information");
						updateDiseaseInfo();
						break;
						
				case 2:
						System.out.println("Update PhoneNumber By id");
						updatePhoneNumberByID();
						break;
				case 3:
						System.out.println("Update PhoneNumber By name");
						updatePhoneNumberByName();
						break;
				default:
						System.out.println("Invalid Option");
				}
				break;
		case 3:
			System.out.println("Fetch Information:- ");
			System.out.println("Enter Choice :\n"
					+ " 1. Fetch All Records \n "
					+ " 2. Fetch Patient Records by Disease\n"
					+ " 3. Fetch Patient details by Name\n");
			innerChoice = sc.nextInt();
			switch(innerChoice) {
			case 1:	
					System.out.println("Fetching all Records");
					fetchAllRecord();
					break;
					
			case 2:
					System.out.println("Fetching Patient by Disease");
					fetchPatientsbyDisease();
					break;
			case 3:
					System.out.println("Fetching Patient by Disease");
					fetchPatientsbyName();
					break;
			default:
					System.out.println("Invalid Option");
			}
			break;
				
		case 4:
			System.out.println("Deleting Patient Information:- ");
			deleteaPatientbyId();
			break;
		case 5:
			System.out.println("Searching Patients by Letter of their Name:- ");
			searchPatientsbyletterofName();
			break;
			
			
		case 0: System.out.println("Exiting");
			    loop = false;
			    closeConnection();
			    break;
		default:
				System.out.println("Invalid Option");
		}
		}while(loop);
		
		System.out.println("Thanks for Using Our Software :)");
	}

	private static void closeConnection() {
		if(ps !=null) {
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
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

	private static void registerNewPatient() {
		
		try {
			System.out.println("Enter Database Name:- ");
			db = sc.next();
			con = DriverManager.getConnection(url,user,pass);
			s = con.createStatement();
			s.execute("CREATE DATABASE IF NOT EXISTS "+db);
//			s.execute("USE "+db);
			s.close();
			con.close();
			con = DriverManager.getConnection(url+db,user,pass);
			s = con.createStatement();
			System.out.println("Enter Table Name:- ");
			table = sc.next();
			sql = "CREATE TABLE IF NOT EXISTS "+table+"(id INT NOT NULL AUTO_INCREMENT, NAME VARCHAR(50), AGE INT, GENDER VARCHAR(10), PHONE VARCHAR(10) UNIQUE, DISEASE VARCHAR(50), ADMISSION_DATE DATE )";
			s.execute(sql);
			System.out.println("Succesfully Executed");
			
			ps = con.prepareStatement("INSERT INTO "+table+" VALUES(?,?,?,?,?,?,?)");
			System.out.println("Enter ID:- ");
			ps.setInt(1,sc.nextInt() );
			System.out.println("Enter Name :- ");
			ps.setString(2, sc.next());
			System.out.println("Enter Age :- ");
			ps.setInt(3,sc.nextInt());
			System.out.println("Enter Gender :- ");
			ps.setString(4,sc.next());
			System.out.println("Enter Phone Num :- ");
			ps.setString(5,sc.next());
			System.out.println("Enter Disease :- ");
			ps.setString(6,sc.next());
			System.out.println("Enter Admission_Date:- ");
			ps.setDate(7,Date.valueOf(sc.next()));
			
			ps.execute();
			System.out.println("Inserted Successfully");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

	private static void searchPatientsbyletterofName() {
		try {
			System.out.println("Enter Database Name:- ");
			db = sc.next();
			con = DriverManager.getConnection(url+db,user,pass);
			System.out.println("Enter Table Name:- ");
			table = sc.next();
			
			ps = con.prepareStatement("SELECT * FROM "+table+" WHERE NAME LIKE ?");
			System.out.println("Enter Letter:- ");
			ps.setString(1, sc.next()+"%");
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" , "+rs.getString(2)+","+rs.getInt(3)+","+rs.getString(4)+","+rs.getString(5)+","+rs.getString(6)+","+rs.getString(7));
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
			System.out.println("Succesfully Executed");

	}

	private static void deleteaPatientbyId() {
		// TODO Auto-generated method stub
		try {
			System.out.println("Enter Database Name:- ");
			db = sc.next();
			con = DriverManager.getConnection(url+db,user,pass);
			System.out.println("Enter Table Name:- ");
			table = sc.next();
			
			ps = con.prepareStatement("DELETE  FROM "+table+" WHERE ID LIKE ?");
			System.out.println("Enter ID :- ");
			ps.setString(1, sc.nextInt()+"%");
			
			int row = ps.executeUpdate();
			System.out.println(row + " rows affected");
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
			System.out.println("Succesfully Executed");
	}

	private static void fetchPatientsbyName() {
		try {
			System.out.println("Enter Database Name:- ");
			db = sc.next();
			con = DriverManager.getConnection(url+db,user,pass);
			System.out.println("Enter Table Name:- ");
			table = sc.next();
			
			ps = con.prepareStatement("SELECT * FROM "+table+" WHERE NAME LIKE ?");
			System.out.println("Enter Name :- ");
			ps.setString(1, sc.next());
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" , "+rs.getString(2)+","+rs.getInt(3)+","+rs.getString(4)+","+rs.getString(5)+","+rs.getString(6)+","+rs.getString(7));
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
			System.out.println("Succesfully Executed");
		
	}

	private static void fetchPatientsbyDisease() {
		try {
			System.out.println("Enter Database Name:- ");
			db = sc.next();
			con = DriverManager.getConnection(url+db,user,pass);
			System.out.println("Enter Table Name:- ");
			table = sc.next();
			
			ps = con.prepareStatement("SELECT * FROM "+table+" WHERE DISEASE LIKE ?");
			System.out.println("Enter Disease :- ");
			ps.setString(1, sc.next());
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" , "+rs.getString(2)+","+rs.getInt(3)+","+rs.getString(4)+","+rs.getString(5)+","+rs.getString(6)+","+rs.getString(7));
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
			System.out.println("Succesfully Executed");
		
	}

	private static void fetchAllRecord() {
		try {
			System.out.println("Enter Database Name:- ");
			db = sc.next();
			con = DriverManager.getConnection(url+db,user,pass);
			System.out.println("Enter Table Name:- ");
			table = sc.next();
			
			ps = con.prepareStatement("SELECT * FROM "+table);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" , "+rs.getString(2)+","+rs.getInt(3)+","+rs.getString(4)+","+rs.getString(5)+","+rs.getString(6)+","+rs.getString(7));
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
			System.out.println("Succesfully Executed");
		
	}

	private static void updatePhoneNumberByName() {
		// TODO Auto-generated method stub
		
		try {
			System.out.println("Enter Database Name:- ");
			db = sc.next();
			con = DriverManager.getConnection(url+db,user,pass);
			System.out.println("Enter Table Name:- ");
			table = sc.next();
			
			ps = con.prepareStatement("UPDATE "+table+" SET PHONE = ? WHERE NAME LIKE ?");
			System.out.println("Enter Name:- ");
			ps.setString(2, sc.next());
			System.out.println("Enter PhoneNumber:-  ");
			ps.setString(1, sc.next());
		
			
			int row = ps.executeUpdate();
			System.out.println(row +" Row affected " );
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
			System.out.println("Succesfully Executed");
	}

	private static void updatePhoneNumberByID() {
		try {
			System.out.println("Enter Database Name:- ");
			db = sc.next();
			con = DriverManager.getConnection(url+db,user,pass);
			System.out.println("Enter Table Name:- ");
			table = sc.next();
			
			ps = con.prepareStatement("UPDATE "+table+" SET PHONE = ? WHERE ID LIKE ?");
			System.out.println("Enter ID:- ");
			ps.setInt(2, sc.nextInt());
			System.out.println("Enter PhoneNumber:-  ");
			ps.setString(1, sc.next());
		
			
			int row = ps.executeUpdate();
			System.out.println(row +" Row affected " );
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
			System.out.println("Succesfully Executed");
		
	}

	private static void updateDiseaseInfo() {
		try {
			System.out.println("Enter Database Name:- ");
			db = sc.next();
			con = DriverManager.getConnection(url+db,user,pass);
			System.out.println("Enter Table Name:- ");
			table = sc.next();
			
			ps = con.prepareStatement("UPDATE "+table+" SET DISEASE = ? WHERE ID LIKE ?");
			System.out.println("Enter ID:- ");
			ps.setInt(2, sc.nextInt());
			System.out.println("Enter DISEASE:-  ");
			ps.setString(1, sc.next());
		
			
			int row = ps.executeUpdate();
			System.out.println(row +" Row affected " );
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
			System.out.println("Succesfully Executed");
	}

	

}
