package com.java.inheritance.single;

public class Derived extends Base {

	public void method2() {
		System.out.println("I was created in ExtendingSingleInheritance class");
	}

	public static void main(String[] args) {

		Derived derived = new Derived();

		/*
		 * Here we are inheriting the properties of Base class using extends keyword and
		 * the class name. Here the Base will be super class or parent class and the
		 * Derived class will be the child class or derived class.
		 */

		/*
		 * This inheritance is called as single inheritance because we are extending the
		 * properties of only one parent class
		 */
		derived.method1();

		/*
		 * We can add some extra features to the Base class . Calling method2 that was
		 * created in Derived class. We can use the properties of both parent class and
		 * derived class. We have to create class for low level objects
		 */
		derived.method2();

	}

}
