// factorial using recursion
import java.util.Scanner;
class Factiorial
{
	public static int factorial(int num)
	{
		if(num>=1){
			
			return num*factorial(num-1);

		}else{
		
			return 1;
		
		}

    }
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your Number : ");
		int num=sc.nextInt();
		int res=factorial(num);
		System.out.println("result is : "+res);


	}
}
