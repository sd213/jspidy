//// WAJPt store mobile object inside a LinkedLIst and sort all elements in desc order based on price and print using iterator.
package com.section3.tasks.q1;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Store {

	public static void main(String[] args) {
		
		LinkedList<Mobile> mobileList = new LinkedList<Mobile>();
		mobileList.add(new Mobile("XIaomi","Redmi NOte 12",45454));
		mobileList.add(new Mobile("XIaomi","Redmi NOte 10",454));
		mobileList.add(new Mobile("Apple","Iphone 12",123314));
		mobileList.add(new Mobile("Google","Pixel 7a",23554));
		
		System.out.println(mobileList);
		
		for(Object e : mobileList) {
			System.out.println(e);
		}
		
		System.out.println();
		
		Collections.sort(mobileList);
		
		System.out.println(mobileList);
		
		System.out.println();
//		for(Object e : mobileList) {
//			System.out.println(e);
//		}
		Iterator<Mobile> i = mobileList.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println();
	}

}
