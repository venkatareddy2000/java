package com.java.flowcontrol.iterativestatement;

public class WhileLoop {

	public static void main(String[] args) {
		
		/*
		 * Loop : Loop is used when we want to repeat a set of instructions. While Loop
		 * is used when the number of iterations is not fixed and the loop will continue
		 * till the expression in the while is false. Using While Loop to print he
		 * numbers from 1 to 10
		 */
		int i = 1;
		while (i <= 10) {
			System.out.println("The value of i is : " + i);
			i++;
		}
	}

}
