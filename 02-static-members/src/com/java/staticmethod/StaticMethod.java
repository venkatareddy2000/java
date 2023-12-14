package com.java.staticmethod;

public class StaticMethod {

	public static void main(String[] args) {
		
		System.out.println("Executing inside the main method before the static method call");

		/* To invoke a static method we need to use classname.methodname */
		StaticMethod.method1();

		System.out.println("Executing inside the main method after the static method call");

	}

	/*
	 * Creating a static method using static keyword
	 */
	static void method1() {
		System.out.println("Inside static method1");
	}

	/*
	 * We can call the static method inside a static block and this static block
	 * will execute first before the main method.
	 */
	static {
		System.out.println("Inside the static block");

		/* Calling the static method */
		StaticMethod.method1();
	}

}
