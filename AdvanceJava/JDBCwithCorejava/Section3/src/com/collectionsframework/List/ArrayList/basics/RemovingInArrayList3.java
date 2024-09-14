// retainAll(Collection) :- It is used to remove unique object or elements from current collection and keeping only duplicate objects.
package com.collectionsframework.List.ArrayList.basics;

import java.util.ArrayList;

public class RemovingInArrayList3 {

	public static void main(String[] args) {
		ArrayList l1 = new ArrayList();
		l1.add("X1 Super");
		l1.add("rx 100");
		l1.add("Pulsar");
		l1.add("rx 100");
		
		ArrayList l2 = new ArrayList();
		l1.add("BMW");
		l2.add("Bajaj");
		l2.add("rx 100");
		l2.add("FZ");
		System.out.println("\nBefore Perfroming RetainAll():- ");
		System.out.println(l1);
		System.out.println(l2);
		
		l1.retainAll(l2);
		
		System.out.println("\nAfter Perfroming RetainAll():- ");
		System.out.println(l1);
		System.out.println(l2);
	}

}

