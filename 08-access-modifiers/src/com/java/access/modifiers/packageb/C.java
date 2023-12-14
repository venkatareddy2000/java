package com.java.access.modifiers.packageb;

import com.java.access.modifiers.packagea.A;

public class C {

	public static void main(String[] args) {
		A a = new A();

		/*
		 * In C Class we can only access the name variable as it is a public access
		 * modifier and we can access it in other package classes as well.
		 */
		System.out.println(a.name);
	}

}
