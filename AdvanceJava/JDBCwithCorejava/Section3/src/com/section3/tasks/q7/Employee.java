package com.section3.tasks.q7;

public class Employee {
	private Integer id;
	private String name;
	private String designation;
	private Double salary;
	public Employee(Integer id, String name, String designation,Double salary) 	{
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDesignation() {
		return designation;
	}
	public Double getSalary() {
		return salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", salary=" + salary + "]";
	}
	
	
	

}
