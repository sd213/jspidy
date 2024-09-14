//	size():- returns size of collection.
package com.collections.List.Vector.Stack.basics;

import java.util.ArrayList;

public class MiscellaneousMethodsForArrayList1 {

	public static void main(String[] args) {
		ArrayList l1 = new ArrayList();
		l1.add("X1 Super");
		l1.add("RX 100");
		l1.add("Pulsar");
		
		
		ArrayList l2 = new ArrayList();
		l2.add("RX 100");
		l2.add("Pulsar");
		
		System.out.println("Size of ArrayList1 :"+l1.size());
		System.out.println("Size of ArrayList2 :"+l2.size());
	}

}
