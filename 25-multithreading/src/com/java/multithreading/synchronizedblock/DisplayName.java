package com.java.multithreading.synchronizedblock;

public class DisplayName {
	
	/*
	 * Keeping a particular logic of code in synchronized block help's to execute
	 * that block of code by a single thread at time and all the remaining threads
	 * will be in waiting.
	 */
	public void displayName(String name) {
		
		synchronized (this) {
			for (int i = 1; i <= 10; i++) {
				System.out.println("Hello " + name);
			}
		}
	}

}
