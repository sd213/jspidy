// Contains(Object) :- If collection contains given Object then it returns true else false
package com.collections.List.Vector.Stack.basics;

import java.util.ArrayList;

public class SearchingInArrayList1 {

	public static void main(String[] args) {
		
		ArrayList l1 = new ArrayList();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		
		System.out.println("ArrayList Contains 10: "+l1.contains(10));
		System.out.println("ArrayList Contains 90: "+l1.contains(90));


		
	}

}
