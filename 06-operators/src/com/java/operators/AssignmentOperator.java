package com.java.operators;

public class AssignmentOperator {

	public static void main(String[] args) {
		int a = 20;

		int b, c, d;
		b = c = d = 200;

		int x = 5;
		int y = 3;

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		// Assignment operator (=)
		int result = x;
		System.out.println("Assignment Operator (=): " + result);

		// Addition Assignment operator (+=)
		result += y;
		System.out.println("Addition Assignment Operator (+=): " + result);

		// Subtraction Assignment operator (-=)
		result -= y;
		System.out.println("Subtraction Assignment Operator (-=): " + result);

		// Multiplication Assignment operator (*=)
		result *= y;
		System.out.println("Multiplication Assignment Operator (*=): " + result);

		// Division Assignment operator (/=)
		result /= y;
		System.out.println("Division Assignment Operator (/=): " + result);

		// Modulus Assignment operator (%=)
		result %= y;
		System.out.println("Modulus Assignment Operator (%=): " + result);
	}

}
