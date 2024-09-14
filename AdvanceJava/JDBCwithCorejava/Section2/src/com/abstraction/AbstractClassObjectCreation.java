/*
 *  in Abstract Class in object created 
 */
package com.abstraction;

abstract class Vehicle{
	public abstract void run();
}
class Bike extends Vehicle{

	@Override
	public void run() { // implementation provided here otherwise we would have to declare this subclass as abstract
		System.out.println("Bike Started Safely");
		
	}
	
}
public class AbstractClassObjectCreation {

	public static void main(String[] args) {
		
		Vehicle v = new Bike(); // upcasting
		v.run(); // Bike started Safely
		
//		Vehicle vh = new Vehicle(); // Can't create object for abstract class as Cannot instantiate the type Vehicle
//		vh.run();
	}
}
