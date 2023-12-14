package com.java.flowcontrol.transferstatement;

public class BreakStatement {

	public static void main(String[] args) {

		/*
		 * Break Keyword is used when you want to stop execution when a particular
		 * condition is met
		 */

		/*
		 * Breaking loop when the condition is equal to 5
		 */
		for (int i = 3; i <= 10; i++) {
			System.out.println("The value of i is : " + i);
			if (i == 5)
				break;
		}
	}

}
