// clear():- It is used to remove all objects from the collection.
package com.collectionsframework.List.ArrayList.basics;

import java.util.ArrayList;

public class RemovingInArrayList4 {

	public static void main(String[] args) {
		 
		ArrayList l1 = new ArrayList();
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
