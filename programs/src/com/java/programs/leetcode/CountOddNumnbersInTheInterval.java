/*1523. Count Odd Numbers in an Interval Range*/
package com.java.programs.leetcode;

public class CountOddNumnbersInTheInterval {
	public int countOdds(int low, int high) {
		int count = 0;
		if (low % 2 == 0) {
			low = low + 1;
		}
		if (high % 2 == 0) {
			high = high - 1;
		}
		count = (high - low) / 2 + 1;
		return count;
	}

	public static void main(String[] args) {
		CountOddNumnbersInTheInterval countOddNumbers = new CountOddNumnbersInTheInterval();
		System.out.println(countOddNumbers.countOdds(2, 10));

	}

}
