package com.venky.exception.handling.unchecked;

public class ExceptionandInheritance {

	public static void main(String[] args) {

		/*
		 * Instead of multiple catch blocks we can use the parent class for the object
		 * reference
		 * 
		 * catch(RuntimeException e){ System.out.println("Handling runtime exceptions");
		 * }
		 * 
		 * Here we can handle all the runtime exceptions with in a single catch block
		 * and it is not a good idea to do that because the same message will be printed
		 * for different exceptions
		 */

		try {
			String input = args[0];
			System.out.println("Input is : " + input);
			int output = Integer.parseInt(input);
			System.out.println("Ouput is : " + output);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Please be in the limits!");
		} catch (NumberFormatException e) {
			System.out.println("We cannot convert string to an integer");
		}

		/* We can use multiple catch blocks to handle different exceptions */
		System.out.println("Using multiple catch blocks");

	}

}
