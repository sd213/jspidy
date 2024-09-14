package com.collections.Set.TreeSet;

import java.util.TreeSet;

public class Batch2 {

	public static void main(String[] args) {
		
		TreeSet <Student2> t = new TreeSet<Student2>();
		t.add(new Student2("Radhe",32));
		t.add(new Student2("Som",21));
		t.add(new Student2("Krishna",34));
		t.add(new Student2("Trisha",45));
		t.add(new Student2("Leo",89));
		t.add(new Student2("Shyam",55));
		t.add(new Student2("Brahma",68));
		t.add(new Student2("Laxmi",50));
	
		for(Student2 s:t)
			System.out.println(s);	
	}


}
