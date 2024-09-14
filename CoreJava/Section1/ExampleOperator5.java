class ExampleOperator5
{
	
	public static void main(String[] args)
	{
		int p = 5 , q = 9, r = 3;
		int a = (--p * q++) - (r-- / ++p) + (q * --r) - (p % q);
		System.out.println(a);
	}
}