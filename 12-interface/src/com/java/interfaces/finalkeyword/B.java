package com.java.interfaces.finalkeyword;

/* We cannot extend Class A because A is a final class */
public class B {

	final float PI = 3.14f;

	public final void display() {
		System.out.println("Nothing to display");
	}

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		final B b = new B();
		/* b = new B(); we cannot create a new reference for the final object */

		/*
		 * b.PI = 3.75f; We cannot change the value of PI from 3.14 to 3.75 as PI is
		 * declared with final Keyword
		 */

	}

}
