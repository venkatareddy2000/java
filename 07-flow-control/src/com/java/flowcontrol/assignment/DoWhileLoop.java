package com.java.flowcontrol.assignment;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		int i = 1;
		do {
			if (i % 10 == 0) {
				i++;
				continue;
			}
			if (i > 100) {
				break;
			}
			System.out.println(i);
			i++;
		} while (i <= num);
	}

}
