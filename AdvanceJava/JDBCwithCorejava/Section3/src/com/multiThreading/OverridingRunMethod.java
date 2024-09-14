package com.multiThreading;

public class OverridingRunMethod extends Thread {
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println(name);
	}
	public static void main(String[] args) {
		
		OverridingRunMethod o = new OverridingRunMethod();
		o.start(); // here overridden run method execute
		
	}
}
