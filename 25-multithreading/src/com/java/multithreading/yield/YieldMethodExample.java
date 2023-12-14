package com.java.multithreading.yield;

public class YieldMethodExample extends Thread {

	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("i : " + i);
			/*
			 * The yield method will stop it's current execution and will give the chance to
			 * other thread for execution.
			 */
			Thread.yield();
		}
	}

}
