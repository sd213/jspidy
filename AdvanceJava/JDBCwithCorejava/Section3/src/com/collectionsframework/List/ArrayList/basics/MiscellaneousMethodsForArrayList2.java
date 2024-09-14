//isEmpty() :- used to check if collection contains no element.
package com.collectionsframework.List.ArrayList.basics;

import java.util.ArrayList;

public class MiscellaneousMethodsForArrayList2 {

	public static void main(String[] args) {
		ArrayList l1 = new ArrayList();
		l1.add("X1 Super");
		l1.add("RX 100");
		l1.add("Pulsar");
		
		
		ArrayList l2 = new ArrayList();
		l2.add("RX 100");
		l2.add("Pulsar");
		
		ArrayList l3 = new ArrayList();
		
		System.out.println("l1.isEmpty() :"+l1.isEmpty());
		System.out.println("l2.isEmpty() :"+l2.isEmpty());
		System.out.println("l3.isEmpty() :"+l3.isEmpty());
	}

}
