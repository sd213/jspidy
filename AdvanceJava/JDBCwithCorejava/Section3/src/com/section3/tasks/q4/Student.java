package com.section3.tasks.q4;

public class Student {
	
	private String name;
	private Integer id;
	private Double height;
	private Double weight;
	public Student(String name, Integer id, Double height, Double weight) {
		super();
		this.name = name;
		this.id = id;
		this.height = height;
		this.weight = weight;
	}
	public String toString() {
		return "Name:- "+name+", Id:- "+id+", Height:- "+height+", Weight:- "+weight;
		
	}
	public String getName() {
		return name;
	}
	public Integer getId() {
		return id;
	}
	public Double getHeight() {
		return height;
	}
	public Double getWeight() {
		return weight;
	}
	

}
