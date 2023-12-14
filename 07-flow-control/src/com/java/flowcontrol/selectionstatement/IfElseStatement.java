package com.java.flowcontrol.selectionstatement;

public class IfElseStatement {

	public static void main(String[] args) {

		/*
		 * If-Else statement : If the expression is true then the statements under the
		 * If block are executed Otherwise the statements under the else block are
		 * executed
		 */

		int x = 10;

		/* The condition is false so the else block will be executed */
		if (x > 10) {
			System.out.println("The number is greater than 10");
		} else {
			System.out.println("The number is lesser than or equal to 10");
		}
	}

}
