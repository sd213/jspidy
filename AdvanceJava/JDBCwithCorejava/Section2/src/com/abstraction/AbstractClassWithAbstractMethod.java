package com.abstraction;

abstract class Vehicle1{
	public abstract void run();
}
class Bike1 extends Vehicle{

	@Override
	public void run() { // implementation provided here otherwise we would have to declare this subclass as abstract
		System.out.println("Bike Started Safely");
		
	}
	
}
public class AbstractClassWithAbstractMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike1 bike = new Bike1();
		bike.run();// Bike started Safely
	}

}
