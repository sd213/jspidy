/**
	add(index,object):- It is used to add the given object at particular index.
 * 
 */
package com.collections.List.LinkedList.basics;

import java.util.LinkedList;

public class AddingInLinkedList3 {

	
	public static void main(String[] args) {
		
		LinkedList <String> l1 = new LinkedList();
		
		l1.add("Node1"); 
		l1.add("Node2");
		l1.add("Node3");
		l1.add(2,"Node4");
		l1.add(4,"Node5");
		
		
		System.out.println(l1);
	}

}
