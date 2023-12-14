package com.java.multithreading.deadlock;

public class SecondResource {

	public synchronized void method1(FirstResource fr) {
		System.out.println("In the method1 of SR");
		System.out.println(Thread.currentThread().getName());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Invoking method2 of FR");
		fr.method2();
	}

	public synchronized void method2() {
		System.out.println("In the method2 of SR");
	}
}
