package com.section3.tasks.q7;

import java.util.Comparator;

public class EmployeeSortAsc implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		Double s1 = o1.getSalary(), s2 = o2.getSalary();
		return s1>s2? 1:(s1<s2?-1:0);
	}

	
	
}

