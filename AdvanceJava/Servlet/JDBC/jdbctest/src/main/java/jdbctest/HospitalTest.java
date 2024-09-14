package jdbctest;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class HospitalTest {
	static Connection  con = null;
	static PreparedStatement ps = null;
	static String sql = "";
	static ResultSet rs = null;
	static int row  = -1;
	static String db="hospital";
	static String table="patient";
	static String url = "jdbc:mysql://localhost:3306/hospital";
//	+db;
	static String user = "root";
	static String pass = "toor";
	static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		Boolean outerChoice=true;
		int innerChoice;
		
		System.out.println("");
		do {
			System.out.println("############### Welcome to My App############## "
					+ "\n1.	Register a Patient"
					+ "\n2.   Update the disease information by patient_id"
					+ "\n3.   Update the the phoneNumber by patient_id and name"
					+ "\n4.   Fetch all the patient records."
					+ "\n5.   Fetch patient details by disease"
					+ "\n6.   Fetch patient details by name"
					+ "\n7.   Delete a patient record by patient_id"
					+ "\n8.   Search Patients by the letters of their name"
					+ "\n0.   ENTER 0 TO EXIT. "
					+ "\nEnter Choice:- ");
			innerChoice= sc.nextInt();
			switch(innerChoice) {
			case 1:
					registerPatient();
					break;
			case 2:
					updateDiseaseByID();
					break;
			case 3:
					updatePhonNumberidandName();
					break;
			case 4:
					FetchAllRecords();
					break;
					
			case 5:
					FetchPatientDetailsByDisease();
					break;
			case 6:
					FetchPatientDetailsByName();
					break;
					
			case 7:
					DeleteArecordByID();
					break;
			case 8:
					SearchPatientsByLetterofName();
					break;
			case 0:
				System.out.println("Thank You for Using Our App Good Bye");
				outerChoice=false;
				break;
			default:
				System.out.println("-- Invalid Input --");
			}
			
		}while(outerChoice);
	}

	

	private static void registerPatient() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,user,pass);
			ps = con.prepareStatement("INSERT INTO "+table+" VALUES(?,?,?,?,?,?,?)");
			System.out.print("Enter ID of Patient:- ");
			ps.setInt(1, sc.nextInt());
			System.out.print("Enter Name of Patient:- ");
			ps.setString(2, sc.next());
			System.out.print("Enter AGE of Patient:- ");
			ps.setInt(3,sc.nextInt());
			System.out.print("Enter GENDER of Patient:- ");
			ps.setString(4, sc.next());
			System.out.print("Enter PHONENUM of Patient:- ");
			ps.setString(5, sc.next());
			System.out.print("Enter DISEASE of Patient:- ");
			ps.setString(6, sc.next());
			System.out.print("Enter ADMISSION_DATE of Patient:- ");
			ps.setDate(7, Date.valueOf(sc.next()));
			
			row = ps.executeUpdate();
			System.out.println(row + " row affected");
			
			if(row >=1) {
				System.out.println("Successfully Registered.....");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	private static void updateDiseaseByID() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,user,pass);
			ps = con.prepareStatement("UPDATE "+table+" SET DISEASE = ? WHERE ID = ?");
			System.out.print("Enter Existing ID of Patient:- ");
			ps.setInt(2, sc.nextInt());
			System.out.print("Enter Disease of Patient:- ");
			ps.setString(1, sc.next());
			
			
			row = ps.executeUpdate();
			System.out.println(row + " row affected");
			
			if(row >=1) {
				System.out.println("Successfully Updated .....");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			closingConnection();
		}
	}
	



	private static void updatePhonNumberidandName() {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,user,pass);
			ps = con.prepareStatement("UPDATE "+table+" SET PHONE = ? WHERE ID = ? AND NAME = ?");
			System.out.print("Enter ID of Patient:- ");
			ps.setInt(2, sc.nextInt());
			System.out.print("Enter NAME of Patient:- ");
			ps.setString(3, sc.next());
			System.out.print("Enter New PhoneNumber:- ");
			ps.setString(1, sc.next());
			
			
			row = ps.executeUpdate();
			System.out.println(row + " row affected");
			
			if(row >=1) {
				System.out.println("Successfully Updated .....");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			closingConnection();
		}
	}
	private static void FetchAllRecords() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,user,pass);
			ps = con.prepareStatement("SELECT * FROM PATIENT");
			
			rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+", "+rs.getString(2)+", "+rs.getInt(3)+", "+rs.getString(4)+", "+rs.getString(5)+", "+rs.getString(6)+", "+rs.getDate(7));
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			closingConnection();
		}
	}

	private static void FetchPatientDetailsByDisease() {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,user,pass);
			ps = con.prepareStatement("SELECT * FROM PATIENT WHERE DISEASE = ?");
			System.out.println("Enter Disease:- ");
			ps.setString(1, sc.next());
			rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+", "+rs.getString(2)+", "+rs.getInt(3)+", "+rs.getString(4)+", "+rs.getString(5)+", "+rs.getString(6)+", "+rs.getDate(7));
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			closingConnection();
		}
	}


	private static void FetchPatientDetailsByName() {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,user,pass);
			ps = con.prepareStatement("SELECT * FROM PATIENT WHERE NAME = ?");
			System.out.println("Enter NAME :- ");
			ps.setString(1, sc.next());
			rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+", "+rs.getString(2)+", "+rs.getInt(3)+", "+rs.getString(4)+", "+rs.getString(5)+", "+rs.getString(6)+", "+rs.getDate(7));
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			closingConnection();
		}
	}
	


	private static void DeleteArecordByID() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,user,pass);
			ps = con.prepareStatement("DELETE  FROM PATIENT WHERE ID = ?");
			System.out.println("Enter id of Patient that you want to delete :- ");
			ps.setInt(1, sc.nextInt());
			row = ps.executeUpdate();
			if(row>=1) {
				System.out.println("Successfully Executed  and "+row+" row Affected");
			}else {
				System.out.println("No Rows Affected");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			closingConnection();
		}
		
	}
	private static void SearchPatientsByLetterofName() {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,user,pass);
			ps = con.prepareStatement("SELECT * FROM PATIENT WHERE NAME LIKE ?");
			System.out.println("Letter of Patient Name :- ");
			ps.setString(1, sc.next()+"%");
			
			rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+", "+rs.getString(2)+", "+rs.getInt(3)+", "+rs.getString(4)+", "+rs.getString(5)+", "+rs.getString(6)+", "+rs.getDate(7));
				
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			closingConnection();
		}
	}
	
	private static void closingConnection() {
		// TODO Auto-generated method stub
		if(rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(ps != null) {
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(con !=null) {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	

}
