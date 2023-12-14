package com.java.strings.immutable;

public class StringMethods {

	public static void main(String[] args) {
		String name = "Venkata Reddy";

		System.out.println("Length of the string is : " + name.length());
		System.out.println("Index of the given character is : " + name.indexOf('a'));
		System.out.println("Character at the index is : " + name.charAt(3));
		System.out.println("Substring with starting index : " + name.substring(4));
		System.out.println("Substring with starting and ending index is :" + name.substring(0, 6));

		String[] result = name.split(" ");
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		System.out.println(name.replace('e', 'E'));
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());

	}

}
