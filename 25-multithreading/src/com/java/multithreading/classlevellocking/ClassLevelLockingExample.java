package com.java.multithreading.classlevellocking;

public class ClassLevelLockingExample extends Thread {
	String name;

	ClassLevelLockingExample(String name) {
		this.name = name;
	}

	public void run() {
		DisplayName.displayName(name);
	}

}
