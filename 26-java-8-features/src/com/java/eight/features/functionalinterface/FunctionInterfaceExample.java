package com.java.eight.features.functionalinterface;

import java.util.function.Function;

public class FunctionInterfaceExample {

	public static void main(String[] args) {
		/*
		 * Function is an interface that takes an input and returns a result.
		 * 
		 * The Function Interface contains the apply() that takes an input
		 *
		 * Creating a function to calculate the length of the string
		 */

		Function<String, Integer> function = name -> name.length();
		System.out.println("The length of the given string is : " + function.apply("Venkata Reddy Challa"));
		System.out.println("The length of the given string is : " + function.apply("Venkata Reddy"));

	}

}
