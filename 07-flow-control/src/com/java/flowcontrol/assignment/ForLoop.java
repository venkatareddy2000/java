package com.java.flowcontrol.assignment;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			if (i % 10 == 0) {
				continue;
			} else {
				if (i > 100)
					break;
				System.out.println(i);
			}
		}
	}

}
