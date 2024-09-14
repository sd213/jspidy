//binarySearch(list,key)
package com.collectionclass.searchoperations;

import java.util.ArrayList;
import java.util.Collections;

public class Sample2 {

	public static void main(String[] args) {
		ArrayList <Integer> a = new ArrayList<Integer>();
		a.add(9);
		a.add(4);
		a.add(3);
		a.add(7);
		a.add(52);
		a.add(6);
		UserSorting  us = new UserSorting();
		Collections.sort(a,us);
		System.out.println(a);
		
		System.out.println(Collections.binarySearch(a,7,us));
		System.out.println(Collections.binarySearch(a,3,us));
		System.out.println(Collections.binarySearch(a,51,us));
		System.out.println(Collections.binarySearch(a,8,us));
		System.out.println(Collections.binarySearch(a,1,us));
		System.out.println(Collections.binarySearch(a,9,us));
		
		System.out.println(Collections.binarySearch(a,7));
		System.out.println(Collections.binarySearch(a,9));
	}
}
