package com.java.eight.features.functionalinterface;

@FunctionalInterface
public interface FunctionalInterfaceExampleExtends extends FunctionalIntefaceExample {
	
	void method();
	/*
	 * If we extend any FunctionalInterface we cannot create any extra abstract method if
	 * we mark the child class with @FunctionalInterface as it will throw a
	 * compilation error
	 */
	//void method2();
}

