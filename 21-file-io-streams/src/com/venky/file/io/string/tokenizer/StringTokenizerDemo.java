package com.venky.file.io.string.tokenizer;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {

		String name = "Challa Venkata Reddy";

		/* Default tokenizer */
		StringTokenizer stringTokenizer = new StringTokenizer(name);
		while (stringTokenizer.hasMoreElements()) {
			System.out.println(stringTokenizer.nextElement());
		}
		
		/*
		 * StringTokenizer with delimiter breaks the string where ever it finds the
		 * delimiter
		 */
		StringTokenizer tokenizer = new StringTokenizer(name, "e");
		System.out.println("With Delimiter :");
		while (tokenizer.hasMoreElements()) {
			System.out.println(tokenizer.nextElement());
		}

		/*
		 * StringTokenizer with delimiter and boolean, this boolean indicates whether we
		 * want's the delimiter to be printed or not
		 */
		StringTokenizer token = new StringTokenizer(name, "e", true);
		/*
		 * It will print the delimiter as well as we had given true as the boolean
		 * status and this delimiter will be printed in a new line.
		 */
		while (token.hasMoreElements()) {
			System.out.println(token.nextElement());
		}
	}

}
