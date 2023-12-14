package com.java.polymorphism.compiletime;

public class MethodOverloading {

	/*
	 * Compile-time (Static) Polymorphism:
	 * 
	 * Method Overloading: This occurs when a class has multiple methods with the
	 * same name but different parameter lists. The compiler determines which method
	 * to call based on the number or types of arguments provided during the method
	 */

	void add(int a, int b) {
		int result = a + b;
		System.out.println("Result is : " + result);
	}

	void add(int a, int b, int c) {
		int result = a + b + c;
		System.out.println("Result is : " + result);
	}

	void add(float a, float b, float c) {
		float result = a + b + c;
		System.out.println("Result is : " + result);
	}

	public static void main(String[] args) {

		/*
		 * In this example I have created three methods with same method name but
		 * difference in the method signature that one method has two parameters, second
		 * one has three parameters, third one has three parameters but difference in
		 * the data type of the parameter. When we create a object and call the method
		 * the compiler will assign that method call based on the parameters passing and
		 * this is called Compile time polymorphism.
		 */
		MethodOverloading methodOverloading = new MethodOverloading();
		methodOverloading.add(10, 20);
		methodOverloading.add(10, 200, 300);
		methodOverloading.add(10f, 20f, 30f);

	}

}
