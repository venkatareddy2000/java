package com.venky.exception.handling.unchecked;

public class NumberFormatExceptions {

	public static void main(String[] args) {

		/*
		 * Number format exception will normally occurs when we tries to parse string to
		 * integer.
		 */
		String name = "Venkata Reddy";
		@SuppressWarnings("unused")
		/* Number Format Exception */
		int number = Integer.parseInt(name);
	}

}
