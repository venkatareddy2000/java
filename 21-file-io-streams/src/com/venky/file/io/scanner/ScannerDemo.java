package com.venky.file.io.scanner;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name : ");
		String name = scanner.nextLine();
		System.out.println("Hello " + name);
	}

}
