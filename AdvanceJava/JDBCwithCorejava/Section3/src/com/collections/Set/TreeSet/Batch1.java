package com.collections.Set.TreeSet;

import java.util.TreeSet;

public class Batch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet <Student1> t = new TreeSet<Student1>();
		t.add(new Student1("Radhe",32));
		t.add(new Student1("Som",21));
		t.add(new Student1("Krishna",34));
		t.add(new Student1("Trisha",45));
		t.add(new Student1("Leo",89));
		t.add(new Student1("Shyam",55));
		t.add(new Student1("Brahma",68));
		t.add(new Student1("Laxmi",50));
	
		for(Student1 s:t)
			System.out.println(s);	
	}

}
/*
Exception in thread "main" java.lang.ClassCastException: class com.collections.Set.TreeSet.Student1 cannot be cast to class java.lang.Comparable (com.collections.Set.TreeSet.Student1 is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')
at java.base/java.util.TreeMap.compare(TreeMap.java:1569)
at java.base/java.util.TreeMap.addEntryToEmptyMap(TreeMap.java:776)
at java.base/java.util.TreeMap.put(TreeMap.java:785)
at java.base/java.util.TreeMap.put(TreeMap.java:534)
at java.base/java.util.TreeSet.add(TreeSet.java:255)
at com.collections.Set.TreeSet.Batch1.main(Batch1.java:10)*/