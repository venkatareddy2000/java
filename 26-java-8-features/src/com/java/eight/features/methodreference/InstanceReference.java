package com.java.eight.features.methodreference;

public class InstanceReference {

	public void myMethod() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Child Thread");
		}
	}

	public static void main(String[] args) {
		/*
		 * Create an instance for the class and use that instance to refer to the run()
		 * method present in the Runnable Interface
		 */
		InstanceReference instanceReference = new InstanceReference();
		Runnable runnable = instanceReference::myMethod;
		/*
		 * Here for the runnable interface instead of using lambda expression to
		 * override the run(), we are creating a our own method and referring to the
		 * run() in the Runnable Interface
		 */
		Thread thread = new Thread(runnable);
		thread.start();
		for (int i = 0; i <= 10; i++) {
			System.out.println("Parent Thread");
		}
	}

}
