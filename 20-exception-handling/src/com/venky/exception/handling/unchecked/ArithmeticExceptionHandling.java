package com.venky.exception.handling.unchecked;

import java.util.Scanner;

public class ArithmeticExceptionHandling {

	public static void main(String[] args) {

		/*
		 * If we pass the correct values for first number and second number it will
		 * divide and prints the result. After printing the result it will print
		 * "After Result" message as well.
		 * 
		 * When we pass "0" for the second number it will throw an arithmetic exception
		 * which is not user friendly to read and understand. It won't print
		 * "After Result" message as well as the normal flow of execution is disrupted
		 * 
		 * We need to handle the exceptions to avoid normal flow of program execution.
		 * 
		 * To handle exception we need to keep the code in try block that might cause
		 * exception and handle that exception using catch block
		 * 
		 * After handling the exception the execution of the program will not stop
		 * anywhere.
		 */
		int a;
		int b;
		int result;
		try {

			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter first number : ");
			a = scanner.nextInt();
			System.out.println("Enter second number : ");
			b = scanner.nextInt();
			result = a / b;
			System.out.println("The result is : " + result);
		} catch (ArithmeticException e) {
			System.out.println("Please don't give the second number as 0 ");
		}
		System.out.println("After Result");

	}

}
