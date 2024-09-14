import java.util.Scanner;
class Calculator$
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 1 for Addition :");
	System.out.println("Enter 2 for Sub :");
	System.out.println("Enter 3 for MUL :");
	System.out.println("Enter 4 fro Div :");
	System.out.println("Enter 5 for Exit :");
	System.out.print("Enter Your Choice :");

	int x=sc.nextInt();
    {
     	if(x==1){
		System.out.println("Enter 1st Num");
		double num1=sc.nextDouble();
		System.out.println("Enter 2nd Num");
		double num2=sc.nextDouble();

		System.out.println("The Sum Of num1 and num2 is ="+add(num1,num2));

	}
	if(x==2){
		System.out.println("Enter 1st Num");
		double num1=sc.nextDouble();
		System.out.println("Enter 2nd Num");
		double num2=sc.nextDouble();

		System.out.println("The Sub Of num1 and num2 is ="+sub(num1,num2));


	}
	if(x==3){
		System.out.println("Enter 1st Num");
		double num1=sc.nextDouble();
		System.out.println("Enter 2nd Num");
		double num2=sc.nextDouble();

		System.out.println("The mul Of num1 and num2 is ="+mul(num1,num2));
	}
	if(x==4){
		System.out.println("Enter 1st Num");
		double num1=sc.nextDouble();
		System.out.println("Enter 2nd Num");
		double num2=sc.nextDouble();

		System.out.println("The Div Of num1 and num2 is ="+div(num1,num2));
	}
	else{
		
		
	}
     
	
	
	}
	public static double add(double num1,double num2)
	{
		return num1+num2;

	}
	public static double sub(double num1,double num2)
	{
		return num1-num2;

	}
	public static double mul(double num1,double num2)
	{
		return num1*num2;

	}
	public static double div(double num1,double num2)
	{
		return num1/num2;

	}
	

	
   
}