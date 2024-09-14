////WAJPt store student object inside arrayList and sort an arrayLIst in LIFO and print all elements by using iterator.

package com.section3.tasks.q2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Institute {

	public static void main(String[] args) {
		 ArrayList <Student> studentList = new ArrayList<Student>();
		 studentList.add(new Student("Somit",1,23,"CS"));
		 studentList.add(new Student("Mohan",8,42,"MATH"));
		 studentList.add(new Student("Dass",2,24,"ECE"));
		 studentList.add(new Student("Anirudh",6,25,"CIVIL"));
		 studentList.add(new Student("Sanjay",9,29,"MBA"));
		 studentList.add(new Student("Sangram",12,26,"MECH"));
		 
		 Iterator<Student> i1 = studentList.iterator();
		 while(i1.hasNext()) {
			 System.out.println(i1.next());
		 }
		 System.out.println();
		 Collections.sort(studentList,new StudentSorting());
		 
		 Iterator<Student> i2 = studentList.iterator();
		 while(i2.hasNext()) {
			 System.out.println(i2.next());
		 }
	}
}
