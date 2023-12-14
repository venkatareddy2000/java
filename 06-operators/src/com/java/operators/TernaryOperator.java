package com.java.operators;

public class TernaryOperator {

	public static void main(String[] args) {

		/*
		 * Ternary operator:(expression)?value1:value2. If expression is true it will
		 * print value1 and it will print value2 if expression is false
		 */
		int x = 10;
		int y = 20;
		String result = (x > y) ? "X is greater" : "Y is greater";
		System.out.println(result);

	}

}
