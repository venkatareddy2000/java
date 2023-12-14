package com.venky.exception.handling.checked;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsKeyword {

	/*
	 * In the below method, we are using throws keyword to throw the
	 * FileNotFoundException to the calling method and the calling method need to
	 * handle that exception
	 */

	void readFile() throws FileNotFoundException {
		@SuppressWarnings({ "unused", "resource" })
		FileInputStream FileInputStream = new FileInputStream("");
	}

	public static void main(String[] args) {
		ThrowsKeyword throwsKeyword = new ThrowsKeyword();

		try {

			/*
			 * The main method is calling the readFile method, as the readFile method is
			 * throwing the FileNotFoundException the main method has to handle that
			 * exception.
			 */
			throwsKeyword.readFile();
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}

	}

}
