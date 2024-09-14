// wap to declare static variable in a class and try to access in same class and differenr class.

class Demo
{
    static int x;
     public static void main(String[] args)
     {
    int x=10;
    System.out.println("Main method begins");
    System.out.println(x);
    System.out.println(Demo.x);
     m1();
    }
    

    public static void m1()
   {
    Demo.x=25;
    System.out.println(Demo.x);
    System.out.println("Main method ends");
    sample.m1();
   }


}

class sample
{
  public static void m1()
  {
   System.out.println(Demo.x);
   }
}




