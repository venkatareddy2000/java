/*66. Plus One*/
package com.java.programs.leetcode;

import java.util.Arrays;

public class PlusOne {

	public static int[] plusOne(int[] digits) {
		int size = digits.length;
		for (int i = size - 1; i >= 0; i--) {
			if (digits[i] < 9) {
				digits[i]++;
				return digits;
			}
			digits[i] = 0;
		}
		int newArray[] = new int[size + 1];
		newArray[0] = 1;
		return newArray;
	}

	public static void main(String[] args) {
		int[] digits = { 9 };
		System.out.println(Arrays.toString(plusOne(digits)));
	}
}
