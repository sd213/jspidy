package com.collectionsframework.List.ArrayList.Generics;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListGenerics2 {

	public static void main(String[] args) {
		ArrayList <String> a = new ArrayList();
		a.add("Ram");
		a.add("Shyam");
		a.add("Sita");
		a.add("Laxmi");
		a.add("Radhe");
//		a.add(90);// The method add(int, String) in the type ArrayList<String> is not applicable for the arguments (int)
		Iterator <String> i = a.iterator();
		
		while(i.hasNext())
			System.out.println(i.next());
	}
}
