package com.example;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestRunner {
	public static void main(String[] args) {
		FileSystemXmlApplicationContext fc = new FileSystemXmlApplicationContext("/src/main/resources/config.xml");
		Car cr = (Car) fc.getBean(Car.class);
		System.out.println(cr);
		cr.start();
	}
}
