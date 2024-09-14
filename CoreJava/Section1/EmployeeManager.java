class Details{
	
	
	
	public static void main(String[] args)
	{
		Employee emp1 = new Employee();
		emp1.e_name = "Som Das";
		emp1.e_designation = "Junior Developer";
		emp1.e_salary = 145343.34;
		emp1.e_manager = "SMith";
		
		System.out.println("Employee:" + emp1);
		System.out.println("#############Employee Name : "+  emp1.e_name + "#############");
		System.out.println("Employee Designation : " + emp1.e_designation);
		System.out.println("Employee Salary : " + emp1.e_salary );
		System.out.println("Manager of Employee : " + emp1.e_manager);
	    
		
		System.out.println("=========================================");
		System.out.println("=========================================");
		System.out.println("-----------------------------------------");
		System.out.println("_________________________________________");

		Employee emp2 = new Employee();
		emp2.e_name = "Leo Das";
		emp2.e_designation = "Senior Developer";
		emp2.e_salary = 545343.34;
		
		System.out.println("Employee:" + emp2);
		System.out.println("#############Employee Name : "+  emp2.e_name + "#############");
		System.out.println("Employee Designation : " + emp2.e_designation);
		System.out.println("Employee Salary : " + emp2.e_salary );
		System.out.println("Manager of Employee : "+ emp2.e_manager);
	}
	
}
class Employee{
	int e_id;
	String e_name;
	static String e_manager;
	String e_designation;
	double e_salary;
}