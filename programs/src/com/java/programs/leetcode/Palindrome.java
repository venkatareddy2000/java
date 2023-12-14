/*9. Palindrome Number*/
package com.java.programs.leetcode;

public class Palindrome {
	public boolean isPalindrome(int x) {
		int num = x;
		int result = 0;
		if (x < 0) {
			return false;
		} else {
			while (x != 0) {
				int reminder = x % 10;
				result = result * 10 + reminder;
				x = x / 10;
			}
			if (num == result) {
				return true;
			} else {
				return false;
			}
		}
	}

	public static void main(String[] args) {
		Palindrome palindrome = new Palindrome();
		System.out.println(palindrome.isPalindrome(121));

	}

}
