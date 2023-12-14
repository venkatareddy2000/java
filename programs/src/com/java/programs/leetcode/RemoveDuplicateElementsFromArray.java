package com.java.programs.leetcode;

public class RemoveDuplicateElementsFromArray {
	public int removeDuplicates(int[] nums) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
				continue;
			} else {
				nums[count] = nums[i];
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		RemoveDuplicateElementsFromArray removeDuplicateElements = new RemoveDuplicateElementsFromArray();
		int array[] = { 1, 1, 2, 2, 2, 3, 3 };
		int result = removeDuplicateElements.removeDuplicates(array);
		System.out.println("The number of unique elements in the array is : " + result);
	}

}
