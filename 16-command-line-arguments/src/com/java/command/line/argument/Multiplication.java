package com.java.command.line.argument;

public class Multiplication {

	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);

		int result = num1 * num2;
		System.out.println("The muliplication of two numbers is : " + result);
	}

}
