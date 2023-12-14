package com.java.multithreading.synchronization;

public class DisplayName {
	/*
	 * Creating a synchronized method using the keyword synchronized. This
	 * synchronized method will make sure that a threads completes all its execution
	 * and hands over the method to the next thread
	 */
	public synchronized void displayName(String name) {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Hello " + name);
		}
	}

}
