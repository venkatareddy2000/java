package com.java.strings.immutable;

public class StringPooling {

	public static void main(String[] args) {
		Product product1 = new Product(1, "Android");
		Product product2 = new Product(2, "Android");

		System.out.println(product1);
		System.out.println(product2);

		String firstName = "challa";
		String lastName = "challa";

		/*
		 * The firstName and lastName object's will point to the same memory address as
		 * the String literal is both for same.
		 */
		System.out.println(firstName.hashCode());
		System.out.println(lastName.hashCode());

	}

}
