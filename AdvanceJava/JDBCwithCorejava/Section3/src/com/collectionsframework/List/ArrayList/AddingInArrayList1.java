// add(object) :- This method is used to add an object into a collection.
package com.collectionsframework.List.ArrayList;

import java.util.ArrayList;

public class AddingInArrayList1 {

	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add(10); // here primitive gets converted corresponding wrapper class then upcasted to object type.
		l.add(20);
		l.add(30);
		l.add(40);
		System.out.println(l);
	}
	
}
