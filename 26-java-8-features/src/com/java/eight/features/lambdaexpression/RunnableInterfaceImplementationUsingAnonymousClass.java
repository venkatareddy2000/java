package com.java.eight.features.lambdaexpression;

public class RunnableInterfaceImplementationUsingAnonymousClass {

	public static void main(String[] args) {
		Thread thread = new Thread(() -> {
			for (int i = 1; i <= 10; i++) {
				System.out.println("Child Class");
			}
		});
		thread.start();
		for (int i = 1; i <= 10; i++) {
			System.out.println("Main Class");
		}
	}

}
