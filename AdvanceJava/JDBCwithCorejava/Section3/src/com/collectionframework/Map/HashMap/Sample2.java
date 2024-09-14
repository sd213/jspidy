//Example of iteration of hashmap using entrySet() without Generics
package com.collectionframework.Map.HashMap;

import java.util.HashMap;
import java.util.Set;

public class Sample2 {

	public static void main(String[] args) {
		HashMap h1 = new HashMap();
		h1.put(32,"smith");
		h1.put(45,"martin");
		h1.put(67,"john");
		h1.put(12,"miller");
		h1.put(89,"scott");
		
		Set entry = h1.entrySet();
		for( Object  e:entry)
			System.out.println(e);
	}

}
