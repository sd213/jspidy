class ExampleOperator6
{
	public static void main(String[] args)
	{
		int a = 7;
		int b = 4;
		int c = 9;
		
		boolean result = ((a>b) && (b<c)) || ((a != b) && ( c >= a));
		System.out.println(result); //true
	}
}