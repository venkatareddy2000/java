/*13. Roman to Integer*/
package com.java.programs.leetcode;

import java.util.HashMap;

public class RomanToInteger {

	public int romanToInteger(String input) {
		int result = 0;
		int currentValue = 0;
		int preValue = 0;
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		hashMap.put('I', 1);
		hashMap.put('V', 5);
		hashMap.put('X', 10);
		hashMap.put('L', 50);
		hashMap.put('C', 100);
		hashMap.put('D', 500);
		hashMap.put('M', 1000);
		for (int i = input.length() - 1; i >= 0; i--) {
			char currentChar = input.charAt(i);
			currentValue = hashMap.get(currentChar);
			if (currentValue < preValue) {
				result = result - currentValue;
			} else {
				result = result + currentValue;
			}
			preValue = currentValue;
		}
		return result;
	}

	public static void main(String[] args) {
		RomanToInteger romanToIntegerConversion = new RomanToInteger();
		int result = romanToIntegerConversion.romanToInteger("IV");
		System.out.println("The value after converting from roman to integer is : " + result);

	}

}
