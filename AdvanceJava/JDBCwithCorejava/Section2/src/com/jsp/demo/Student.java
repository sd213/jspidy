package com.jsp.demo;

public class Student {
	String name = "ram";
	int age = 23;
	
	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s. name + " "+s.age);
		Sample s1 = new Sample();
		s1.test();
//		s1.test2(); // can't access private method in same package
		s1.test3(); // can access default which is package private 
		s1.test4();
	}
}
