package com.java.multithreading.thread;

public class MultiThreadingExample3 extends Thread {
	/*
	 * In Java, the sleep() method is used to pause the execution of the current
	 * thread for a specified amount of time. It's a part of the Thread class and is
	 * often used for various reasons in multithreaded programming and general
	 * timing scenarios.
	 */

	public static void main(String[] args) {
		MultiThreadingExample3 sleepMethod = new MultiThreadingExample3();
		sleepMethod.start();
		for (int j = 1; j <= 10; j++) {
			System.out.print("j : " + j + "\t");
			try {
				/* passing the execution of the method for 3 seconds */
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				System.out.println("Error in the main method");
			}
		}
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.print("i : " + i + "\t");
			try {
				/* passing the execution of the method for 3 seconds */
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				System.out.println("Error in the run method");
			}
		}
	}

}
