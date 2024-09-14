public class Add6
{
	public static void main (String[] args)
	{
		add();
	}
	public static void add()
	{
		int a = 30, b = 20;
		System.out.println(a+b);
		return 10;
		/*
			.\Add6.java:11: error: incompatible types: unexpected return value
                return 10;
                       ^
			1 error
			error: compilation failed
			
		*/
	}
}