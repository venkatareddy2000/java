package com.java.flowcontrol.selectionstatement;

public class IfElseIfStatement {

	public static void main(String[] args) {

		/*
		 * If-else if-else statement : If condition is true then If block will be
		 * executed. If condition is false then it will come and check the else if
		 * condition and if the else if condition is true then the statements under the
		 * else if will be executed. If both the If condition and else-if condition are
		 * not true then the else block will be executed.
		 */

		int x = 10;
		if (x > 10) {
			System.out.println("The X is greater than 10");
		} else if (x == 10) {
			System.out.println("The number is equal to 10");
		} else {
			System.out.println("The number is less than 10");
		}
	}

}
