package com.java.inheritance.hierarchical;

public class Vehicle {
	
	/*
	 * Hierarchical inheritance is another type of inheritance in object-oriented
	 * programming, where multiple classes inherit from a single base (super) class.
	 * In this type of inheritance, a single superclass serves as the ancestor for
	 * multiple subclasses, forming a hierarchical structure.
	 * 
	 * The hierarchical inheritance relationship allows for code reusability and the
	 * sharing of common characteristics among related classes. Each subclass
	 * inherits the properties and behaviors of the superclass, and it can also have
	 * its own additional properties and behaviors specific to that subclass.
	 */

	/*
	 * Vehicle class is the super class and this super class serves as a ancestor
	 * for multiple subclasses
	 */

	String fuel() {
		return "petrol";
	}

}
