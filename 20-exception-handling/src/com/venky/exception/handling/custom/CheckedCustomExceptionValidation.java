package com.venky.exception.handling.custom;

public class CheckedCustomExceptionValidation {

	public static void main(String[] args) {
		
		/*
		 * As this is a checked exception the programmer needs to handle that using the
		 * try and catch block.
		 */
		try {
			throw new CheckedCustomException("I am a checked Exception");
		} catch (CheckedCustomException e) {
			System.err.println("Message : " + e.getMessage());
		}

	}

}
