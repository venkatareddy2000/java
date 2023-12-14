package com.java.multithreading.thread;

public class MultiThreadingExample8 implements Runnable {

	public static void main(String[] args) {

		MultiThreadingExample8 implementRunnable = new MultiThreadingExample8();
		/*
		 * We cannot directly call start the method because we are implementing the
		 * Runnable and it will throw compilation error, if we do.
		 *
		 * To call the thread methods we need to pass the object of the class to the
		 * thread constructor
		 */
		Thread thread = new Thread(implementRunnable);
		
		/* Now using the thread object we can call all the methods present in thread */
		thread.setName("Main Thread");
		thread.setPriority(10);
		thread.start();
	}

	@Override
	public void run() {
		System.out.println("The current running thread is : " + Thread.currentThread().getName()
				+ " with a thread priority of :" + Thread.currentThread().getPriority());

	}

}
