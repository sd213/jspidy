package com.collectionframework.Map.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Sample4 {

	public static void main(String[] args) {
		HashMap<Integer,String> h1 = new HashMap<Integer, String>();
		h1.put(32,"smith");
		h1.put(45,"martin");
		h1.put(67,"john");
		h1.put(12,"miller");
		h1.put(89,"scott");
		
		Set<Entry<Integer, String>> entry = h1.entrySet();
		
		Set<Map.Entry<Integer, String>> entry2 = h1.entrySet();
		
		System.out.println(entry);
		for( Entry<Integer,String> e:entry)
			System.out.println(e);

		for( Map.Entry<Integer,String> e:entry2)
			System.out.println(e);
	}

}
/*
The java.util.HashMap.entrySet() method in Java is used to create a set out of the same elements contained in the hash map. It basically returns a set view of the hash map or we can create a new set and store the map elements into them.

Syntax:

hash_map.entrySet()
Parameters: The method does not take any parameter.

Return Value: The method returns a set having same elements as the hash map.

Below programs are used to illustrate the working of java.util.HashMap.entrySet() Method:
Program 1: Mapping String Values to Integer Keys.
*/