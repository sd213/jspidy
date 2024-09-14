/**
	addAll(Collection) : It is used to add all objects of given collection into current collection.
 * 
 */
package com.collections.List.Vector.Stack.basics;

import java.util.ArrayList;

public class AddingInArrayList2 {

	
	public static void main(String[] args) {
		//1st array collection
		ArrayList l1 = new ArrayList();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		
		//2nd array collection
		ArrayList l2 = new ArrayList();
		l2.add(40);
		l2.add(69);
		l2.add(90);
		
		System.out.println("\nBefore Modifying:- \n");
		//printing first ArrayList
		System.out.println("First ArrayList: "+l1);
		//printing second ArrayLIst
		System.out.println("Second ArrayLIst:"+l2);
		
		l1.addAll(l2);
		System.out.println("\nAfter Modifying:-\n");
		//printing first ArrayList
		System.out.println("First ArrayList: "+l1);
		//printing second ArrayLIst
		System.out.println("Second ArrayLIst:"+l2);
	}

}
