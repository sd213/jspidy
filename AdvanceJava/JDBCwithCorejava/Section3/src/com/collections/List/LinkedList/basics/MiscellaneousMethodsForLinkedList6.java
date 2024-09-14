package com.collections.List.LinkedList.basics;

import java.util.LinkedList;

public class MiscellaneousMethodsForLinkedList6 {

	public static void main(String[] args) {
		
		LinkedList l1 = new LinkedList();
		l1.add("Dog");
		l1.add("Tiger");
		l1.add(10);
		l1.add('c');
		l1.add(123.321);
		l1.add("Panda");
		
		Object[] a = convertListToArray(l1);
		System.out.println(a);
		System.out.println("\n\nElements are:- \n");
		for(Object o: a)
			System.out.println(o);

	}
	public static Object[] convertListToArray(LinkedList l) {
		Object[] objectArr = new Object[l.size()]; // creating a new Array based on Object with size of l
		
		
		for(int i = 0 ; i < l.size(); i++)
			objectArr[i] = l.get(i); // Assigning each element at index to corresponding objectArr
		
		return objectArr;
	}

}
