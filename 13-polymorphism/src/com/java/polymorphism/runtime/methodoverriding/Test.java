package com.java.polymorphism.runtime.methodoverriding;

public class Test {

	public static void main(String[] args) {

		/* Here the compiler will assign to the methods present in sub class */
		Animal animal = new Dog();

		/*
		 * During runtime the JVM will check whether there are any updates in the
		 * methods and if there are any the JVM will print the updated method from sub
		 * class
		 */
		animal.sound();

	}

}
