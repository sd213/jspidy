package com.assignment;

public class WithoutSynchonized implements Runnable{
    void printNumbers() {
        for(int i = 1; i<=10;i++){
            System.out.println(Thread.currentThread().getName());

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    @Override
    public void run() {
        printNumbers();
    }

    public static void main(String[] args) {
        WithoutSynchonized wos = new WithoutSynchonized();
        Thread t1 = new Thread(wos,"das");
        Thread t2 = new Thread(wos,"sd");
        t1.start();
        t2.start();
    }

}
