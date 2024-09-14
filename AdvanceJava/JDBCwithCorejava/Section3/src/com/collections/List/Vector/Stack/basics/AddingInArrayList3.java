/**
	add(index,object):- It is used to add the given object at particular index.
 * 
 */
package com.collections.List.Vector.Stack.basics;

import java.util.ArrayList;

public class AddingInArrayList3 {

	
	public static void main(String[] args) {
		ArrayList l1 = new ArrayList();
		l1.add(10);
		l1.add(40);
		l1.add(2,30);
		l1.add(1,20);
		l1.add(4,60);
//		l1.add(6,70);
		
		System.out.println(l1);
	}

}
