package com.java.flowcontrol.iterativestatement;

public class DoWhileLoop {

	public static void main(String[] args) {
		
		/*
		 * In the Do While loop the statement will be executed at least once. The
		 * difference between the while and do while is that in while loop the condition
		 * will be checked first and in the do while loop the statement will be printed
		 * first and the condition is checked later.
		 */
		int i = 1;
		do {
			System.out.println("The value of i is : " + i);
			i++;
		} while (i <= 5);
	}

}
