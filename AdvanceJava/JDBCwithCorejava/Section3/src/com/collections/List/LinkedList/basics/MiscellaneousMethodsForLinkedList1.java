//	size():- returns size of collection.
package com.collections.List.LinkedList.basics;

import java.util.ArrayList;
import java.util.LinkedList;

public class MiscellaneousMethodsForLinkedList1 {

	public static void main(String[] args) {
		LinkedList<String> l1 = new LinkedList();
		l1.add("X1 Super");
		l1.add("RX 100");
		l1.add("Pulsar");
		
		
		LinkedList<String> l2 = new LinkedList<String>();
		l2.add("RX 100");
		l2.add("Pulsar");
		
		System.out.println("Size of ArrayList1 :"+l1.size());
		System.out.println("Size of ArrayList2 :"+l2.size());
	}

}
