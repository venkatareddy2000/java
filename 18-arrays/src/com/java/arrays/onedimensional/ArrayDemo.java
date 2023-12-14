package com.java.arrays.onedimensional;

public class ArrayDemo {

	public static void main(String[] args) {

		/* Creating a new array */
		int[] array = new int[5];

		/*
		 * Assigning the values to the new array and we use array index to assign the
		 * values, the index starts from 0 to n-1
		 */
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;

		/* We can print the values of array using index */
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);

		/*
		 * A different way to create an array. We can intialize the values to an array
		 * at the time of declaration
		 */
		int[] array1 = { 60, 70, 80, 90, 100 };

		/*
		 * We use for loop to print the values of an array To find the length of an
		 * array use arrayname.length and assign it to an int variable
		 */
		for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}

		/*
		 * If we try to access an index that is out of range, will throw
		 * ArrayIndexOutofBoundException
		 *
		 * System.out.println(array[5]);// ArrayIndexOutofBoundException
		 */
		
		/* Using for each loop to loop through the array */
		for (int elements : array) {
			System.out.println(elements);
		}
	}

}
