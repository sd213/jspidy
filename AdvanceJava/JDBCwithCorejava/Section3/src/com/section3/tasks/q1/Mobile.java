package com.section3.tasks.q1;

public class Mobile implements Comparable<Mobile> {
	private String brand;
	private String name;
	private double price;
	
	public Mobile(String brand, String name,double price) {
		super();
		this.setBrand(brand);
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String toString() {
		return "[ Brand:  "+brand+", Name: "+name+", Price: "+price+" ]";
		
	}

	@Override
	public int compareTo(Mobile o) {
		// TODO Auto-generated method stub
		Double p1 = this.price;
		Double p2 = o.price;
		return p1.compareTo(p2);
	}

}
