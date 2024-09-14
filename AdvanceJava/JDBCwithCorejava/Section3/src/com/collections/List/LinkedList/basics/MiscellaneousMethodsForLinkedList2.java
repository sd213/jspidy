//isEmpty() :- used to check if collection contains no element.
package com.collections.List.LinkedList.basics;

import java.util.LinkedList;

public class MiscellaneousMethodsForLinkedList2 {

	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.add("X1 Super");
		l1.add("RX 100");
		l1.add("Pulsar");
		
		
		LinkedList l2 = new LinkedList();
		l2.add("RX 100");
		l2.add("Pulsar");
		
		LinkedList l3 = new LinkedList();
		
		System.out.println("l1.isEmpty() :"+l1.isEmpty());
		System.out.println("l2.isEmpty() :"+l2.isEmpty());
		System.out.println("l3.isEmpty() :"+l3.isEmpty());
	}

}
