class ExampleOperator9
{
	public static void main (String [] args)
	{
		int p = 18, q = 11;
		int result = ( p >= q ) ? (( p % q == 0 ) ? ( p / q ) : ( p - q )) : (( q % p == 0 ) ? ( q / p ) : ( q + p ));
	
		System.out.println(result);
	}
}
	