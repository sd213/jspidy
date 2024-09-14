// remove(Index):- It is used to remove the object at given particular index.
package com.collections.List.LinkedList.basics;

import java.util.LinkedList;

public class RemovingInLinkedList5 {

	public static void main(String[] args) {
		
		LinkedList l1 = new LinkedList();
		l1.add("X1 Super");
		l1.add("RX 100");
		l1.add("Pulsar");
		l1.add("FZ");
		System.out.println("\n Before Performing remove(index) operation :- ");
		System.out.println(l1);
		l1.remove(2); // removing object at index 2
		System.out.println("\n After Performing remove(index) operation :- ");
		System.out.println(l1);
	}

}
