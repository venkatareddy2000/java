package com.java.multithreading.synchronization;

public class SynchronizedTest {

	public static void main(String[] args) {

		/* Creating an instance of DisplayName class */
		DisplayName displayName = new DisplayName();

		/*
		 * By passing the same DisplayName instance (displayName) to both t1 and t2, you
		 * ensure that they are synchronizing on the same lock.
		 */
		SynchronizedExample t1 = new SynchronizedExample(displayName, "Challa");
		SynchronizedExample t2 = new SynchronizedExample(displayName, "Venkata");

		t1.start();
		t2.start();
	}

}
