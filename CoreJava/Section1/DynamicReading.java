import java.util.Scanner;
class DynamicReading
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("ENTER THREE VALUES:");
  int a=sc.nextInt();
  int b=sc.nextInt();
  int c=sc.nextInt();
  System.out.println(avarage(a+b+c));
  
  }
	public static int average(int a,int b,int c)
        {
	int average=(a+b+c)/3;
         }
}
     