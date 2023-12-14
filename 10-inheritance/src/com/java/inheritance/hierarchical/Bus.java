package com.java.inheritance.hierarchical;

public class Bus extends Vehicle {
	
	/* Here Bus class is extending the properties from Vehicle class */

	/*
	 * Method Overriding :Method overriding is a fundamental concept in
	 * object-oriented programming (OOP) that allows a subclass to provide a
	 * specific implementation for a method that is already defined in its
	 * superclass. When a subclass redefines a method with the same name, return
	 * type, and method signature as a method in its superclass, it's said to be
	 * "overriding" the method.
	 * 
	 * The purpose of method overriding is to allow a subclass to customize or
	 * extend the behavior of its superclass's method according to its specific
	 * needs. This enables polymorphism, where objects of different classes can be
	 * treated as objects of a common superclass, but their overridden methods will
	 * be called based on their actual runtime type.
	 */
	@Override
	String fuel() {
		return "CNG Gas";
	}

}
