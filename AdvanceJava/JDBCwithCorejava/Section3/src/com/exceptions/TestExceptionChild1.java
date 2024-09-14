package com.exceptions;

import java.io.IOException;

class Parent{
    void msg()  {
        System.out.println("parent method");
    }
}

public class TestExceptionChild1 extends Parent{
    void msg()throws ArithmeticException {
        System.out.println(10/0);
    }
//
//    public void msg() throws RuntimeException {
//        // Some implementation
//    }
//
//    // Invalid override: Declares a checked exception
////    @Override
//    public void msg() throws IOException {
//        // This will cause a compile-time error
//    }
    public static void main(String args[]) {
        Parent p = new TestExceptionChild1();
        p.msg();
        System.out.println("Hello World");
    }
}