package com.java.inheritance.single;

public class Base {

	/*
	 * Single inheritance is a feature of object-oriented programming languages,
	 * including Java, where a class can inherit from only one superclass. In other
	 * words, a class can have only one direct parent class from which it inherits
	 * properties and behaviors.
	 */

	/*
	 * By default every class inherits the properties of object class that is
	 * present in java.lang package. We need not to extend object class, as the
	 * compiler will automatically do for all the classes and in this object class
	 * there are lot of methods which are useful, we can use them in our program
	 */

	/* creating a class method */
	public void method1() {
		System.out.println("Hello Venkata Reddy");
	}

	public static void main(String[] args) {

		/* creating object for the class to access methods */
		Base base = new Base();

		/* accessing the method1 */
		base.method1();

		/*
		 * In the above below line we are calling a getClass method which is not created
		 * by us. This getClass method is from the object class and each class will
		 * inherit this object class and we are accessing the properties present in the
		 * object class. We no need to extend the object class implicitly, the compiler
		 * will do for us.
		 */
		System.out.println(base.getClass());

	}

}
