// WAJP to add mobile object into a hashset collection
package com.collections.Set.HashSet.basics;

import java.util.HashSet;

public class Sample3 {

	public static void main(String[]args) {
		HashSet<Mobile> h = new HashSet<Mobile>();
		
		h.add(new Mobile("OPPO",10,"White"));
		h.add(new Mobile("Apple",23,"Gold"));
		h.add(new Mobile("Vivo",7,"Green"));
		
		for(Mobile m :h)
			System.out.println(m);
	}
	
}
class Mobile{
	String brand;
	double price;
	String color;
	
	public Mobile(String brand, double price, String color) {
		super();
		this.brand = brand;
		this.price = price;
		this.color = color;
	}
	
	public String toString() {
		return brand+"  "+price+" "+color;
	}
	
}
