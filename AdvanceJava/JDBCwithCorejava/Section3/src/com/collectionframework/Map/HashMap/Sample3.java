package com.collectionframework.Map.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Sample3 {

	public static void main(String[] args) {
		HashMap<Integer, String> h1 = new HashMap<Integer, String>();
		h1.put(32,"smith");
		h1.put(45,"martin");
		h1.put(67,"john");
		h1.put(12,"miller");
		h1.put(89,"scott");
		
		Set<Entry<Integer, String>> entry = h1.entrySet();
		for( Map.Entry<Integer,String>  e:entry)
			System.out.println(e);
	}

}
