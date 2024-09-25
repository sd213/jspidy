package org.sd;

public class ClassB extends ClassA{
	
	@Override
	public int m1() {
		return 1000;
	}
	public static void main(String[] args) {
		int m = new ClassB().m1();
		System.out.println(m);
	}

}
