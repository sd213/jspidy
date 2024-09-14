////WAJPT store employee inside linkedHashset and sort all employee's data in asc order based on salary.
package com.section3.tasks.q7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;



public class Office {

	public static void main(String[] args) {
		LinkedHashSet<Employee> le = new LinkedHashSet<Employee>();
		le.add(new Employee(1,"Som","UI-Designer",20000.0));
		le.add(new Employee(5,"SD","UX-Designer",23000.23));
		le.add(new Employee(2,"Rohit","Android Java Dev",50000.0));
		le.add(new Employee(6,"Shiva","HR",15000.0));
		le.add(new Employee(3,"Dinesh","Manager",30000.0));
		
		System.out.println("Before Sorting :- ");
		Iterator<Employee> i1 = le.iterator();
		while(i1.hasNext())
			System.out.println(i1.next());
		System.out.println();
		
		ArrayList<Employee> ae = new ArrayList<>(le);
		Collections.sort(ae,new EmployeeSortAsc());
		
		LinkedHashSet<Employee> le2 = new LinkedHashSet<>(ae);
		
		System.out.println("After Sorting :- ");
		Iterator<Employee> i2 = le2.iterator();
		while(i2.hasNext())
			System.out.println(i2.next());

	}

}
