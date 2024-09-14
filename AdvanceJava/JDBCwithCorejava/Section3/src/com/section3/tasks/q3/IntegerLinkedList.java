////WAJPT store only integers inside a linkedList and print all elements using listIterator.
package com.section3.tasks.q3;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class IntegerLinkedList {

	public static void main(String[] args) {
		
		LinkedList<Integer> integerList = new LinkedList<Integer>();
		
		integerList.add(12);
		integerList.add(45);
		integerList.add(11);
		integerList.add(10);
		integerList.add(8);
		integerList.add(6);
		integerList.add(1);
		integerList.add(4);
		
		Collections.sort(integerList);
		
		Iterator<Integer> i = integerList.iterator();
		while(i.hasNext())
			System.out.println(i.next());
	}

}
