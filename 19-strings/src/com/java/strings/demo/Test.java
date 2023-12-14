package com.java.strings.demo;

public class Test {

	public static void main(String[] args) {

		/*
		 * This example shows that the JVM treat's Strings and Wrapper classes
		 * differently compare to other object's.
		 * 
		 * In the line17, I'm trying to print the value's of product with the help of
		 * object reference but, we are getting the address of the object reference.
		 * Where as for the String and Integer object reference we are getting the
		 * vlaue's because the JVM will treat String's and wrapper classes differently.
		 */
		Product product = new Product(1, "Venkata Reddy");
		System.out.println(product);

		String name = "Challa Venkata Reddy";

		Integer i = Integer.valueOf(123456);

		System.out.println(name);
		System.out.println(i);

	}

}
