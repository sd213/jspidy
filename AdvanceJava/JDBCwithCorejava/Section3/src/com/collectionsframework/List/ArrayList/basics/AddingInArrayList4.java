//	addAll(index,Collection) :- It is used to add object of given collection into current collection at given particular index.
package com.collectionsframework.List.ArrayList.basics;

import java.util.ArrayList;

public class AddingInArrayList4 {

	public static void main(String[] args) {
		
		ArrayList l1 = new ArrayList();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		
		ArrayList l2 = new ArrayList();
		l2.add(40);
		l2.add(200);
		l2.add(300);
		
		System.out.println("Before Modifying:-");
		System.out.println(l1);
		System.out.println(l2);
		
		l1.addAll(2, l2);
		System.out.println("After Modifying:-");
		System.out.println(l1);
		System.out.println(l2);
		
	}

}
