package com.venky.exception.handling.unchecked;

public class MultipleCatchBlocks {

	public static void main(String[] args) {

		try {
			String input = args[0];
			System.out.println("Input is : " + input);
			int output = Integer.parseInt(input);
			System.out.println("Ouput is : " + output);
		}
		
		/* We can use multiple catch blocks to handle different exceptions */
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Please be in the limits!");
		} catch (NumberFormatException e) {
			System.out.println("We cannot convert string to an integer");
		}

		System.out.println("Using multiple catch blocks");

	}

}
