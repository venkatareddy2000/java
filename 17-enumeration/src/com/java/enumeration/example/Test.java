package com.java.enumeration.example;

public class Test {

	public static void main(String[] args) {
		/* Accessing enum */
		/*
		 * Day day = Day.MONDAY; System.out.println(day);
		 */

		/*
		 * Iterating through the enum using for each loop
		 * 
		 * We use values() to retrieve the enum values and ordinal() to position the
		 * position of the constant
		 */

		for (Day day : Day.values()) {
			System.out.println(day);
			System.out.println("The position of " + day + "is " + day.ordinal());
			System.out.println("The Day in the week is : " + day.getDay());
		}

	}

}
