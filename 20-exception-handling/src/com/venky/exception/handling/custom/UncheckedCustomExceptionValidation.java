package com.venky.exception.handling.custom;

public class UncheckedCustomExceptionValidation {

	public static void main(String[] args) {

		try {
			throw new UncheckedCustomException("I am unchecked exception");
		} catch (UncheckedCustomException e) {
			System.err.println("Message : " + e.getMessage());
		}

	}

}
