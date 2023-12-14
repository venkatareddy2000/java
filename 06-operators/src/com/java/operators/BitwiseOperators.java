package com.java.operators;

public class BitwiseOperators {

	public static void main(String[] args) {

		int a = 5; // binary: 0101
		int b = 3; // binary: 0011

		// Bitwise AND
		int resultAnd = a & b;
		System.out.println("Bitwise AND: " + resultAnd); // Output: 1

		// Bitwise OR
		int resultOr = a | b;
		System.out.println("Bitwise OR: " + resultOr); // Output: 7

		// Bitwise XOR
		int resultXor = a ^ b;
		System.out.println("Bitwise XOR: " + resultXor); // Output: 6

		// Bitwise Complement
		int resultComplementA = ~a;
		System.out.println("Bitwise Complement of a: " + resultComplementA); // Output: -6

		// Left Shift
		int resultLeftShift = a << 2;
		System.out.println("Left Shift: " + resultLeftShift); // Output: 20

		// Right Shift with Sign Extension
		int resultRightShift = a >> 1;
		System.out.println("Right Shift: " + resultRightShift); // Output: 2

	}

}
