package com.java.strings.immutable;

public class StringComparison {

	public static void main(String[] args) {

		/*
		 * We can compare strings in two way's using == operator and equals() method
		 * 
		 * When we compare two strings using == operator it will check whether the
		 * memory address of the two strings is same if it is true returns true else it
		 * will return false.
		 * 
		 * When we compare two strings using equals() method it will compare the content
		 * of both the string if both strings are same returns true else it will return
		 * false
		 */
		String firstName = "challa";
		String lastName = "challa";

		/* Prints true as the memory address is same */
		System.out.println(firstName == lastName);

		/* Prints true as both the content is same. */
		System.out.println(firstName.equals(lastName));

		String fullName = new String("challa");

		/*
		 * Returns false as we had created a new memory location for the fullName object
		 * using new keyword
		 */
		System.out.println(firstName == fullName);

		/* Returns true as the content is same. */
		System.out.println(firstName.equals(fullName));

	}

}
