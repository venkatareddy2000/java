package com.java.flowcontrol.assignment;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		int i = 1;
		while (i <= num) {
			if (i % 10 == 0) {
				i++;
				continue;
			} else {
				if (i > 100)
					break;
			}
			System.out.println(i);
			i++;
		}
	}

}
