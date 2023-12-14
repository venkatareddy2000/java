package com.java.eight.features.streams;

import java.util.function.Predicate;

public class PredicateExample2 {

	public static void main(String[] args) {

		Predicate<String> stringPredicate = stringName -> (stringName.length() > 10);
		System.out.println(stringPredicate.test("Venkata Reddy"));
		System.out.println(stringPredicate.test("Venkata"));
	}

}
