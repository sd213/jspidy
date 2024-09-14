public class InterfaceWithPrivateMethods3 implements A
{
	public static void main(String[] args) {
        System.out.println("Hello, World!");
		InterfaceWithPrivateMethods3 a = new InterfaceWithPrivateMethods3();
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