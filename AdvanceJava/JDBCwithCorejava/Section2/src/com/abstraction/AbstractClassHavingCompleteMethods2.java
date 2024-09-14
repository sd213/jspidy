package com.abstraction;

abstract class Demo1{
	public void display() {
		System.out.println("hello");
	}
	public void run() {
		System.out.println("bye");
	}
}
public class AbstractClassHavingCompleteMethods2 extends Demo1{

	public static void main(String[] args) {
		AbstractClassHavingCompleteMethods2 d = new AbstractClassHavingCompleteMethods2();
		d.display();
		d.run();
	}

}
