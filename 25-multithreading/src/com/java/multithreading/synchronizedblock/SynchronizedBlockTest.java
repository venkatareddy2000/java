package com.java.multithreading.synchronizedblock;

public class SynchronizedBlockTest {

	public static void main(String[] args) {
		DisplayName displayName = new DisplayName();

		/*
		 * By passing the same DisplayName instance (displayName) to both t1 and t2, you
		 * ensure that they are synchronizing on the same lock.
		 */
		SynchronizedBlockExample t1 = new SynchronizedBlockExample(displayName, "Challa");
		SynchronizedBlockExample t2 = new SynchronizedBlockExample(displayName, "Venkata");

		t1.start();
		t2.start();
	}

}
