package com.java.typecasting;

public class ExplicitTypeCasting {

	public static void main(String[] args) {
		
		/*
		 * Explicit type casting: In this type casting the programmer will convert from
		 * one data type to other data type and even conversion from higher data types
		 * to lower data type is also possible in explicit type casting, but it is not
		 * suggestible as there will be a data loss.
		 */

		int a = 2000;
		/* Converting int variable into byte variable explicitly */
		byte b = (byte) a;
		System.out.println("Printing the value of b on the console : " + b);

		char ch = 'A';
		/* Converting char variable into byte variable explicitly. */
		byte c = (byte) ch;
		System.out.println(c);
	}

}
