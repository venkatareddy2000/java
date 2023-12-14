package com.java.operators;

public class LogicalOperators {

	public static void main(String[] args) {
		/*
		 * Logical Operator : There are three types of logical operator. 1.AND : If both
		 * the conditions are true then the result will be true else the result will be
		 * false. 2.OR : If any of the condition is true then the result will be true.
		 * 3.NOT : we will get the result opposite to the condition
		 */
		int x = 10;
		int y = 5;

		System.out.println("AND operator result : " + (x > 10 && y < 4));

		System.out.println("OR operator result : " + (x >= 10 || y < 4));

		System.out.println("NOT operator result : " + (!(x > 10)));
	}

}
