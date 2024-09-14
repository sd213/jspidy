class Student{
	public static void main(String[] args)
	{
		Institute st1 = new Institute();
		
		st1.profName = "Namita Dash";
		st1.dept = "Computer Science ";
		st1.institute = "TempleCity Institute of Technology ";
		st1.stdName = "Somit Das";
		st1.stdID = 3212;
		st1.age= 24;
		st1.steamName = "Master";
		st1.Courses = " Basic Electronics , Basic Electrical , Basic Mechanical , Basic Physics ,Basic Chemistry , Basic Mathematics , Programming ,Data Structure and Algorithm , Computer Networks, Computer Architecture , Theory of Computation, Software Engineering ,Compiler Theory , Organisation and Behaviour";
		
		
		
		Details(st1);
		
		
		Institute st2 = new Institute();
		
		st2.profName = "Satya Prakash sahoo";
		st2.dept = "Electrical and Electronics Engineering ";
		st2.institute = "TempleCity Institute of Technology ";
		st2.stdName = "Leo Das";
		st2.stdID = 4512;
		st2.age = 19;
		st2.steamName = "Bacherlor";
		st2.Courses = " Basic Electronics , Basic Electrical , Basic Mechanical , Basic Physics ,Basic Chemistry , Basic Mathematics , Digital Logic , Digital Signal Theory, Network Theory , VLSI Technology, Computer Architecture , Theory of Computation, Compiler Theory , Organisation and Behaviour";
		
		Details(st2);
		
	}
	public static void Details(Institute st){
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("###########################################"+st+"+##################################################");
		System.out.println("##############################"+st.institute+"+#######################################");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("############ Student Name: "+ st.stdName );
		System.out.println("############ Student ID : " + st.stdID);
		System.out.println("############ Institute :"+ st.institute);
		System.out.println("############ Student Age : " + st.age);
		System.out.println("############ Student dept : " + st.dept);
		System.out.println("############ Student Steam :" + st.steamName);
		System.out.println("############ Student Courses : " +st.Courses);
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("#############################################################################");
		System.out.println();
		System.out.println();
		System.out.println();
	}
}
class Institute{
	static String institute;
	String dept;
	String steamName;
	String profName;
	String stdName;
	int stdID;
	int age;

	String Courses;
}