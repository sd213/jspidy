package employee.management.system;

import java.util.Scanner;

public class EmployeeDriver {

    Scanner sc = new Scanner(System.in);

    public EmployeeDetails addEmpDetails() {

        System.out.println("Enter Employee id");
        int id = sc.nextInt();

        System.out.println("Enter Employee Name");
        String name = sc.next();

        System.out.println("Enter Employee Designation");
        sc.nextLine();
        String desig = sc.next();

        System.out.println("Enter Employee Salary");
        double salary = sc.nextDouble();

        System.out.println("Enter Employee Age");
        int age = sc.nextInt();

        System.out.println("Enter Employee Phone Number");
        String phno = sc.next();

        EmployeeDetails ed = new EmployeeDetails(id, name, desig, salary, age, phno);

        return ed;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        EmployeeDriver e = new EmployeeDriver();
        EmployeeDetails empDet = new EmployeeDetails();

        System.out.println("Select an Option\n--------------------------\n1. Add Employee\n2. Display Employees\n3. Update Employee\n4. Remove Employee\n5. Exit");
        int ch = new Scanner(System.in).nextInt();

        while (ch != 5) {
            switch (ch) {
                case 1:
                    empDet = e.addEmpDetails();
                    empDet.addEmpsDatabse();
                    System.out.println("\nEmployee added Successfully");
                    break;
                
                case 2:
                    empDet.displayEmps();
                    break;
                
                case 3:
                    empDet.updateEmps();
                    break;
                
                case 4:
                    empDet.removeEmps();
                    break;

                default:
                    System.out.println("Invalid Choice!!!!");
                    break;
            }

            System.out.println("\nSelect an Option\n--------------------------\n1. Add Employee\n2. Display Employees\n3. Update Employee\n4. Remove Employee\n5. Exit");
            ch = new Scanner(System.in).nextInt();
        }
        
        System.out.println("Thank you for using the Application :) :)\nVisit Again :)");
    }
}
