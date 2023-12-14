package com.java.generics.demo;

public class CustomGenericsTest {

	public static void main(String[] args) {
		CustomGenerics<String> string = new CustomGenerics<String>("Bharath");
		string.displayObjectDetails();
		System.out.println(string.getObjects());

		CustomGenerics<Integer> integer = new CustomGenerics<Integer>(100);
		integer.displayObjectDetails();
		System.out.println(integer.getObjects());

		CustomGenerics<Double> doubleType = new CustomGenerics<Double>(1000.2d);
		doubleType.displayObjectDetails();
		System.out.println(doubleType.getObjects());
	}

}
