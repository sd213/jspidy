class ExampleOperator3
{
	public static void main(String[] args)
	{
		int x = 10;
		int y = 5;
		int result = (++x * y--) + (x++ / --y);
		System.out.println(x);		//12
		System.out.println(y);		//3
		System.out.println(result);		//58
	}
}