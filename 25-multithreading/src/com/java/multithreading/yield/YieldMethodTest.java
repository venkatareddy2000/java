package com.java.multithreading.yield;

public class YieldMethodTest {

	public static void main(String[] args) {
		/*
		 * Yield method is of thread class that allows another thread to run which has
		 * the same priority by stopping the execution of its current thread
		 */
		YieldMethodExample yieldMethod = new YieldMethodExample();
		yieldMethod.start();
		for (int j = 1; j <= 10; j++) {
			System.out.println("j : " + j);
		}
	}

}
