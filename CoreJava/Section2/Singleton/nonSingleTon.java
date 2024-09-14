class NSingleton
{
		private static NSingleton single;
		private NSingleton()
		{
		
		}
		public static NSingleton getInstance()
		{
			single = new NSingleton();
			return single;
		}
		
}
class SingleDemo
{
	public static void main(String[]args){
		NSingleton s1 = NSingleton.getInstance();
		NSingleton s2 = NSingleton.getInstance();
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
Different
S1: NSingleton@f6f4d33
S2: NSingleton@23fc625e
*/