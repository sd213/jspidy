package com.collectionsframework.List.ArrayList.Generics;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListGenerics1 {

	public static void main(String[] args) {
		ArrayList <Integer> a = new ArrayList();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(Integer.valueOf(59));
//		a.add("550"); //Strings can not passed other than integer 
		/*
		 
The method add(Integer) in the type ArrayList<Integer> is not applicable for the arguments (String)	

		 */
		Iterator <Integer> i = a.iterator();
		
		while(i.hasNext())
			System.out.println(i.next());
	}

}
