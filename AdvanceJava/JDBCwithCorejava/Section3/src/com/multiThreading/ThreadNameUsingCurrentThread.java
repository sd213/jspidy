package com.multiThreading;

public class ThreadNameUsingCurrentThread {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println("current Thread Details:"+t);
		System.out.println("Name Of Thread :"+t.getName());
		System.out.println("Thread Priority : "+t.getPriority());
		System.out.println("Thread is Alive : "+t.isAlive());
		System.out.println("Thread is Daemon : "+t.isDaemon());
		System.out.println("Thread is Interrupted : "+t.isInterrupted());
		System.out.println("Thread(in String Format) : "+t.toString());
		
		System.out.println("\n######### Setting New Thread Name #########\n");
		t.setName("Somit");
		System.out.println("New Name Of CurrentThread : "+t.getName());
		
//		System.out.println(10/0);
//		try {
//			System.out.println(10/0);
//		}catch(ArithmeticException a) {
////			System.out.println("Arithmetic Exception");
//				a.printStackTrace();
//		}
		
		
	}

}
/*
 	daemon threads are low-priority threads that run in the background to perform tasks such as garbage collection or provide services to user threads. The life of a daemon thread depends on the mercy of user threads, meaning that when all user threads finish their execution, the Java Virtual Machine (JVM) automatically terminates the daemon thread.

	To put it simply, daemon threads serve user threads by handling background tasks and have no role other than supporting the main execution.
 */
/*
 	CurrentThread()-
 		It is a static parameterized method present inside Thread class.
 		Declaration:-
 			public static native Thread CurrentThread()
 			native :- not present in java (more likely 3rd party)
 		It is used to get reference of CurrentThread
 		In Java we can getName & setName of currentThread by using getName()&setName()
*/