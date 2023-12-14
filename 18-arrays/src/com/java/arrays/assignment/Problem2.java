package com.java.arrays.assignment;

public class Problem2 {

	public static void main(String[] args) {
		char c[] = { 'a', 'b', 'e', 'f' };
		if (c[0] == c[c.length - 1]) {
			System.out.println("First and Last Element are same");
		} else {
			System.out.println("First and Last Element are different");
		}
	}

}
