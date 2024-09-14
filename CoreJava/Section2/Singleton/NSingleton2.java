class NSingleton2
{
		private static  NSingleton2 single  = new NSingleton2();
		private NSingleton2()
		{
		
		}
		public static final NSingleton2 getInstance()
		{
			
			return single;
		}
		
}
class SingleDemo2
{
	public static void main(String[]args){
		NSingleton2 s1 = NSingleton2.getInstance();
		NSingleton2 s2 = NSingleton2.getInstance();
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