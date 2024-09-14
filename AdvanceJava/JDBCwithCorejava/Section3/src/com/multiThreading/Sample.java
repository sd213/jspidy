package com.multiThreading;

public class Sample extends Thread{

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println(name);
	}
	public static void main(String[] args) {
		Sample s = new Sample();
//		s.run();
		s.start(); 
	}
}
