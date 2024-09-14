// clear():- It is used to remove all objects from the collection.
package com.collections.List.LinkedList.basics;

import java.util.LinkedList;

public class RemovingInLinkedList4 {

	public static void main(String[] args) {
		 
		LinkedList l1 = new LinkedList();
		l1.add("X1 Super");
		l1.add("RX 100");
		l1.add("Pulsar");
		System.out.println("\n Before Performing Clear() operation :- ");
		System.out.println(l1);
		l1.clear();
		System.out.println("\n After Performing Clear() operation :- ");
		System.out.println(l1);
	}

}
