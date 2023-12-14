package com.java.multithreading.interrupt;

public class InterruptMethodTest {

	public static void main(String[] args) {
		InterruptMethodExample interruptMethod = new InterruptMethodExample();
		interruptMethod.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		interruptMethod.interrupt();
		System.out.println("In the main method interrupt method is called");
	}

}
