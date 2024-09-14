class NSingleton3
{
		private static  final NSingleton3 single  = new NSingleton3();
		private NSingleton3()
		{
		
		}
		public static final NSingleton3 getInstance()
		{
			
			return single;
		}
		
}
class SingleDemo3
{
	public static void main(String[]args){
		NSingleton3 s1 = NSingleton3.getInstance();
		NSingleton3 s2 = NSingleton3.getInstance();
		if(s1 == s2)
		{
			System.out.println("Same");
			System.out.println("S1: "+s1);
			System.out.println("S2: "+s2);
		}
		else{
			System.out.println("Different");
			System.out.println("S1: "+s1);
			System.out.println("S2: "+s2);
		}
	}
}