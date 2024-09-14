import java.util.Scanner;
class Employee5
       {
	static String mgr;
	String name;
	int id;
	long phone;
	int salary;
       
	public void m1()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your MGR Name :");
	this.mgr=sc.next();
	System.out.println("Enter your Name :");
       this.name=sc.next();
	System.out.println("Enter your Id :");
	this.id=sc.nextInt();
	System.out.println("Enter your Phone :");
	this.phone=sc.nextLong();
	System.out.println("Enter your Salary :");
       this.salary=sc.nextInt();
	}
	public void Display()
	{
		System.out.println("+++++++++++++++");
	System.out.println("Yur Manager name is:"+mgr);
	System.out.println("your name is"+name);
	System.out.println("YOUR id"+id);
	System.out.println("Youe phone"+phone);
	System.out.println("YOur salary"+salary);
	}
}
	
	
class EmployeeMain12
{
	public static void main(String[] args)
	{
	
	Employee5 e=new Employee5();
	System.out.println("Enter your Details :");

	e.m1();
	e.Display();
	}
}



	