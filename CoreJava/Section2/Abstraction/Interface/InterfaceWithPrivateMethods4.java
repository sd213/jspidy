public class InterfaceWithPrivateMethods4 implements A
{
	public static void main(String[] args) {
        A a = new A(){};
		//a.m1();
		//a.m2();
		a.test();
	}
}
interface A
{
	private void m1()
	{
		System.out.println("Private non-static Method");
	}
	private static void m2()
	{
		System.out.println("Private Static Method");
	}
	default void test()
	{
		m1();
		m2();
		A.m2();
	}
}