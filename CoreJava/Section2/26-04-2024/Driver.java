class BankInterestDriver
{
	public static void main(String[]args)
	{	java.util.
		RBI R;
		R = new ICICI();
		System.out.println("Rate of Interest of ICICI Bank is "+ R.rateOfInterest());
		
		R = new SBI();
		System.out.println("Rate of Interest of SBI Bank is "+ R.rateOfInterest());
		
		R = new HDFC();
		System.out.println("Rate of Interest of HDFC Bank is "+ R.rateOfInterest());
		
		R = new AXIS();
		System.out.println("Rate of Interest of AXIS Bank is "+ R.rateOfInterest());
	}
}
class RBI
{
	public int rateOfInterest()
	{
		return 0;
	}
}

class ICICI extends RBI
{
	
	public int rateOfInterest()
	{
		return 5;
	}
}

class HDFC extends RBI
{
	
	public int rateOfInterest()
	{
		return 10;
	}
}
class SBI extends RBI
{
	
	public int rateOfInterest()
	{
		return 12;
	}
}
class AXIS extends RBI
{
	
	public int rateOfInterest()
	{
		return 15;
	}
}	