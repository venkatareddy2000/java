package com.java.packages.packageone;

public class A {

	public void name() {
		System.out.println("My Name is Venkata Reddy");
	}

	public static void age() {
		System.out.println("My age is 23");
	}

	public static void main(String[] args) {
		A a = new A();
		/* Calling name method */
		a.name();
		A.age();

	}

}
