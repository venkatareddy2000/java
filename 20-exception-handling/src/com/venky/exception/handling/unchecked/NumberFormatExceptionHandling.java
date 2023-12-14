package com.venky.exception.handling.unchecked;

public class NumberFormatExceptionHandling {

	public static void main(String[] args) {

		/*
		 * Number format exception will normally occurs when we tries to parse string to
		 * integer.
		 */

		try {
			String name = "Venkata Reddy";
			@SuppressWarnings("unused")
			int number = Integer.parseInt(name);
		} catch (NumberFormatException e) {
			System.out.println("We cannot parse from string to integer");
		}
		System.out.println("Handled number format exception successfully!");
	}

}
