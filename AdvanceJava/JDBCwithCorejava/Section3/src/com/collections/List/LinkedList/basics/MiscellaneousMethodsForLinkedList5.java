package com.collections.List.LinkedList.basics;

import java.util.LinkedList;

public class MiscellaneousMethodsForLinkedList5 {

	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
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
