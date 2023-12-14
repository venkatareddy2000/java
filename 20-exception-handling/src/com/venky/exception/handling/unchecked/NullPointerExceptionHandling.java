package com.venky.exception.handling.unchecked;

public class NullPointerExceptionHandling {

	String name = null;

	public static void main(String[] args) {

		/*
		 * A NullPointerException is a runtime exception in Java that occurs when you
		 * try to access an object's method or field, or invoke an operation on an
		 * object, but the object reference points to null instead of an actual instance
		 * of an object. In other words, you're trying to perform an operation on an
		 * object that doesn't exist.
		 */

		try {
			NullPointerExceptionHandling exception = new NullPointerExceptionHandling();

			/*
			 * I was trying to print the length of the string name whose value is null and
			 * it is throwing a null point exception as we cannot perform any operations on
			 * null values.
			 */
			System.out.println(exception.name.length());
		} catch (NullPointerException e) {
			System.out.println("Please don't give null values");
		}

	}

}
