package com.collectionframework.Map.HashMap;

import java.util.HashMap;

public class Sample {
	public static void main(String[] args) {
		HashMap h = new HashMap();
		
		h.put(10,"Somit");
		h.put(20,"Som");
		h.put(30,"Das");
		h.put(40,"SD");
		h.put(50,"Somu");
		
		System.out.println(h);
		//Duplicated Key
		h.put(30,"D"); // it will just update value of 30 key
		
		System.out.println(h);
		//Duplicated Value 
		h.put(60,"SD"); // it will just append to hashmap
		
		System.out.println(h);
		
		//Duplicated Key , Value
		h.put(50,"Som");
		System.out.println(h);
		
				
	}
}
