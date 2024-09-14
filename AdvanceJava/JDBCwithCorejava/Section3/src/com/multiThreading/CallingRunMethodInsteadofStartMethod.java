package com.multiThreading;

public class CallingRunMethodInsteadofStartMethod extends Thread{

	public void run() {
		Thread ct = Thread.currentThread();
		System.out.println("Newly Created Thread : "+ct);
		System.out.println("Name Of Thread :"+ct.getName());
		System.out.println("Thread Priority : "+ct.getPriority());
		System.out.println("Thread is Alive : "+ct.isAlive()); // true
		System.out.println("Thread is Daemon : "+ct.isDaemon());
		System.out.println("Thread is Interrupted : "+ct.isInterrupted());
		System.out.println("Thread(in String Format) : "+ct.toString());
		System.out.println("\n");
		System.out.println("Newly Created Thread : "+this);
		System.out.println("Name Of Thread :"+this.getName());
		System.out.println("Thread Priority : "+this.getPriority());
		System.out.println("Thread is Alive : "+this.isAlive()); // true
		System.out.println("Thread is Daemon : "+this.isDaemon());
		System.out.println("Thread is Interrupted : "+this.isInterrupted());
		System.out.println("Thread(in String Format) : "+this.toString());
		for(char c = 'A';c<='K';c++) {
			System.out.println(c);
			try {
				Thread.sleep(1000);
				}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		
		CallingRunMethodInsteadofStartMethod t1 = new CallingRunMethodInsteadofStartMethod();
		System.out.println("Newly Created Thread : "+t1);
		System.out.println("Name Of Thread :"+t1.getName());
		System.out.println("Thread Priority : "+t1.getPriority());
		System.out.println("Thread is Alive : "+t1.isAlive()); // false
		System.out.println("Thread is Daemon : "+t1.isDaemon());
		System.out.println("Thread is Interrupted : "+t1.isInterrupted());
		System.out.println("Thread(in String Format) : "+t1.toString());
		
		System.out.println("\n\n.......\n");
		System.out.println("Starting Thread....");
		
		System.out.println("\n\n.......\n");
		
		
	}

}
/*
 	if we call run() instead of start() then no new Thread will be created and run() is executed by default method. in this case main method.
 	
 */

//t1.run(); //if i used this first
/*
 Newly Created Thread : Thread[Thread-0,5,main]
Name Of Thread :Thread-0
Thread Priority : 5
Thread is Alive : false
Thread is Daemon : false
Thread is Interrupted : false
Thread(in String Format) : Thread[Thread-0,5,main]


.......

Starting Thread....
Newly Created Thread : Thread[main,5,main]
Name Of Thread :main
Thread Priority : 5
Thread is Alive : true
Thread is Daemon : false
Thread is Interrupted : false
Thread(in String Format) : Thread[main,5,main]


Newly Created Thread : Thread[Thread-0,5,main]
Name Of Thread :Thread-0
Thread Priority : 5
Thread is Alive : false
Thread is Daemon : false
Thread is Interrupted : false
Thread(in String Format) : Thread[Thread-0,5,main]
A
B
C
D
E
F
G
H
I
J
K


.......


 */

//t1.start(); // if I used this first
/*
 * Newly Created Thread : Thread[Thread-0,5,main]
Name Of Thread :Thread-0
Thread Priority : 5
Thread is Alive : false
Thread is Daemon : false
Thread is Interrupted : false
Thread(in String Format) : Thread[Thread-0,5,main]


.......

Starting Thread....


.......

Newly Created Thread : Thread[Thread-0,5,main]
Name Of Thread :Thread-0
Thread Priority : 5
Thread is Alive : true
Thread is Daemon : false
Thread is Interrupted : false
Thread(in String Format) : Thread[Thread-0,5,main]


Newly Created Thread : Thread[Thread-0,5,main]
Name Of Thread :Thread-0
Thread Priority : 5
Thread is Alive : true
Thread is Daemon : false
Thread is Interrupted : false
Thread(in String Format) : Thread[Thread-0,5,main]
A
B
C
D
E
F
G
H
I
J
K

 */

