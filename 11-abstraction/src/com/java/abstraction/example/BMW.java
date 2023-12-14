package com.java.abstraction.example;

public abstract class BMW {
	
	/*
	 * To create an abstract class, we use abstract keyword before the class. An
	 * abstract class contain both abstract methods and concrete methods
	 */

	/*
	 * The below steering method is a concrete method because we have written the
	 * implementation of method
	 */
	public void steering() {
		System.out.println("Power steering");
	}

	/*
	 * The below carColor method is an abstract method because we have used the
	 * abstract keyword for the method and we had not implemented anything in the
	 * method
	 */
	abstract void carColor();

	/*
	 * We can create main method in the abstract class, without any issues in the
	 * abstract class
	 */
	public static void main(String[] args) {
		System.out.println("Printing from the main method");

		/* We cannot create an instance or object for the abstract classes */
		// BMW bmw = new BMW(); commenting as it will throw an error
	}

	/*
	 * We cannot mark an abstract class as a final, if we do that, inheritance is
	 * not possible and we cannot provide implementations for the abstract classes
	 */

	/*
	 * We cannot mark the abstract methods as static methods because static methods
	 * will be same through out class and object and we cannot provide specific
	 * implementations for the abstract methods
	 */
}
