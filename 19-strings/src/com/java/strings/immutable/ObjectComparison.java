package com.java.strings.immutable;

public class ObjectComparison {

	public static void main(String[] args) {
		
		Product product1 = new Product(1, "Apple");
		Product product2 = new Product(1, "Apple");

		/* False as the memory location is different for both the objects */
		System.out.println(product1 == product2);

		/*
		 * False will be printed even if both contents of the two objects are same
		 * because the equals method is from object class which will be inherited by all
		 * the classes by default. Even in the equals method they are using == operator
		 * to compare the memory address, but in Strings this equals method is override
		 * to compare the contents. If we want to compare the contents of the objects
		 * using equal method we need to override
		 */
		System.out.println(product1.equals(product2));

	}

}
