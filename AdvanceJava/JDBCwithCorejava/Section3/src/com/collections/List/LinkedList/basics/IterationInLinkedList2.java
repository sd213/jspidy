//listIteraor
package com.collections.List.LinkedList.basics;

import java.util.LinkedList;
import java.util.ListIterator;

public class IterationInLinkedList2 {

	public static void main(String[] args) {
		LinkedList a = new LinkedList();
		a.add("10");
		a.add(20);
		a.add(30);
		a.add(40);
		
		ListIterator i = a.listIterator();
		
		while(i.hasNext())
			System.out.println(i.next());
		System.out.println("\n_______________\n");
		
		while(i.hasPrevious())
			System.out.println(i.previous());
		
	}

}
