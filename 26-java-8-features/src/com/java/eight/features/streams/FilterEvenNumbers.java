package com.java.eight.features.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNumbers {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();

		for (int i = 0; i <= 10; i++) {
			numbers.add(i);
		}
		/* Filtering the even numbers using streams */
		List<Integer> list = numbers.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(list);

		/* Counting the number of even numbers using count method */
		long count = list.stream().count();
		System.out.println("The number of even numbers is : " + count);

		/* Sorting the list using sort method */
		List<Integer> collect = numbers.stream().sorted().collect(Collectors.toList());
		System.out.println(collect);

		/* Creating a comparator */
		Comparator<Integer> comparator = (i1, i2) -> i1.compareTo(i2);

		/* Finding the maximum number in the even numbers */
		Integer max = list.stream().max(comparator).get();
		System.out.println("The maximum number in the even number is : " + max);

		/* Finding the minimum number in the even numbers */
		Integer min = list.stream().min(comparator).get();
		System.out.println("The minumum number in the even numbers is : " + min);

		/* Using for each */
		list.stream().forEach(i -> System.out.println(i));

	}

}
