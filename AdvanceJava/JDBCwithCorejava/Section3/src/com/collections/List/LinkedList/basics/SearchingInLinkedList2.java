// Contains All:- It is used to check whether all object of given collection is present inside current collection or not.
package com.collections.List.LinkedList.basics;

import java.util.ArrayList;

public class SearchingInLinkedList2 {

	public static void main(String[] args) {
		ArrayList l1 = new ArrayList();
		l1.add("X1 Super");
		l1.add("RX 100");
		l1.add("Pulsar");
		
		ArrayList l2 = new ArrayList();
		l2.add("RX 100");
		l2.add("Pulsar");
		
		
		System.out.println(l1);
		System.out.println(l2);	
		
		
		System.out.println("ArrayList 1 Contains ArrayList 2 : "+l1.containsAll(l2));
		System.out.println("ArrayList 2 Contains ArrayList 1: "+l2.containsAll(l1));
		System.out.println("ArrayList 1 Contains ArrayList 1: "+l1.containsAll(l1));
//		System.out.println("ArrayList Contains 10: "+l1.contains(10));
//		System.out.println("ArrayList Contains 90: "+l1.contains(90));

	}

}
