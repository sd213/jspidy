// hashCode():- return unique/ random value for arrayList
// equals():- Compares the specified object with this list for equality. Returns true if and only if the specified object is also a list, bothlists have the same size, and all corresponding pairs of elements inthe two lists are equal. 
package com.collectionsframework.List.ArrayList.basics;

import java.util.ArrayList;

public class MiscellaneousMethodsForArrayList4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList l1 = new ArrayList();
		l1.add("X1 Super");
		l1.add("RX 100");
		l1.add("Pulsar");
		
		
		ArrayList l2 = new ArrayList();
		l2.add("RX 100");
		l2.add("Pulsar");
		
		ArrayList l3 = new ArrayList();
		l3.add("X1 Super");
		l3.add("RX 100");
		l3.add("Pulsar");
		
		System.out.println("hashCode of ArrayList1 :"+l1.hashCode());
		System.out.println("hashCode of ArrayList2 :"+l2.hashCode());
		System.out.println("hashCode of ArrayList3 :"+l3.hashCode());
		
		System.out.println("ArrayList1.equals(ArrayList2) :"+l1.equals(l2));
		System.out.println("ArrayList2.equals(ArrayList3) :"+l2.equals(l3));
		System.out.println("ArrayList1.equals(ArrayList3) :"+l1.equals(l3));
	}

}
