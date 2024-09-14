 class Demo
 {

    Demo
    {
	    Demo(){}
	    Demo(int y){}
	    Demo(double x){}
	    Demo(int x1,double y){}
	    Demo(double y,int x){}

    }
    public static void display()
    {

    }
}
class DemoMain
{
	public static void main(String[] args)
	{
	Demo d=new Demo();
	System.out.println(Demo());
	System.out.println(Demo(10));
	System.out.println(Demo(76.17f));
	System.out.println(Demo(10,12.2d));
	

	System.out.println(Demo(100.4d,22));
	
	}
}
