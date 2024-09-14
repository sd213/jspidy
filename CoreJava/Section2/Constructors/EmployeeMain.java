class Employee
{
	static String manager;
	int id;
	String name;
	String job;
	long salary;
	public void Display()
	{
	System.out.println("======================================");
	System.out.println("The Manager Name Is :"+Employee.manager);
	System.out.println("The Employee Name Is :"+e.name);
	System.out.println("The employee ID Is:"+e.id);
	System.out.println("The Employee Job Is :"+e.job);	
	System.out.println("The Employee Salary Is :"+e.salary);
	System.out.println("======================================");
	System.out.println("The Manager Name Is :"+Employee.manager);
	System.out.println("The Employee Name Is :"+e2.name);
	System.out.println("The employee ID Is:"+e2.id);
	System.out.println("The Employee Job Is :"+e2.job);	
	System.out.println("The Employee Salary Is :"+e2.salary);
	System.out.println("======================================");
	System.out.println("The Manager Name Is :"+Employee.manager);
	System.out.println("The Employee Name Is :"+e3.name);
	System.out.println("The employee ID Is:"+e3.id);
	System.out.println("The Employee Job Is :"+e3.job);	
	System.out.println("The Employee Salary Is :"+e3.salary);
	
	
	
	}

	
	
 }
	class EmployeeMain
	{
	public static void main(String[] args)
	{
	e.Display();
	Employee e=new Employee();
	e.Display();
	e.id=202;
	e.name="HARI";
	e.job="Developer";
	e.salary=1234567890l;
	Employee.manager="SRIKANTH";
	System.out.println("FIRST EMPLOYEE DETAILS");
	e.Display();
	
	Employee e2=new Employee();
	e.id=262;
	e.name="sathya";
	e.job="Tester";
	e.salary=4564567890l;
	Employee.manager="SRIKANTH";
	System.out.println("Second EMPLOYEE DETAILS");
	
	e2.Display();

	

	
	Employee e3=new Employee();
	System.out.println("Third EMPLOYEE DETAILS");
	
	e3.Display();

	
	

	
	
   	
	}
	}


	
