public class Add8
{
	public static void main (String[] args)
	{
		add();
	}
	public static void add()
	{
		int a = 30, b = 20;
		return;
		System.out.println(a+b);
	}
}
/*
	.\Add8.java:11: error: unreachable statement
                System.out.println(a+b);
                ^
	1 error
	error: compilation failed
*/