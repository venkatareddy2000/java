package com.java.eight.features.defaultmethod;

public interface DefaultMethodInterfaceExample1 {
	/*
	 * From Java8 onwards we can use default methods in java where we can write the
	 * implementation for the methods in the interface itself
	 */
	default void method() {
		System.out.println("From DefaultMethodInterfaceExample1 Method");
	}

}
