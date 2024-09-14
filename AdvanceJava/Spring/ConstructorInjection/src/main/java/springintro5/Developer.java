package springintro5;

public class Developer {

	

	

	public String name;
	public int age;
	public double sal;
	public String email;
	private Computer comp;
	
	public Developer() {
		System.out.println("Developer no argument Constructor ... ");
	}
	public Developer(String name) {
		this.name = name;
		System.out.println("Developer with one argument Constructor ...");
	}
	public Developer(String name , int age ) {
		this.name = name;
		this.age = age;
		System.out.println("Developer with two argument Constructor...");
	}
	public Developer(String name, int age, double sal) {
		this.name = name;
		this.age = age;
		this.sal = sal;
		System.out.println("Developer with 3 argument Constructor");
	}
	public Developer(String name,int age ,double sal,String email,Computer comp) {
		this.name = name;
		this.age = age;
		this.sal = sal;
		this.email = email;
		this.comp = comp;
		System.out.println("Developer with 5 argument Constructor");
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Computer getComp() {
		return comp;
	}

	public void setComp(Computer comp) {
		this.comp = comp;
	}
	
	public void code() {
		comp.compile();
	}
	@Override
	public String toString() {
		return "Developer [name=" + name + ", age=" + age + ", sal=" + sal + ", email=" + email + ", comp=" + comp
				+ "]";
	}

	
	
}
