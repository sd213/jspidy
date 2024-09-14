package com.jsp.demo;

public class Sample {
	public void test()
	{
		System.out.println("Public Method");
	}
	
	private void test2()
	{
		System.out.println("Private Method");
	}
	void test3()
	{
		System.out.println("Void Method");
	}
	protected void test4() {
		System.out.println("Protected Method");
	}
	public static void main(String[] args)      	{
		Sample s1 = new Sample();
		s1.test();
		s1.test2();
		s1.test3();
		s1.test4();
	}
}
