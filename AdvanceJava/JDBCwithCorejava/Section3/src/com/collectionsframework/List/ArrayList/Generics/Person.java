package com.collectionsframework.List.ArrayList.Generics;

public class Person {

	private String name;
	private int age;
	private String gender;
	
	Person(String name, int age, String gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	
	
	public String getName() {
		return name;
	}



	public int getAge() {
		return age;
	}



	public String getGender() {
		return gender;
	}



	public String toString() {
		return "Name: "+name+", Age: "+age+", Gender: "+".";
	}
}
