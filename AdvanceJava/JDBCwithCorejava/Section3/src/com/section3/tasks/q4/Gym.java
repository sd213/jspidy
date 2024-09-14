////WAJPT store height and weight of student inside a LInkedlIst and sort in desc order and print using iterator.
package com.section3.tasks.q4;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class Gym {

	public static void main(String[] args) {
		
		LinkedList<Student> s = new LinkedList<Student>();
		s.add(new Student("SD",2,5.5,65.3));
		s.add(new Student("DS",9,4.5,75.3));
		s.add(new Student("MOS",0,7.5,85.0));
		s.add(new Student("JS",12,6.2,84.2));
		s.add(new Student("Lax",8,6.5,79.9));
		
		//height based
		System.out.println("Sorting Based on Height:- ");
		Collections.sort(s,new SortingH());
		ListIterator<Student> i1 = s.listIterator();
		while(i1.hasNext())
			System.out.println(i1.next());
		
		System.out.println();
		
		System.out.println("Sorting Based on Weight:- ");
		Collections.sort(s,new SortingW());
		ListIterator<Student> i2 = s.listIterator();
		while(i2.hasNext())
			System.out.println(i2.next());
	}

}
