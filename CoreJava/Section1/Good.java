class Good
{
  public static int add()
  {
   int a=10;
   int b=20;
   
   int sum=a+b;
   
   System.out.println(sum);
   sub();
   return sum;
   }
    public static int sub()
    {
     int a=80;
     int b=10;
     int sub=a-b;
      System.out.println(sub);
      return sub;
      
     }
	public static void main(String[] args)
	{
         System.out.println("main method begins");
	System.out.println(add());
         
	
	
	System.out.println("main method ends");
	}
 }
	