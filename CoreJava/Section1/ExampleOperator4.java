class ExampleOperator4
{
	public static void main(String[] args)
	{
		int a = 5; int b = 3 ; int c = 7;
		int result = (++a * b--) + (c++ / --a) - (b * ++c);
		System.out.println(result);
	}
}