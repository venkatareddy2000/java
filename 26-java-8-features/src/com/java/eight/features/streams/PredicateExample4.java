package com.java.eight.features.streams;

import java.util.function.Predicate;

public class PredicateExample4 {
	/* Passing a predicate to a method */
	public void method(Predicate<Integer> integerPredicate, int[] array) {
		for (int i : array) {
			if (integerPredicate.test(i))
				System.out.println(i);
		}
	}

	public static void main(String[] args) {
		/* Creating an array */
		int[] array = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		/* Creating a predicate */
		Predicate<Integer> integerPredicate = (number) -> (number > 50);
		PredicateExample4 predicateMethodPassing = new PredicateExample4();
		/* Calling the method by passing the predicate */
		predicateMethodPassing.method(integerPredicate, array);
	}

}
