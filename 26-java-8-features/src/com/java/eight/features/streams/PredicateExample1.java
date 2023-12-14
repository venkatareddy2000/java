package com.java.eight.features.streams;

import java.util.function.Predicate;

public class PredicateExample1 {

	public static void main(String[] args) {
		/*
		 * In Java, a Predicate is a functional interface that represents a
		 * boolean-valued function that takes an argument and returns a boolean result.
		 * It is part of the java.util.function package, introduced in Java 8 as a
		 * fundamental component of the Java Stream API and functional programming
		 * features. A Predicate is often used to test whether a given input matches a
		 * certain condition or criteria.
		 * 
		 * The Predicate Contains a method test and we pass the arguments using the test
		 * method
		 */

		Predicate<Integer> predicate = num -> (num > 30);
		System.out.println(predicate.test(40));
		System.out.println(predicate.test(20));
		System.out.println(predicate.test(30));
	}

}
