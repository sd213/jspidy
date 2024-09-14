class Example
{
	public static void main(String[] args)
	{
		final int a = 10;
		int b = ++a;
		System.out.println(a);
	}
}
/*
	java .\ExampleOperator2.java
	.\ExampleOperator2.java:6: error: cannot assign a value to final variable a
					int b = ++a;
                          ^
	1 error
	error: compilation failed

*/

