package employee.management.system;

import java.sql.*;
public class Connections {
    
    Connection c;
    Statement s;

    public Connections() {
        try {
            
            c = DriverManager.getConnection("jdbc:mysql:///employeemanage","root","toor");
            
            s = c.createStatement();
            
//            c.close();
        } 
        catch (Exception e) {
            System.out.println(e);
        }
    }
    
    
}
