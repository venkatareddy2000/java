package com.java.eight.features.streams;

import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {
		/* Optional class will be useful in handling null pointer exception */

		/* Creating an empty optional */
		Optional<String> empty = Optional.empty();
		/*
		 * isPresent method is used to check whether the optional data is present or not
		 * and returns a boolean value
		 */
		System.out.println(empty.isPresent());

		/* Creating an optional which contains data */
		Optional<String> optional = Optional.of("Challa Venkata Reddy");
		System.out.println(optional.isPresent());

		/*
		 * get() is used to get the data of the optional if it is present if the data is
		 * not present it will throw an exception
		 */
		System.out.println("Optional value is : " + optional.get());
		// System.out.println(empty.get());will throw an exception

		/*
		 * filter method(): If a value is present, and the value matches the given
		 * predicate,returns an Optional describing the value, otherwise returns an
		 * empty Optional
		 */
		System.out.println(optional.filter(s -> s.equals("Challa Venkata Reddy")));
		System.out.println(empty.filter(s -> s.equals("Challa Venkata Reddy")));

		/*
		 * orElse(): If a value is present, returns the value, otherwise returns other
		 */
		System.out.println(optional.orElse("Venkata Reddy"));
		System.out.println(empty.orElse("Venky"));

		/*
		 * ifPresent(): If a value is present, performs the given action with the
		 * value,otherwise does nothing.
		 */
		optional.ifPresent(System.out::println);
		empty.ifPresent(System.out::println);
	}

}
