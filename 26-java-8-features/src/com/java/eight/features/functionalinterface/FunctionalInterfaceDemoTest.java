package com.java.eight.features.functionalinterface;

public class FunctionalInterfaceDemoTest {

	public static void main(String[] args) {

		/*
		 * To access any abstract method's we need to implement the interface and need
		 * to override the method and write our own logic. This is time taking process
		 * and need to write more lines of code. We can use lambda expression to
		 * implement the abstract methods in the interface
		 */

		FunctionalInterfaceExampleImpl implementation = new FunctionalInterfaceExampleImpl();
		implementation.method();

		/* using lambda expression we can reduce the lines of code */

		FunctionalIntefaceExample implementation1 = () -> System.out.println("Inside method");
		implementation1.method();

	}

}
