// foreachMethod
package com.collections.List.Vector.Stack.basics;

import java.util.ArrayList;

public class IterationInArrayList3 {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add("10");
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		a.add(60);
		
		//using traditional for
		for(int i = 0; i < a.size();i++)
			System.out.println(a.get(i));
		
		System.out.println();
		
		//using for each loop
		a.forEach((x)->System.out.println(x));
	}

}
