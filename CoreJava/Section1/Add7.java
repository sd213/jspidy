public class Add7
{
	public static void main (String[] args)
	{
		add();
	}
	public static int add()
	{
		int a = 30, b = 20;
		System.out.println(a+b);
		return;
	}
}
/*
	.\Add7.java:11: error: incompatible types: missing return value
                return;
                ^
	1 error
	error: compilation failed
*/