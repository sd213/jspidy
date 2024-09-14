class ExampleOperator1
{
	public static void main(String[] args)
	{
		boolean b = false;
		b++;
		System.out.println(b);
	}
}
/*
will print 
.\ExampleOperator1.java:6: error: bad operand type boolean for unary operator '++'
                b++;
                 ^
1 error
error: compilation failed

*/