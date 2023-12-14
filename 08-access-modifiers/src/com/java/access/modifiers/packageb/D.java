package com.java.access.modifiers.packageb;

import com.java.access.modifiers.packagea.A;

public class D extends A {

	public static void main(String[] args) {
		A a = new A();
		D d = new D();
		/*
		 * We are accessing the protected variable inside D Class which is in a
		 * different package by inheriting the A Class
		 */
		System.out.println(a.name);
		System.out.println(d.salary);

	}

}
