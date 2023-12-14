package com.java.access.modifiers.packagea;

public class A {
	private int age = 20;

	public String name = "Venkata Reddy";

	protected float salary = 1234.90090f;

	/*
	 * default access modifier will be applied as we are not using any access
	 * modifier keyword.
	 */
	String company = "DXC Technology";

	public static void main(String[] args) {

		A a = new A();

		/*
		 * age is a private variable and we are accessing in the same class and we
		 * cannot access it anywhere outside of that class.
		 */
		System.out.println(a.age);

		/*
		 * name is a public variable and it is accessible in all the other classes
		 */
		System.out.println(a.name);

		/*
		 * salary is a protected class and is accessible in the classes available with
		 * in the same package and as well as for the sub or child classes
		 */
		System.out.println(a.salary);

		/*
		 * Default access modifier is accessible through the classes available with in
		 * the same package
		 */
		System.out.println(a.company);

	}

}