package com.java.eight.features.defaultmethod;

public class DefaultMethodInterfaceImplementation implements DefaultMethodInterfaceExample1, DefaultMethodInterfaceExample2 {

	/*
	 * Whenever we implement multiple interfaces which contains same default methods
	 * in the extended method we need to override it else it will cause compilation
	 * error.
	 */
	@Override
	public void method() {
		System.out.println("Inside DefaultMethodInterfaceImplementation method");
	}

}
