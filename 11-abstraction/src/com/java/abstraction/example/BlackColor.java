package com.java.abstraction.example;

public class BlackColor extends BMW {

	/*
	 * To inherit an abstract class we need to implement the unimplemented functions
	 * in the subclass
	 */

	@Override
	void carColor() {
		System.out.println("Black Color");
	}

}
