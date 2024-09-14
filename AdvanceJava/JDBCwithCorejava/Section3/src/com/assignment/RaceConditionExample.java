package com.assignment;

public class RaceConditionExample implements Runnable{
    private int counter = 0;

    public void increment() {
        counter++;
    }

    public int getCounter() {
        return counter;
    }
    public void run(){
        for (int i = 0; i < 1000; i++) {
            increment();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        RaceConditionExample example = new RaceConditionExample();

//        Runnable task = () -> {
//            for (int i = 0; i < 1000; i++) {
//                example.increment();
//            }
//        };

        Thread t1 = new Thread(example);
        Thread t2 = new Thread(example);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final counter value: " + example.getCounter());
    }
}
/*
In this example, the increment method is not synchronized, leading to a race condition. The final counter value may not be 2000 due to concurrent access.

Characteristics
Results in unpredictable and inconsistent outcomes.
Can be resolved by proper synchronization (e.g., using synchronized blocks or methods).
 */