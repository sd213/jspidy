// Example of inserting duplicate elements in hashset
package com.collections.Set.HashSet.basics;

import java.util.HashSet;

public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet <Integer> h = new HashSet<Integer>();
		h.add(90);
		h.add(78);
		h.add(21);
		h.add(67);
		h.add(90);
		h.add(93);
		h.add(90);
		System.out.println(h);
	}

}
