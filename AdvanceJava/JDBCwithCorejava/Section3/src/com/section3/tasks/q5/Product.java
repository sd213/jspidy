package com.section3.tasks.q5;

public class Product implements Comparable<Product> {

	private String name;
	private Integer price;
	private String type;
	
	public Product(String name, Integer price, String brand) {
		super();
		this.name = name;
		this.price = price;
		this.type = brand;
	}
	

	public String getName() {
		return name;
	}


	public Integer getPrice() {
		return price;
	}


	public String getBrand() {
		return type;
	}


	@Override
	public int compareTo(Product o) {
		
		return this.name.compareToIgnoreCase(o.name);
	}


	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", type=" + type + "]";
	}

	
}
