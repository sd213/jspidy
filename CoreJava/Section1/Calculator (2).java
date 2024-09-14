import java.util.Scanner;

 
   class Calculator
   {
    public static double addition(double a,double b)
     {
    double c=a+b;
     return c;
    }
      public static double subtraction(double a,double b)
   {
    double c=a-b;
    return c;
    }
    public static double mul(double a,double b)
    {
     double c=a*b;
     return c;
     }
     public static double div(double a,double b)
     {
      double c=a/b;
      return c;
      }
     public static double mod(double a,double b)
     {
      double c=a%b;
      return c;
      }
     public static void main(String[] args)
    {
     int i=0;

     while(i==0)
     {
      
        System.out.println("1.  Addition");
        System.out.println("2.  subtraction");
        System.out.println("3.  mul");
	System.out.println("4.  div");
	System.out.println("5.  mod");
	System.out.println("6.  exit");
         
          Scanner sc=new Scanner (System.in);
         System.out.println("ENTER YOUR CHOICE");
          
          double value=sc.nextInt();
       
       
       if(value==1){
        System.out.println("YOU Selected Addition");
        System.out.println("enter 1 value");
        double a=sc.nextDouble();
        System.out.println("enter 2 value");
        double b=sc.nextDouble();
         
	System.out.println(addition( a,b));
        System.out.println("the sum of two value is "+ addition(a,b) );
        

        }
       else if(value==2){
         
         System.out.println("YOU Selected subtraction");
        System.out.println("enter 1 value");
        double a=sc.nextDouble();
        System.out.println("enter 2 value");
        double b=sc.nextDouble();
         
	System.out.println(subtraction( a,b));
        System.out.println("the sub of two value is "+subtraction(a,b) );
  
        }
        else if(value==3){
         System.out.println("YOU Selected mul");
        System.out.println("enter 1 value");
        double a=sc.nextDouble();
        System.out.println("enter 2 value");
        double b=sc.nextDouble();
         
	System.out.println(mul( a,b));
        System.out.println("the mul of two value is "+mul(a,b) );
            }
            else if(value==4){
         
         System.out.println("YOU Selected div");
        System.out.println("enter 1 value");
        double a=sc.nextDouble();
        System.out.println("enter 2 value");
        double b=sc.nextDouble();
         
	System.out.println(div( a,b));
        System.out.println("the div of two value is "+div(a,b) );
  
        }
         else if(value==5){
         
         System.out.println("YOU Selected mod");
        System.out.println("enter 1 value");
        double a=sc.nextDouble();
        System.out.println("enter 2 value");
        double b=sc.nextDouble();
         
	System.out.println(mod( a,b));
        System.out.println("the % of two value is "+mod(a,b) );
  
        }
	else {
        
       System.out.println("THANK YOU FOR USING CALCULATOR ");
       }
       
        
    }
  }
}
       
