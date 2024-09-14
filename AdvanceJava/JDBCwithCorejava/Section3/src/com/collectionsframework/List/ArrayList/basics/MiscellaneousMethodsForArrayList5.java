package com.collectionsframework.List.ArrayList.basics;

import java.util.ArrayList;

public class MiscellaneousMethodsForArrayList5 {

	public static void main(String[] args) {
		ArrayList l1 = new ArrayList();
		l1.add("Dog");
		l1.add("Tiger");
		l1.add(10);
		l1.add('c');
		l1.add(123.321);
		l1.add("Panda");
		
		Object[] a = l1.toArray();
		System.out.println(a);
		System.out.println("\n\nElements are:- \n");
		for(Object o: a)
			System.out.println(o);
	}

}
