package com.java.strings.demo;

public class Demo {

	public static void main(String[] args) {
		
		/* There are different way's to create string */

		String s1 = "Venkata Reddy";

		String s2 = new String("Challa");

		/* We can create string using an array of character's */

		char array[] = { 'a', 'e', 'i', 'o', 'u' };

		String s3 = new String(array);

		/* We can create string's using an array of byte's */
		byte bytes[] = { 78, 79, 80 };
		String s4 = new String(bytes);

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}

}
