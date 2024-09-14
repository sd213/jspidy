// removeAll(Collection) :- It is used to remove the duplicates which are present inside current collection by comparing with given collection.
package com.collections.List.LinkedList.basics;

import java.util.LinkedList;

public class RemovingInLinkedList2 {

	public static void main(String[] args) {
		//1st LinkedList
		LinkedList l1 = new LinkedList();
		l1.add("X1 Super");
		l1.add("rx 100");
		l1.add("Pulsar");
		l1.add("rx 100");
		
		//2nd LinkedList
		LinkedList l2 = new LinkedList();
		l1.add("BMW");
		l2.add("Bajaj");
		l2.add("rx 100");
		l2.add("FZ");
		System.out.println("\nBefore Perfroming removeAll():- ");
		System.out.println(l1);
		System.out.println(l2);
		
		l1.removeAll(l2);
		
		System.out.println("\nAfter Perfroming removeAll():- ");
		System.out.println(l1);
		System.out.println(l2);
		
	}
}
