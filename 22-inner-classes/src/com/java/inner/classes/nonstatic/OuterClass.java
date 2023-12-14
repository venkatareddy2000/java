package com.java.inner.classes.nonstatic;

public class OuterClass {

	void method1() {
		System.out.println("Outer class method");
	}

	class Inner {
		void method2() {
			System.out.println("Inner class method");
		}
	}

	public static void main(String[] args) {
		
		/* To access non static members create an object for the class */
		OuterClass outer = new OuterClass();
		outer.method1();

		/*
		 * To create object for the inner class we need to use the object reference of
		 * the Outer class.
		 */
		OuterClass.Inner inner = outer.new Inner();
		inner.method2();
	}

}
