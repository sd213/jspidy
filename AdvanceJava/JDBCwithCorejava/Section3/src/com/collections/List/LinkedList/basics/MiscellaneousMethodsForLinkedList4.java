// hashCode():- return unique/ random value for LinkedList
// equals():- Compares the specified object with this list for equality. Returns true if and only if the specified object is also a list, bothlists have the same size, and all corresponding pairs of elements inthe two lists are equal. 
package com.collections.List.LinkedList.basics;

import java.util.LinkedList;

public class MiscellaneousMethodsForLinkedList4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l1 = new LinkedList();
		l1.add("X1 Super");
		l1.add("RX 100");
		l1.add("Pulsar");
		
		
		LinkedList l2 = new LinkedList();
		l2.add("RX 100");
		l2.add("Pulsar");
		
		LinkedList l3 = new LinkedList();
		l3.add("X1 Super");
		l3.add("RX 100");
		l3.add("Pulsar");
		
		System.out.println("hashCode of LinkedList1 :"+l1.hashCode());
		System.out.println("hashCode of LinkedList2 :"+l2.hashCode());
		System.out.println("hashCode of LinkedList3 :"+l3.hashCode());
		
		System.out.println("LinkedList1.equals(LinkedList2) :"+l1.equals(l2));
		System.out.println("LinkedList2.equals(LinkedList3) :"+l2.equals(l3));
		System.out.println("LinkedList1.equals(LinkedList3) :"+l1.equals(l3));
	}

}
