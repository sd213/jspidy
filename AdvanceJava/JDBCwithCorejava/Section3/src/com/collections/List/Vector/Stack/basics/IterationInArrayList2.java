//listIteraor
package com.collections.List.Vector.Stack.basics;

import java.util.ArrayList;
import java.util.ListIterator;

public class IterationInArrayList2 {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
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
