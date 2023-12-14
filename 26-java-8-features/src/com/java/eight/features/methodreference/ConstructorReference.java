package com.java.eight.features.methodreference;

public class ConstructorReference {

	ConstructorReference() {
		System.out.println("This is a ConstructorMethodReference program");
	}

	public static void main(String[] args) {
		Runnable runnable = ConstructorReference::new;

		Thread thread = new Thread(runnable);
		thread.start();
	}

}
