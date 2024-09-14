package com.section3.tasks.q6;

import java.util.Comparator;

public class EmployeeClassWithSortingDesc implements Comparator<EmployeeClassWithSortingDesc>{
	
	private Integer id;
	private String name;
	private String designation;
	
	public EmployeeClassWithSortingDesc() {
		
	}
	public EmployeeClassWithSortingDesc(Integer id, String name, String designation) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
	}
	public String getDesignation() {
		return designation;
	}
	public String getName() {
		return name;
	}
	
	@Override
	public int compare(EmployeeClassWithSortingDesc o1, EmployeeClassWithSortingDesc o2) {
		// TODO Auto-generated method stub
		return o1.id.compareTo(o2.id);
	}
	@Override
	public String toString() {
		return "EmployeeClassWithSortingDesc [id=" + id + ", name=" + name + ", designation=" + designation + "]";
	
	}
}
