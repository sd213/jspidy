//
//WAJPT store EmployeeClass With Sorting Desc inside linkedHashset and sort all employees's data in desc order based on eid.
package com.section3.tasks.q6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Office {

	public static void main(String[] args) {
		LinkedHashSet<EmployeeClassWithSortingDesc> le = new LinkedHashSet<EmployeeClassWithSortingDesc>();
		le.add(new EmployeeClassWithSortingDesc(1,"Som","UI-Designer"));
		le.add(new EmployeeClassWithSortingDesc(5,"SD","UX-Designer"));
		le.add(new EmployeeClassWithSortingDesc(2,"Rohit","Android Java Dev"));
		le.add(new EmployeeClassWithSortingDesc(6,"Shiva","HR"));
		le.add(new EmployeeClassWithSortingDesc(3,"Dinesh","Manager"));
		
		System.out.println("Before Sorting :- ");
		Iterator<EmployeeClassWithSortingDesc> i1 = le.iterator();
		while(i1.hasNext())
			System.out.println(i1.next());
		System.out.println();
		
		ArrayList<EmployeeClassWithSortingDesc> ae = new ArrayList<>(le);
		Collections.sort(ae,new EmployeeClassWithSortingDesc());
		
		LinkedHashSet<EmployeeClassWithSortingDesc> le2 = new LinkedHashSet<>(ae);
		
		System.out.println("After Sorting :- ");
		Iterator<EmployeeClassWithSortingDesc> i2 = le2.iterator();
		while(i2.hasNext())
			System.out.println(i2.next());
		
	}
}
