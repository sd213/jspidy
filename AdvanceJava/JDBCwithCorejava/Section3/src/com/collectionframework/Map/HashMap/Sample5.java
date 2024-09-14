package com.collectionframework.Map.HashMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
//import java.util.Map;
import java.util.Set;

public class Sample5 {

	public static void main(String[] args) {
		HashMap<Integer,String> h1 = new HashMap<Integer,String>();
		h1.put(32,"smith");
		h1.put(45,"martin");
		h1.put(67,"john");
		h1.put(12,"miller");
		h1.put(89,"scott");
		h1.put(20,"JSon");
		
		System.out.println(h1);
		// To sort a HashMap in Java, you can convert it to a List of Map.Entry objects, sort the list, and then store the sorted entries in a LinkedHashMap. Here's how you can do it:
		
		// Sorting based on key
		
		Set<Integer> s1 = h1.keySet();
		ArrayList<Integer> a1 = new ArrayList<Integer>(s1);
		Collections.sort(a1);
		System.out.println(a1);
		
		HashMap<Integer,String> h2 = new HashMap<Integer,String>();
		LinkedHashMap<Integer,String> lh1 = new LinkedHashMap<Integer,String>();
		for(int i = 0 ;i < a1.size();i++) {
			//System.out.println(a1.get(i));
//			System.out.println(h1.get(a1.get(i)));
			// inserting same keys to both newly created hashMap and LinkedHashMap
			h2.put(a1.get(i),h1.get(a1.get(i))); 
			lh1.put(a1.get(i),h1.get(a1.get(i)));
		}
		System.out.println("\n");
		System.out.println("Sorting Based On Key");
		System.out.println("\n");
		
		System.out.println(h2);
		System.out.println(lh1);
		//Here You will found out after sorting list extracted from hashMap then, store it in hash map would be useless as hashmap has random order to inserting key or value in it , while in linkedhashmap have insertion order mechanism .
		
		// to Su
		// HashMap --> Set(Using KeySet()) --> List --> Sort List --> Store it in LinkedHashMap with fetching values.
		
		//
	}
}
