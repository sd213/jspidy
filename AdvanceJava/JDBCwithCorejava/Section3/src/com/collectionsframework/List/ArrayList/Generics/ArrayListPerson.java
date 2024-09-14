package com.collectionsframework.List.ArrayList.Generics;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPerson {
	
	public static void main(String[] args) {
		ArrayList <Person> personList = new ArrayList<Person>();
		personList.add(new Person("Som", 23, "Male"));
		personList.add(new Person("Leo", 20, "Male"));
		personList.add(new Person("Sita", 26, "Female"));
		personList.add(new Person("Radhe", 23, "Female"));
		personList.add(new Person("Smruti", 21, "Feale"));
		
		System.out.println(personList);
		
		System.out.println("\n\n");
		
		Iterator<Person> i  = personList.iterator();
		while(i.hasNext())
			System.out.println(i.next().getName());
	}

}
