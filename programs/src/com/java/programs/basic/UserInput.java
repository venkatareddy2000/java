package com.java.programs.basic;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int number1 = scanner.nextInt();
		System.out.println("Enter the second number : ");
		int number2 = scanner.nextInt();
		System.out.println("The numbers entered are " + number1 + " and " + number2);
	}

}
