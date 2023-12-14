package com.venky.exception.handling.checked;

public class ThrowKeyword {

	public static void main(String[] args) {

		/*
		 * In Java, the throw keyword is used to explicitly throw an exception from
		 * within a block of code. When you encounter a situation where your code
		 * detects an exceptional condition that you want to handle further up the call
		 * stack, you can use the throw keyword to create and throw an instance of an
		 * exception class.
		 */

		try {
			int result = divide(10, 0);
			System.out.println("Result: " + result);
		} catch (ArithmeticException e) {
			System.err.println("An error occurred: " + e.getMessage());
		}
	}

	public static int divide(int dividend, int divisor) {
		if (divisor == 0) {
			throw new ArithmeticException("Division by zero is not possible");
		}
		return dividend / divisor;
	}

}
