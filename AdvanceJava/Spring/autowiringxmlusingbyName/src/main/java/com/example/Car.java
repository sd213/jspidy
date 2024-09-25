package com.example;

public class Car {
	private Engine engine1;

    public void setEngine(Engine engine1) {
        this.engine1 = engine1;
    }

    public void start() {
        System.out.println("Car is starting with " + engine1);
    }
}
