package com.java.flowcontrol.assignment;

import java.util.Scanner;

public class PrimeorNot {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check whether it is prime or not : ");
		int num = sc.nextInt();
		boolean flag = true;

		for (int i = 2; i < num - 1; i++) {
			if (num % i == 0)
				flag = false;
		}
		if (flag) {
			System.out.println("The number you entered is prime");
		} else {
			System.out.println("The number you entered is not a prime number");
		}

	}

}
