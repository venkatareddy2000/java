package com.java.generics.demo;

public class RestrictedGenericsTest {

	public static void main(String[] args) {
		/*
		 * RestrictedGenericsType<String> string = new
		 * RestrictedGenericsType<String>("Bharath"); string.displayObjectDetails();
		 * System.out.println(string.getObjects());
		 * 
		 * This will throw a compilation error because we are restricting the generic
		 * type to use only subclasses of Number, as String is not a subclass of Number
		 * class it will throw compilation error
		 */

		RestrictedGenericsType<Integer> integer = new RestrictedGenericsType<Integer>(100);
		integer.displayObjectDetails();
		System.out.println(integer.getObjects());

		RestrictedGenericsType<Double> doubleType = new RestrictedGenericsType<Double>(1000.2d);
		doubleType.displayObjectDetails();
		System.out.println(doubleType.getObjects());
	}

}
