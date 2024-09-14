package com.multiThreading;

public class NotOverridingRunMethod extends Thread {

	
	public static void main(String[] args) {
		
		NotOverridingRunMethod n = new NotOverridingRunMethod();
		n.start(); // here em
		
	}

}
