package com.venky.exception.handling.unchecked;

public class ArrayIndexOutofBoundException {

	public static void main(String[] args) {
		
		/*
		 * An ArrayIndexOutOfBoundsException is a runtime exception in Java that occurs
		 * when you try to access an array element using an index that is outside the
		 * valid range of indices for that array. This typically happens when the index
		 * you're using is negative, or it's greater than or equal to the length of the
		 * array.
		 */

		int array[] = { 10, 20, 30 };
		for (int i = 0; i <= array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
