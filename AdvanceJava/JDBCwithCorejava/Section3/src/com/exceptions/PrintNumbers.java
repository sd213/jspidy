package com.exceptions;
public class PrintNumbers {
    public static void main(String[]args) throws InterruptedException {
        for(int i = 1;i<=10;i++){
            System.out.println(i);
            Thread.sleep(2000);
        }
    }

}
