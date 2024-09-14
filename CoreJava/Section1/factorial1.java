public class factorial1
{
	public static void main(String [] args)
	{
		System.out.println(factorial(5));
	}
	public static int  factorial(int num)
	{
		if(num>0)
		{
			return num * factorial(num - 1);
		}
		else
		{	
			return 1;
		}
	}
}