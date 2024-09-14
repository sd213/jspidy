class StudentMain
{
	public static void main(String[] args) 
	{
		Student s1 = new Student();	
		Student s2 = new Student('m');
		Student s3 = new Student(21,'f');
		Student s4 = new Student("Akhil",32,'m');
		Student s5 = new Student(1,"Rohan",24,'m');

		s1.displayDetails();
		System.out.println("======");
		s2.displayDetails();
		System.out.println("=====");
		s3.displayDetails();
		System.out.println("=====");
		s4.displayDetails();
		System.out.println("=====");
		s5.displayDetails();



	}
}
class Student
{
	int id;
	String name;
	int roll_no;
	char gender;

	Student(int id,String name,int roll_no,char gender)
	{
		this(name,roll_no,gender);
		this.id = id;
	}

	Student(String name,int roll_no,char gender)
	{
		this(roll_no,gender);
		this.name = name;
	}

	Student(int roll_no,char gender)
	{
		this(gender);
		this.roll_no = roll_no;
		
	}

	Student(char gender)
	{
		this.gender = gender;
	}

	Student()
	{

	}


	public void displayDetails()
	{
		System.out.println("Name is :"+name);
		System.out.println("Id is :"+id);
		System.out.println("Roll number is :"+roll_no);
		System.out.println("Gender is "+gender);
	}






}


