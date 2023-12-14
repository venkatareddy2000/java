package com.java.access.modifiers.packagea;

public class B {

	public static void main(String[] args) {
		A a = new A();

		/*
		 * In this B class we can only access company, name and salary variables of A
		 * Class. We cannot access age variable as it is private and only be accessible
		 * with in A class
		 */
		System.out.println(a.company);
		System.out.println(a.name);
		System.out.println(a.salary);

	}

}
