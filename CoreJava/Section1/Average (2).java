
import java.util.Scanner;
 class Average
  {
    public static int max(int a,int b,int c)
    {
      if(a>b && a>c){
      System.out.println("a is maximum");
      }
      esle if(b>a && b>c){
       System.out.println("b is maximum");
      }
      else{
       System.out.println("c is maximum");
        }
        } 
     public static int min(int a,int b,int c)
      {
     if(a<b && a<c){
      System.out.println("a is minimum");
      }
      esle if(b<a && b<c){
       System.out.println("b is minimum");
      }
      else{
       System.out.println("c is minimum");
       }
       }
      public static void main(String[] args)
      {
       Scanner sc=new Scanner (System.in);
       System.out.println(ENTER THREE VALUES:-);
       int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println( max(a,b,c),min(a,b,c));
       }
    }
      