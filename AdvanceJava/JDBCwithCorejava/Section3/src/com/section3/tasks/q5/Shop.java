////WAJPT store products inside linkedHashset and sort all products in desc order based on product name.
package com.section3.tasks.q5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Shop {
	public static void main(String[] args) {
		LinkedHashSet<Product> p = new LinkedHashSet<Product>();
		p.add(new Product("Mi Note 5",35355,"Smart Phone"));
		p.add(new Product("Samsung Galaxy Note 10",68900,"Smart Phone"));
		p.add(new Product("Linux Programming Interface",500,"Book"));
		p.add(new Product("Algorithms To Live By ",292,"Book"));
		p.add(new Product("Power of Subconscious Mind ",143,"Book"));
		p.add(new Product("Dhoti",600,"Cloth"));
		p.add(new Product("Cello Ballpoint Pen",20,"Stationary Item"));
		p.add(new Product("Soldering Iron",85,"Electronics"));
		p.add(new Product("Pvc Pipe",92,"Hardware"));
		
		// Before Sorting
		Iterator<Product> i1 = p.iterator();
		while(i1.hasNext())
			System.out.println(i1.next());
		System.out.println();
		
		
		// Sorting by using ArrayList (converting)
		
		ArrayList<Product> array = new ArrayList<>(p);
		Collections.sort(array);
		
		// After Sorting
		
		Iterator<Product> i2 = p.iterator();
		while(i2.hasNext())
			System.out.println(i2.next());
		System.out.println();
		
		LinkedHashSet <Product> p2 = new LinkedHashSet<Product>(array);
	
		Iterator<Product> i3 = p2.iterator();
		while(i3.hasNext())
			System.out.println(i3.next());
		System.out.println();
	}
}
