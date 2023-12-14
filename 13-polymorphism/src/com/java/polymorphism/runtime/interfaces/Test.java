package com.java.polymorphism.runtime.interfaces;

public class Test {

	public static void main(String[] args) {

		/*
		 * Here we are doing implicit type casting that converting form child class to
		 * super class
		 */
		Animal animal = new Dog();

		/*
		 * This example shows that we can implement runtime polymorphism with interfaces
		 * as well
		 */
		animal.sound();

		/*
		 * Explicit type casting : type casting parent variable to child variable
		 * explicitly
		 */
		Dog dog = (Dog) animal;
		dog.eats();
	}

}
