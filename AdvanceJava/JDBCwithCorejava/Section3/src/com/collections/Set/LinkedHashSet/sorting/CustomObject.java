package com.collections.Set.LinkedHashSet.sorting;

public class CustomObject {
	private String name;
	private int id;
	private String type;
	
	public CustomObject(String name, int id, String type) {
		super();
		this.name = name;
		this.id = id;
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String toString() {
		return "Name:- "+name+", Id:- "+id+", Type:- "+type;
	}
}
