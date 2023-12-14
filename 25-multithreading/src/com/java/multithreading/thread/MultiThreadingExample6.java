package com.java.multithreading.thread;

public class MultiThreadingExample6 extends Thread {

	public static void main(String[] args) {

		/* To identify the current thread we use Thread.currentThread method */
		Thread currentThread = Thread.currentThread();
		System.out.println(currentThread);

		/* Changing the name of the thread */
		currentThread.setName("Main Thread");

		/* Printing the name of the thread that is running */
		System.out.println("The current thread is : " + currentThread.getName());

		MultiThreadingExample6 threadIdentity = new MultiThreadingExample6();
		threadIdentity.start();

	}

	public void run() {

		/* To identify the current thread we use Thread.currentThread method */
		Thread currentThread = Thread.currentThread();
		System.out.println(currentThread);

		/* Changing the name of the thread */
		currentThread.setName("Run Thread");

		/* Printing the name of the thread that is running */
		System.out.println(currentThread);
		System.out.println("The current thread is : " + currentThread.getName());
	}

}
