package com.java.packages.packageone;

public class B {

	public static void main(String[] args) {

		/*
		 * A Class is present in the same package where B Class is present, so there is
		 * no need to import the package to access methods.
		 */
		A a = new A();
		/* Calling name method */
		a.name();
		/* Calling the age method */
		A.age();
	}

}
