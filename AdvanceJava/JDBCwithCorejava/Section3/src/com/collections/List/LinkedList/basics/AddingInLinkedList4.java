//	addAll(index,Collection) :- It is used to add object of given collection into current collection at given particular index.
package com.collections.List.LinkedList.basics;

import java.util.LinkedList;

public class AddingInLinkedList4 {

	public static void main(String[] args) {
		
		LinkedList <String> l1 = new LinkedList<String>();
		l1.add("Node1");
		l1.add("Node2");
		l1.add("Node3");
		
		LinkedList <String> l2 = new LinkedList<String>();
		l2.add("Node5");
		l2.add("Node6");
		l2.add("Node7");
		
		System.out.println("Before Modifying:-");
		System.out.println(l1);
		System.out.println(l2);
		
		l1.addAll(3, l2);
		System.out.println("After Modifying:-");
		System.out.println(l1);
		System.out.println(l2);
		
	}

}
