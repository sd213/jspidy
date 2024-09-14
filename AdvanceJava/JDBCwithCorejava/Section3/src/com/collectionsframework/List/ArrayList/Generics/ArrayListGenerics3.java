package com.collectionsframework.List.ArrayList.Generics;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListGenerics3 {

	public static void main(String[] args) {
		ArrayList <String> a = new ArrayList();
		a.add("Ram");
		a.add("Shyam");
		a.add("Sita");
		a.add("Laxmi");
		a.add("Radhe");
		
		ListIterator<String> i = a.listIterator();
		while(i.hasNext())
			System.out.println(i.next());
		
		System.out.println("______________");
		
		while(i.hasPrevious())
			System.out.println(i.previous());
	}

}
