// remove(Index):- It is used to remove the object at given particular index.
package com.collectionsframework.List.ArrayList.basics;

import java.util.ArrayList;

public class RemovingInArrayList5 {

	public static void main(String[] args) {
		
		ArrayList l1 = new ArrayList();
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
