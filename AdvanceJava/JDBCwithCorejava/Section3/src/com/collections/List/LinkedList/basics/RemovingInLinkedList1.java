//	remove(Object) :- It is used to remove given Object from collection
package com.collections.List.LinkedList.basics;

import java.util.LinkedList;

public class RemovingInLinkedList1 {

	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.add("X1 Super");
		l1.add("Pulsar");
		l1.add("Rx 100");
		System.out.println("\nBefore Performing remove(Object) Operation:- ");
		System.out.println(l1);
		
		System.out.println(l1.remove("RX 100"));
		l1.remove("Pulsar");
		System.out.println("\nAfter Performing remove(Object) Operation:- ");
		System.out.println(l1);
	}

}
