package com.java.staticblock;

public class StaticBlock {

	public static void main(String[] args) {
		
		System.out.println("Hi Venkata Reddy");
	}

	/*
	 * In a Java class, a static block is a set of instructions that is run only
	 * once when a class is loaded into memory.
	 * 
	 * The static blocks will be executed first by the JVM and later it will start
	 * executing the main method.
	 * 
	 * To define a static block we need to use static keyword.
	 */
	static {
		System.out.println("Static Block 1");
	}

	/*
	 * Even if there are multiple static block, it will be executed in order before
	 * the execution of the main method
	 */
	static {
		System.out.println("Static Block 2");
	}
}
