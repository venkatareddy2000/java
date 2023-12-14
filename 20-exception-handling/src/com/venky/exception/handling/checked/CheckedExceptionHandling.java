package com.venky.exception.handling.checked;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionHandling {

	public static void main(String[] args) {

		/*
		 * This is an example of checked exception where the compiler want us to handle
		 * the exception by the programmer.
		 */
		try {
			@SuppressWarnings({ "unused", "resource" })
			FileInputStream input = new FileInputStream("");
		} catch (FileNotFoundException e) {
			System.out.println("The file is not found on the computer");
		}
	}

}
