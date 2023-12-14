package com.java.strings.bufferandbuilder;

public class StringBufferandBuilder {

	public static void main(String[] args) {
		
		/* Creating a new StringBuffer */
		StringBuffer stringBuffer = new StringBuffer();

		/* Checking the initial capacity of the newly created StringBuffer */
		System.out.println("Initial capacity : " + stringBuffer.capacity());

		/* Adding content to the String Buffer using append method */
		stringBuffer.append("Hi Challa");
		stringBuffer.append(" Venkata Reddy");

		/* Printing the stringBuffer */
		System.out.println(stringBuffer);

		/*
		 * Checking the capacity again .The capacity will automatically increase based
		 * on the content size
		 */
		System.out.println("Current capacity : " + stringBuffer.capacity());

		/* Finding the character by giving index number */
		System.out.println("The character at given index number is : " + stringBuffer.charAt(20));

		/* Creating a stringBuffer using another method */
		StringBuffer stringBuffer1 = new StringBuffer("Challa");
		
		/* Reversing a string buffer */
		System.out.println(stringBuffer1.reverse());
		
		/*
		 * Inserting into a string using insert() by giving the index position and the
		 * string that needs to be inserted
		 */
		System.out.println(stringBuffer1.insert(2, "Venkata"));

		/*
		 * Deleting a string using delete method by giving the starting and ending index
		 */
		System.out.println(stringBuffer1.delete(5, 10));
	}

}
