package composition;


public class B{
	public static void main(String[]args) throws ClassNotFoundException{
		Class c1 = Class.forName("composition.A");
		System.out.println(c1);
	}
}