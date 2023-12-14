/*27. Remove Element*/
package com.java.programs.leetcode;

public class RemoveElement {
	public int removeElement(int[] nums, int val) {
		int i = 0;
		for (int j = 0; j < nums.length; j++) {
			if (nums[j] != val) {
				nums[i] = nums[j];
				i++;
			}
		}
		return i;
	}

	public static void main(String[] args) {
		RemoveElement removeElements = new RemoveElement();
		int nums[] = { 1, 2, 3, 3, 3, 4, 5, 5, 6, 6 };
		int val = 3;
		int result = removeElements.removeElement(nums, val);
		System.out.println("The number of elements left in the array is : " + result);

	}

}
