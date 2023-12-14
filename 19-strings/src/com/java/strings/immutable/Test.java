package com.java.strings.immutable;

public class Test {

	public static void main(String[] args) {
		Product product = new Product(1, "Venkata Reddy");
		System.out.println(product);

		String name = "Challa Venkata Reddy";

		Integer i = Integer.valueOf(123456);

		/*
		 * The JVM won't print the address of the immutable object's. Here name and i
		 * are immutable object so, it's is printing the values instead of the memory
		 * address where as, the product object is mutable so it is printing the memory
		 * address of the object.
		 */
		System.out.println(name);
		System.out.println(i);

	}

}
