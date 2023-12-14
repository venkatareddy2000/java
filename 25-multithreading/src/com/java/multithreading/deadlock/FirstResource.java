package com.java.multithreading.deadlock;

public class FirstResource {

	public synchronized void method1(SecondResource sr) {
		System.out.println("In the method1 of FR");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Invoking method2 of SR");
		sr.method2();
	}

	public synchronized void method2() {
		System.out.println("In the method2 of FR");
	}
}
