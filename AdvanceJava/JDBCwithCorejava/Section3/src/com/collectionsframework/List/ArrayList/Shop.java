package com.collectionsframework.List.ArrayList;

import java.util.ArrayList;

public class Shop {

	public static void main(String[] args) {
		ArrayList<Bike> l1 = new ArrayList<Bike>();
		l1.add(new Bike("Pular", 300));
		l1.add(new Bike("X1 super", 340));
		System.out.println(l1);
	}

}
class Bike {
	String brand;
	int engine;
	Bike(String brand , int engine){
		this.brand = brand;
		this.engine = engine;
	}
	
	
}
