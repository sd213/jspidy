package com.collectionsframework.List.ArrayList.Generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class ArrayListSample {

	public static void main(String[] args) {
		
		ArrayList <Car> h = new ArrayList<Car>();
		h.add(new Car("BMW", 10, "Yellow"));
		h.add(new Car("Audi", 5, "Pink"));
		h.add(new Car("Tata", 7, "Green"));
		
		Iterator <Car> i = h.iterator();
		while(i.hasNext())
			System.out.println(i.next());
	}

}
