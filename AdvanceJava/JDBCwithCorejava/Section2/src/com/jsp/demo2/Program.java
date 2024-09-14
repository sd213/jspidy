package com.jsp.demo2;

import com.jsp.demo.Sample;

public class Program {
	public static void main(String[] args) {
		Sample s = new Sample();
		s.test();
//		s.test3(); //The default accesses modifier method test3() from the type Sample is not visible as it is declared in different package;
	}
}
