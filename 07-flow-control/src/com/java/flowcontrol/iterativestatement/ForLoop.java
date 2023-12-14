package com.java.flowcontrol.iterativestatement;

public class ForLoop {

	public static void main(String[] args) {

		/* For loop is used when we know the number of iterations the loop has to do. */

		/* Printing numbers from 1 to 10 using for loop */
		for (int i = 1; i <= 10; i++) {
			System.out.println("The value of i is : " + i);
		}

		System.out.println("Using For Each loop");

		/*
		 * using For each Loop to print the numbers in the Array For each loop is mainly
		 * used for arrays and collections
		 */
		int Array[] = { 1, 2, 3, 4 };
		for (int i : Array) {
			System.out.println(i);
		}

		System.out.println("Using break keyword to come out of the loop when the i value is 5");

		/*
		 * Breaking a Loop : When we want to break loop when a particular condition is
		 * met we use break keyword. We are breaking the loop when the condition is
		 * equal to 5
		 */
		for (int i = 3; i <= 10; i++) {
			System.out.println("The value of i is : " + i);
			if (i == 5)
				break;
		}

		System.out.println("Using continue keywordd and skip to print the value 4");
		
		/*
		 * Continue Keyword : continue keyword is used when we want to skip a particular
		 * loop
		 */

		for (int i = 3; i <= 5; i++) {
			if (i == 4)
				continue;
			System.out.println("The value of i is : " + i);
		}
	}

}
