package com.java.inner.classes.statics;

public class StaticMethods {
	static void method1() {
		System.out.println("Outer class method");
	}

	static class StaticInnerClass {

		static void method2() {
			System.out.println("Inner class method");
		}
	}

	public static void main(String[] args) {
		StaticMethods.method1();
		StaticMethods.StaticInnerClass.method2();
	}
}
