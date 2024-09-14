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