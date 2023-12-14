package com.java.inheritance.superkeyword;

public class Child extends Parent {

	/*
	 * In Java, the super keyword is a reference variable used to refer to the
	 * immediate superclass (parent class) of a subclass. It allows the subclass to
	 * access members (fields or methods) of its superclass and invoke the
	 * superclass's constructors.
	 */
	int c;
	int d;

	Child(int a, int b, int c, int d) {
		super(a, b);
		this.c = c;
		this.d = d;
	}

	void display() {
		System.out.println("A value from parent class : " + super.a);
		System.out.println("B value from parent class : " + super.b);
		System.out.println("C value from child class : " + this.c);
		System.out.println("D value from child class : " + this.d);
	}

	@Override
	void method() {

		/* This will call the method that is present inside the parent class */
		super.method();
		System.out.println("Inside child class");
	}

}
