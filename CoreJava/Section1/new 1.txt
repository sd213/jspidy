class ExampleOperator12
{
	public static void main(String[] args)
	{
		int a = 12 , b = 13 ,x = 2 , y = 5 , z = 14, c = 8;
		boolean result = ((a * b) > (c - b)) && ((x % y != 0)||((z / x) == (y + b))) ? true : false ;
		System.out.println(result);
		
		int m = 001 , n = 010 , p = 100;
		int answer = --m + n++ - p-- - --p + ++n - --m + n-- - --m;
		System.out.println(answer);
	}
}