package com.java.multithreading.synchronizedblock;

public class SynchronizedBlockExample extends Thread {
	DisplayName displayName;
	String name;

	/*
	 * This is a constructor that is going to take two parameters one is the
	 * instance of the DisplayName class and the other is the name
	 */
	SynchronizedBlockExample(DisplayName displayName, String name) {
		this.displayName = displayName;
		this.name = name;
	}

	public void run() {
		displayName.displayName(name);
	}

}
