package com.section3.tasks.q2;


public class Student {
	
	private String name;
	private Integer id;
	private Integer age;
	private String stream;
	public Student() {
		
	}
	public Student(String name, int id, int age, String stream) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
		this.stream = stream;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "[ Id:- "+id+", Student Name:- "+name+", Age:- "+age+", Stream:- "+stream+" ]";
	}
	
	
	
}
