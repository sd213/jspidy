package com.collectionframework.Map.HashMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Sample6 {
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
		System.out.println(h1.values());
		ArrayList<String> s1 = new ArrayList<String>(h1.values()); // h1.values returns collections
		Collections.sort(s1);
		System.out.println(s1);
		
		LinkedHashMap<Integer,String> lh1 = new LinkedHashMap<Integer,String>();
//		for(int i = 0 ;i < s1.size();i++) {
//			System.out.println(s1.get(i));
//			System.out.println(h1.getKey(s1.get(i)));
//	
////			lh2.put(a1.get(i),h1.get(a1.get(i)));
//		}
		int i = 0;
		for(Map.Entry<Integer,String> e:h1.entrySet()) {
//			lh1.put(h1.,s1.get(i))
			i++;
		}
		System.out.println("\n");
		System.out.println("Sorting Based On Key");
		System.out.println("\n");

		System.out.println(lh1);
	}
}
