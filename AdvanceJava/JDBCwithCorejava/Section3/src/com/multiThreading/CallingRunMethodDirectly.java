package com.multiThreading;

public class CallingRunMethodDirectly {


	    public static void main(String[] args) {
	        MyThread thread = new MyThread();

	        // Calling run() directly
	        System.out.println("Calling run() directly:");
	        thread.run(); // This will run in the main thread
	        System.out.println("This will print after run() finishes");

	        System.out.println("\n\n");
	        
	        // Calling start()
	        System.out.println("Calling start() to create a new thread:");
	        thread.start(); // This will run in a new thread
	        System.out.println("This may print before, after, or during the new thread execution");
	    }
	

}
class MyThread extends Thread {
    public void run() {
        System.out.println("Running in thread: " + Thread.currentThread().getName());
    }
}