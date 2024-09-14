package tasks;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//import com.mysql.cj.xdevapi.Statement;

public class SecondStatement {
	
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/second";
		String user = "root";
		String pass = "toor";
		Connection con = null;
		Statement st = null;
		String sql = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,user,pass);
			st = con.createStatement();
//			String createTableSQL = "CREATE TABLE mytable (" +
//                    "id INT NOT NULL AUTO_INCREMENT, " +
//                    "name VARCHAR(50), " +
//                    "age INT, " +
//                    "PRIMARY KEY (id))";
//			st.executeUpdate(createTableSQL);
			
//			  Create a new  Student,Person,Human
            sql = "CREATE TABLE IF NOT EXISTS Employees (" +
                  "id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, " +
                  "first_name VARCHAR(50), " +
                  "last_name VARCHAR(50), " +
                  "email VARCHAR(50), " +
                  "age INT, " +
                  "steam VARCHAR(20)"+
                  ")";
            st.executeUpdate(sql);

            System.out.println("Student Table created successfully...");
            
            sql = "CREATE TABLE IF NOT EXISTS Person (" +
                    "id INT(11) NOT NULL AUTO_INCREMENT, " +
                    "first_name VARCHAR(50), " +
                    "last_name VARCHAR(50), " +
                    "age INT, " +
                    "PRIMARY KEY(id))";
            st.executeUpdate(sql);
            System.out.println("Person Table created successfully...");
            
            sql = "CREATE TABLE IF NOT EXISTS Human (" +
                    "id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, " +
                    "first_name VARCHAR(50), " +
                    "last_name VARCHAR(50), " +
                    "age INT, " +
                    "gender VARCHAR(20)"+
                    ")";
            st.executeUpdate(sql);
            System.out.println("Human Table created successfully...");
            
            st.execute("INSERT INTO Employees VALUES(101,'Somit','Das','somitdas212@hotmail.com',23,'CSE'),"
            		+ "(102,'SD','Das','som2@gmail.com',21,'ESE'),"
            		+ "(103,'Smith','son','smithSon@protonmail.com',21,'Mechanical'),"
            		+"(104,'Rahul','Sahoo','rSahoo43@gmail.com',24,'EEE')");
            
            System.out.println("Inserted into Student Table created successfully...");
            st.execute("INSERT INTO Person VALUES(101,'Somit','Da',22),"
            		+ "(102,'SD','Das',21),"
            		+ "(103,'Smith','son',21),"
            		+"(104,'Rahul','Sahoo',24)");
            System.out.println("Inserted into Person Table created successfully...");
            st.execute("INSERT INTO Human VALUES(101,'Somit','Da',22,'MALE'),"
            		+ "(102,'SD','Das',21,'FEMALE'),"
            		+ "(103,'Smith','son',21,'MALE'),"
            		+"(104,'Rahul','Sahoo',24,'MALE')");
            System.out.println("Inserted into Human Table created successfully...");
         
    		
            
			}catch(ClassNotFoundException | SQLException e) {	
			e.printStackTrace();
			System.out.println("Exeception raised....");
			
		}
	}

}

