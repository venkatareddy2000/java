package com.java.operators;

public class UnaryOperators {

	public static void main(String[] args) {
		/*
		 * Increment Operator : Increases the value by +1. There are two type of
		 * Increment Operators.
		 */
		/*
		 * Pre-Increment : First increase the value of the variable and gives the
		 * increased value as the result when the variable is called after executing the
		 * pre increment statement.
		 */
		int num1 = 10;
		int num2 = ++num1;
		System.out.println("The pre increment number of the num2 is : " + num2);

		/*
		 * 1.Post-Increment : The variable will be increased after executing the post
		 * increment statement
		 */
		int num3 = 20;
		int num4 = num3++;
		System.out.println("The post increment number of the num4 is : " + num4);

		/*
		 * The value of num3 will be increased by +1 when it is called second time
		 */
		int num5 = num3 + 5;
		System.out.println("The value of num5 is :" + num5);

		/*
		 * Decrement Operator : Decreases the value the operator by 1. There are two
		 * types of decrement operators.
		 */
		/*
		 * pre-decrement : First Decrement the value of the variable and gives the
		 * Decrement value as the result when the variable is called after executing the
		 * pre Decrement statement.
		 */
		int num6 = 10;
		int num7 = --num6;
		System.out.println("The value of num7 is :" + num7);

		/*
		 * post-decrement :Decreases the value of the variable by 1 when the variable is
		 * called for the second time.
		 */
		int num8 = num7--;
		System.out.println("The value of num8 is : " + num8);
		
		/*
		 * The value of the num7 will be decreased after the second call of performing
		 * decrement operator
		 */
		System.out.println("The value of num7 is : " + num7);
	}

}
