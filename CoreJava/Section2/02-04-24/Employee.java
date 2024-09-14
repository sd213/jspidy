class Employee
{
	static String manager;
	int id;
	String name;
	String job;
	long salary;
	
	class EmployeeMain
	{
	public static void main(String[] args)
	{
	Employee e=new Employee();
	System.out.println("======================================");
	System.out.println("The Manager Name Is :"+Employee.manager);
	System.out.println("The Employee Name Is :"+e.name);
	System.out.println("The employee ID Is:"+e.id);
	System.out.println("The Employee Job Is :"+e.job);	
	System.out.println("The Employee Salary Is :"+e.salary);
	System.out.println("======================================");
	e.id=202;
	e.name='HARI';
	e.job='Developer';
	e.salary=10000000000000000000l;
	Employee.manager='SRIKANTH';
	System.out.println("======================================");
	}
	}
 }
	
