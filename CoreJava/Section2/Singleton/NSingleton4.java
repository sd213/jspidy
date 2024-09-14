class NSingleton4
{
		private static  NSingleton4 single  = new NSingleton4();
		private NSingleton4()
		{
		
		}
		public static  NSingleton4 getInstance()
		{
			
			return single;
		}
		
}
class SingleDemo4
{
	public static void main(String[]args){
		NSingleton4 s1 = NSingleton4.getInstance();
		NSingleton4 s2 = NSingleton4.getInstance();
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
/*
Same
S1: NSingleton4@f6f4d33
S2: NSingleton4@f6f4d33
	
*/