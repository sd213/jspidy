package com.collections.Set.TreeSet.withoutComparableandComparator;

import java.util.TreeSet;

public class Flipkart {
	
	public static void main(String[] args) {
//		UserSorting us = new UserSorting();
		
		TreeSet <Laptop> t = new TreeSet<Laptop>();
		
		t.add(new Laptop("hp",45976));
		t.add(new Laptop("dell",55757));
		t.add(new Laptop("lenevo",5686));
		t.add(new Laptop("asus",79677));
		t.add(new Laptop("apple",575576));
		
		for(Laptop l : t) {
			System.out.println(l);
		}
	}

}
/*
 * Exception in thread "main" java.lang.ClassCastException: class com.collections.Set.TreeSet.withoutComparableandComparator.Laptop cannot be cast to class java.lang.Comparable (com.collections.Set.TreeSet.withoutComparableandComparator.Laptop is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')
 */
