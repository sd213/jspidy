class Employee
{
	int id;
	String name;
	String job;
	double salary;
	long phone;



	Employee(){
	
	}
	Employee(int id){
	this.id=id;
	}
	Employee(int id,String name){
	this.id=id;
	this.name=name;
	}
	Employee(int id,String job,double salary){
	this.id=id;
	this.job=job;
	this.salary=salary;
    
	}
	Employee(int id,String name,String job,double salary,long phone){
	this.id=id;
	this.name=name;
	this.job=job;
	this.salary=salary;
	this.phone=phone;

	}


	public  void Display()
	{
	System.out.println("+++++++++++++++++");
	System.out.println("Your Id Is :"+this.id);
	System.out.println("Your NAme is :"+this.name);
	System.out.println("Your Designation is "+this.job);
	System.out.println("Your Sal is :"+this.salary);
	System.out.println("Your Phone Number is :"+this.phone);
	System.out.println("+++++++++++++++++");


	}


}
class EmployeeMain6
{
	public static void main(String[] args)
	{
		Employee e=new Employee();
		Employee e1=new Employee(20);
		Employee e2=new Employee(20,"Srikanth");
		Employee e3=new Employee(20,"CEO",4000.0d);
		Employee e4=new Employee(20,"Shubham","Developer",234.0d,1234567890l);
		e.Display();
		e1.Display();
		e2.Display();
		e3.Display();
		e4.Display();


	}
}