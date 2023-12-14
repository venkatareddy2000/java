package com.java.inner.classes.anonymous;

/*Trying to implement Runnable interface using anonymous inner class*/
public class ImplementingAnInterface {

	public static void main(String[] args) {

		Runnable myRunnable = new Runnable() {

			@Override
			public void run() {
				System.out.println("Starting of the thread");
			}

		};

		Thread thread = new Thread(myRunnable);
		thread.start();

	}

}
