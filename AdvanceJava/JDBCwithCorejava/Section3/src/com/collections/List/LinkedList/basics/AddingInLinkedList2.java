/**
	addAll(Collection) : It is used to add all objects of given collection into current collection.
 * 
 */
package com.collections.List.LinkedList.basics;

import java.util.LinkedList;

public class AddingInLinkedList2 {

	
	public static void main(String[] args) {
		//1st array collection
		LinkedList <String> l1 = new LinkedList<String>();
		l1.add("Node1"); 
		l1.add("Node2");
		l1.add("Node3");
		l1.add("Node4");
		l1.add("Node5");
		
		//2nd array collection
		LinkedList l2 = new LinkedList();
		l2.add(40);
		l2.add(69);
		l2.add(90);
		
		System.out.println("\nBefore Modifying:- \n");
		//printing first LinkedList
		System.out.println("First LinkedList: "+l1);
		//printing second LinkedList
		System.out.println("Second LinkedList:"+l2);
		
		l1.addAll(l2);
		System.out.println("\nAfter Modifying:-\n");
		//printing first LinkedList
		System.out.println("First LinkedList: "+l1);
		//printing second LinkedList
		System.out.println("Second LinkedList:"+l2);
	}

}
