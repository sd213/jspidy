package com.collections.Set.TreeSet.withComparableandComparator;

public class Laptop implements Comparable<Laptop> {

	String brand;
	double price;
	
	public Laptop(String brand,double price) {
		super();
		this.brand = brand;
		this.price = price;
	}
	
	public String toString() {
		return price+"   "+ brand;
	}

	@Override
	public int compareTo(Laptop o) {
		
		return (this.price>o.price)?1:(this.price<o.price)?-1:0;
	}
	
	

}
