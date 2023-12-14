package com.java.arrays.assignment;

public class Problem1 {

	public static void main(String[] args) {
		int array[] = { 5, 3, 5, 6, 7, 3, 5 };
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 3) {
				if (array[i + 1] == 5) {
					array[i + 1] = 0;
				}
			}
			System.out.println(array[i]);
		}
	}

}
