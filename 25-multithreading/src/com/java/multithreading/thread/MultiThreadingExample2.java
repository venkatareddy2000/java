package com.java.multithreading.thread;

public class MultiThreadingExample2 extends Thread {
	/*
	 * We use multithreading to perform different tasks at same time.
	 * 
	 * To create thread we need to extend Thread class or implement runnable
	 * interface.
	 * 
	 * In this program we are going to extend Thread class, after extending the
	 * Thread class we need override the run method and we will code the logic in
	 * the run method which we want to execute.
	 */

	public static void main(String[] args) {

		/*
		 * To start a thread we need to create object for the class and have to call the
		 * start method which will call the run method once the CPU is ready to perform
		 * the task and we cannot directly call the run method.
		 */

		MultiThreadingExample2 multiThreading = new MultiThreadingExample2();
		multiThreading.start();

		for (int j = 1; j <= 10; j++) {
			System.out.print("j : " + j + "\t");
		}
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.print("i : " + i + "\t");
		}
	}

}
