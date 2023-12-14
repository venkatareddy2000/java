package com.java.multithreading.interrupt;

public class InterruptMethodExample extends Thread {
	public void run() {
		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println("I am a good boy");
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("Invoking the interrupt method");
		}
	}

}
