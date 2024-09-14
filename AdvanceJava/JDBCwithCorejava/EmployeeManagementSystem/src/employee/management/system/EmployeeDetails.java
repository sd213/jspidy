package employee.management.system;

import java.sql.*;
import java.util.*;

public class EmployeeDetails {

    int eid, emp_age;
    String emp_name, designation, emp_phno;
    double salary;
    
    Connections c = new Connections();
    
    Scanner sc = new Scanner(System.in);

    public EmployeeDetails() {
    }

    public EmployeeDetails(int eid, String emp_name, String designation, double salary, int emp_age, String emp_phno) {
        this.eid = eid;
        this.emp_name = emp_name;
        this.designation = designation;
        this.salary = salary;
        this.emp_age = emp_age;
        this.emp_phno = emp_phno;
    }

    public void addEmpsDatabse() {
        try {
            String query = "insert into employee values('" + eid + "','" + emp_name + "','" + designation + "','" + salary + "','" + emp_age + "','" + emp_phno + "')";
            
            c.s.executeUpdate(query);
        } 
        catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public void displayEmps()
    {
        try {
            String query = "select * from employee";
            
            ResultSet rs = c.s.executeQuery(query);
            
            while(rs.next())
            {
                System.out.println("\n"+rs.getInt("empid")+" "+rs.getString("empName")+" "+rs.getString("empDesignation")+" "+rs.getInt("empSalary")+
                        " "+rs.getInt("empAge")+" "+rs.getString("empPhno"));
            }
            
            rs.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public void updateEmps()
    {
        ArrayList<Integer> al = new ArrayList<>();
          
        try {
            String query = "select * from employee";
            ResultSet rs = c.s.executeQuery(query);
            while(rs.next())
                al.add(rs.getInt("empid"));
            
            rs.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
        
        
        System.out.println("Enter the Employee id");
        eid = sc.nextInt();
        
        String query2;
        
        for(int i = 0; i < al.size(); i++)
        {
            if(eid == al.get(i))
            {
                System.out.println("\nWhich Employee Details You want to Update?\n1. Name\n2. Designation\n3. Salary\n4. Age\n5. Contact No.\n6. Exit");
                int ch = sc.nextInt();
                
                while(ch != 6)
                {
                    switch (ch) 
                    {
                        case 1 -> {
                            System.out.println("\nEnter Your Name");
                            emp_name = sc.next();
                            try {
                                query2 = "update employee set empName = '"+emp_name+"' where empid='"+eid+"'";
                                c.s.executeUpdate(query2);
                                
                                System.out.println("Name Updated Sucessfully");
                            } 
                            catch (SQLException e) {
                            }
                        }
                            
                        case 2 -> {
                            System.out.println("\nEnter Your Designation");
                            designation = sc.next();
                            try {
                                query2 = "update employee set empDesignation = '"+designation+"' where empid='"+eid+"'";
                                c.s.executeUpdate(query2);
                                
                                System.out.println("Designation Updated Sucessfully");
                            } 
                            catch (SQLException e) {
                            }
                        }
                            
                        case 3 -> {
                            System.out.println("\nEnter Your Salary");
                            salary = sc.nextDouble();
                            try {
                                query2 = "update employee set empSalary = '"+salary+"' where empid='"+eid+"'";
                                c.s.executeUpdate(query2);
                                
                                System.out.println("Salary Updated Sucessfully");
                            } 
                            catch (SQLException e) {
                            }
                        }
                            
                        case 4 -> {
                            System.out.println("\nEnter Your Age");
                            emp_age = sc.nextInt();
                            try {
                                query2 = "update employee set empAge = '"+emp_age+"' where empid='"+eid+"'";
                                c.s.executeUpdate(query2);
                                
                                System.out.println("Age Updated Sucessfully");
                            } 
                            catch (SQLException e) {
                            }
                        }
                            
                        case 5 -> {
                            System.out.println("\nEnter Your Contact No.");
                            emp_phno = sc.next();
                            try {
                                query2 = "update employee set empPhno = '"+emp_phno+"' where empid='"+eid+"'";
                                c.s.executeUpdate(query2);
                                
                                System.out.println("Contact No. Updated Sucessfully");
                            } 
                            catch (SQLException e) {
                            }
                        }
                        default -> System.out.println("Invalid Choice!!!!");
                    }
                    System.out.println("\nWhich Employee Details You want to Update?\n1. Name\n2. Designation\n3. Salary\n4. Age\n5. Contact No.\n6. Exit");
                    ch = sc.nextInt();
                }
            }
        }
    }
    
    public void removeEmps()
    {
        ArrayList<Integer> al = new ArrayList<>();
          
        try {
            String query = "select * from employee";
            ResultSet rs = c.s.executeQuery(query);
            while(rs.next())
                al.add(rs.getInt("empid"));
            
            rs.close();
        } 
        catch (SQLException e) {
            System.out.println(e);
        }
        
        
        System.out.println("Enter the Employee id");
        eid = sc.nextInt();
        
        String query2;
        
        for(int i = 0; i < al.size(); i++)
        {
            if(eid == al.get(i))
            {
                try {
                    query2 = "delete from employee where empid='"+eid+"'";
                
                    c.s.executeUpdate(query2);
                    
                    System.out.println("Employee deleted successfully");
                } 
                catch (SQLException e) {
                    System.out.println(e);
                }
            }
        }
    }

//    public void displayEmps() {
//        System.out.println(eid + " " + emp_name + " " + designation + " "
//                + emp_age + " " + salary + " " + emp_phno);
//    }
}
