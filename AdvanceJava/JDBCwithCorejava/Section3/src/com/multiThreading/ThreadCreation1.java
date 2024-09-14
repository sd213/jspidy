package com.multiThreading;

public class ThreadCreation1 extends Thread {
	@Override
	public void run() {
		
		for(char c = 'A';c<='K';c++) {
			System.out.println(c);
			try {
				Thread.sleep(1000);
				// here try catch block used to handle exception as Thread.sleep threows InterruptedException which can not be handled by run method.
				// Declaration:-  public static native void sleep(long millis) throws InterruptedException;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	public static void main(String[] args) {
		
		ThreadCreation1 t1 = new ThreadCreation1();
		System.out.println("Newly Created Thread : "+t1);
		System.out.println("Name Of Thread :"+t1.getName());
		System.out.println("Thread Priority : "+t1.getPriority());
		System.out.println("Thread is Alive : "+t1.isAlive()); // false
		System.out.println("Thread is Daemon : "+t1.isDaemon());
		System.out.println("Thread is Interrupted : "+t1.isInterrupted());
		System.out.println("Thread(in String Format) : "+t1.toString());
		
		System.out.println("\n\n.......\n");
		System.out.println("Starting Thread....");
		t1.start();
		System.out.println("\n\n.......\n");
		
		
		System.out.println("Newly Created Thread : "+t1);
		System.out.println("Name Of Thread :"+t1.getName());
		System.out.println("Thread Priority : "+t1.getPriority());
		System.out.println("Thread is Alive : "+t1.isAlive()); // true
		System.out.println("Thread is Daemon : "+t1.isDaemon());
		System.out.println("Thread is Interrupted : "+t1.isInterrupted());
		System.out.println("Thread(in String Format) : "+t1.toString());
	}

}
/*
	Steps To create Thread (UserDefined):-
		1. Create a class and extends with Thread class.
		2. Override run() and provide implementation
		3. call start() with reference of our own class object.
*/ 