package com.java.inner.classes.anonymous;

public class B extends A {

	public static void main(String[] args) {
		B b = new B() {
			@Override
			public void display() {
				System.out.println("Hello venkata!");
			}

		};
		b.display();
	}

}
