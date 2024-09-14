package com.collections.Set.LinkedHashSet.sorting;
import java.util.*;
public class LinkedHashSetSorting {

	public static void main(String[] args) {
		
		LinkedHashSet <CustomObject> l = new LinkedHashSet<CustomObject>();
		l.add(new CustomObject("Monitor",1,"Electronics"));
		l.add(new CustomObject("hp 32Gb Pendrive",9,"Electronics"));
		l.add(new CustomObject("Fruit Juice",49,"Grocery"));
		l.add(new CustomObject("Laptop",2,"Electronics"));
		l.add(new CustomObject("Windows OS professional",8,"Software"));
		l.add(new CustomObject("Dark Fantasy",3,"Biscuit"));
		l.add(new CustomObject("5Stars",5,"Chocolate"));
		for(CustomObject elem:l) {
			System.out.println(elem);
		}
		System.out.println("\n\n");
		
		ArrayList<CustomObject> a = new ArrayList<CustomObject>(l); // Using ArrayList to sort LinkedHashSet Objects
		System.out.println("Sorting By ID:--- ");
		a.sort(new ObjectSortingbyId());
		
		LinkedHashSet <CustomObject> lh = new LinkedHashSet<CustomObject>(a);
		for(CustomObject elem:lh) {
			System.out.println(elem);
		}
		System.out.println("\n\n");
		
		System.out.println("Sorting By Name:---");
		a.sort(new ObjectSortingbyName());
		
		LinkedHashSet <CustomObject> lh1 = new LinkedHashSet<CustomObject>(a);
		for(CustomObject elem:lh1) {
			System.out.println(elem);
		}
		System.out.println("\n\n");
		
		System.out.println("Sorting By Type:---");
		a.sort(new ObjectSortingbyType());
				
		LinkedHashSet <CustomObject> lh2 = new LinkedHashSet<CustomObject>(a);
		for(CustomObject elem:lh2) {
			System.out.println(elem);
		}
		System.out.println("\n\n");
	}

}
