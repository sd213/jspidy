// iterator
package com.collectionsframework.List.ArrayList.basics;

import java.util.ArrayList;
import java.util.Iterator;

public class IterationInArrayList1 {

	public static void main(String[] args) {
		ArrayList l1 = new ArrayList();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add("Java");
		l1.add("C++");
		
		Iterator i = l1.iterator();
		System.out.println(i);
		while(i.hasNext())
			System.out.println(i.next());
//		System.out.println(i.next()); // No Such Element Exception
		System.out.println("\n__________________\n");
		
		
		
		//removing element using iterator.
		Iterator i2 = l1.iterator(); //here i ihave created Iterator object as once cursor move to next of end of list it will be impossible to come back to start position.
		System.out.println(i2);
		while(i2.hasNext()) {
			if(i2.next().equals("Java"))
				i2.remove(); //removing Java Object
		}
		
		Iterator i3 = l1.iterator();
		while(i3.hasNext())
			System.out.println(i3.next());
	}

}
