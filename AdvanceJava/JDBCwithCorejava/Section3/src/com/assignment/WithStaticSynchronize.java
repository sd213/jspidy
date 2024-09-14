package com.assignment;

public class WithStaticSynchronize implements Runnable{
    static void printNumbers(){
        for(int i = 1; i<=10;i++){
            System.out.println(Thread.currentThread().getName());
            try{
                Thread.sleep(500);
            }catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
    public void run(){
        printNumbers();
    }
    public static void main(String[] args ){
        WithStaticSynchronize wss = new WithStaticSynchronize();
        Thread t1 = new Thread(wss,"Shiv");
        Thread t2 = new Thread(wss,"Bishnu");

        t1.start();
        t2.start();
    }
}
