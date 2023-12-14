package com.java.multithreading.classlevellocking;

public class DisplayName {
	
	/*
	 * When a thread enters this synchronized static method, it acquires a lock on
	 * the class level, means no any other thread can access any static methods
	 * present in this class until the class level lock is released. Threads can
	 * access other method in the class except synchronized static methods
	 */
	public synchronized static void displayName(String name) {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Hello " + name);
		}
	}

}
