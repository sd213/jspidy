// index(Object) :- If the given object is present , then it returns index of particular object else -1;
package com.collections.List.LinkedList.basics;

import java.util.ArrayList;

public class SearchingInLinkedList3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		ArrayList l1 = new ArrayList();
		l1.add("X1 Super");
		l1.add("RX 100");
		l1.add("Pulsar");
		
		System.out.println(l1);
		System.out.println("Index of Pulsar :"+l1.indexOf("Pulsar"));
		System.out.println("Index of FZ : "+ l1.indexOf("FZ"));
	}

}
