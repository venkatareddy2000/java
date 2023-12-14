/*1. Two Sum*/
package com.java.programs.leetcode;

public class TwoSum {

	public int[] twoSum(int[] nums, int target) {
		int i = 0;
		int j = 0;
		int result[] = null;
		for (i = 0; i < nums.length; i++) {
			for (j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					result = new int[] { i, j };
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		TwoSum twoSums = new TwoSum();
		int[] nums = { 1, 2, 3, 4 };
		int target = 7;
		int result[] = twoSums.twoSum(nums, target);
		if (result.length == 2) {
			System.out.println("Indices: " + result[0] + ", " + result[1]);
		} else {
			System.out.println("No solution found.");
		}
	}

}
