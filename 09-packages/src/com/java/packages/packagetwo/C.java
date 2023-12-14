package com.java.packages.packagetwo;

import com.java.packages.packageone.*;

public class C {

	public static void main(String[] args) {

		/*
		 * As the C Class is present in a different package if we want to access the
		 * methods of A Class present which is present in a different package we need to
		 * import the package in C Class.
		 */
		A a = new A();
		a.name();
		A.age();

		/*
		 * If we don't want to import the packages we can use another way to call the
		 * methods. In the second method we need to give the whole package name and
		 * class name to access methods present in that class.
		 */
		com.java.packages.packageone.A b = new com.java.packages.packageone.A();
		b.name();
		com.java.packages.packageone.A.age();
	}

}
