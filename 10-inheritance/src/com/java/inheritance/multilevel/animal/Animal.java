package com.java.inheritance.multilevel.animal;

public class Animal {
	/*
	 * Multilevel inheritance is another concept in object-oriented programming,
	 * where a class is derived from another class, which, in turn, is derived from
	 * another class. It creates a chain of inheritance, allowing a class to inherit
	 * properties and behaviors from multiple levels of ancestors.
	 * 
	 * In multilevel inheritance, a class serves as both a subclass and a
	 * superclass. The chain of inheritance forms a hierarchy, and each class in the
	 * hierarchy inherits the characteristics of its parent class.
	 */

	public void makeSound() {
		System.out.println("Animals make sound");
	}
}
