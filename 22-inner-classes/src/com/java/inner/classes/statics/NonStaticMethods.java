package com.java.inner.classes.statics;

public class NonStaticMethods {

	static void method1() {
		System.out.println("Outer class method");
	}

	static class StaticInnerClass {

		static void method2() {
			System.out.println("Inner class method");
		}

		void method3() {
			System.out.println("Non static method from inner class");
		}
	}

	public static void main(String[] args) {
		NonStaticMethods.method1();
		NonStaticMethods.StaticInnerClass.method2();

		/* Create an object for the inner class to call the members of it */
		NonStaticMethods.StaticInnerClass innerClass = new NonStaticMethods.StaticInnerClass();
		innerClass.method3();

	}
}
