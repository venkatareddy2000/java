package com.venky.exception.handling.checked;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FinallyKeyword {

	public static void main(String[] args) {

		/*
		 * The finally block is a fundamental part of a try-catch-finally construct in
		 * Java and other programming languages. It allows you to define a block of code
		 * that will be executed regardless of whether an exception is thrown or not.
		 * This is useful for performing cleanup operations or releasing resources,
		 * ensuring that critical code is executed under all circumstances.
		 * 
		 * We can use finally block after try block without using the catch block, but
		 * if we do so, we are not handling the exception and it will stop the execution
		 * of the program.
		 */
		try {
			@SuppressWarnings({ "unused", "resource" })
			FileInputStream input = new FileInputStream("");
		} catch (FileNotFoundException e) {
			System.out.println("The file is not found on the computer");
		} finally {
			System.out.println("Finally block will get executed even if the exception is handled or not handled");
		}

	}

}
