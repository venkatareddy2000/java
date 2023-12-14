package com.java.datatypes;

public class DataTypes {

	/*
	 * Data type tells us what kind of value we are going to store in a variable.
	 * 
	 * Variable is the container which stores values.
	 * 
	 * There are two different data types: 1.primitive data type - byte, int, short,
	 * long, char, float, double, boolean are the primitive data types
	 * 2.Non-primitive data type - string, array, etc are non-primitive data types.
	 */

	public static void main(String[] args) {
		/* 1 byte = 8bits */
		/*
		 * Byte : size of byte data type is 1byte and store values in range from -128 to
		 * +127
		 */
		byte a = -128;

		/*
		 * Short : size of short data type is 2bytes and store values in range from
		 * -32,768 to +32,767
		 */
		short b = 10000;

		/*
		 * Int : size of int data type is 4bytes and store values in range from
		 * -2,147,483,648 to +2,147,483,647
		 */
		int c = 2000000;

		/*
		 * Long : size of long is 8bytes and store values in range from
		 * -9,223,372,036,854,775,808 to +9,223,372,036,854,775,807
		 */
		long d = 500000000;

		/*
		 * Float : size of float data type is 4bytes and store 7 digits after decimal
		 * point and to differentiate between float and double we need to use f at the
		 * end of float value and d at the end of double value
		 */
		float e = 150.9898844f;

		/*
		 * Double : size of double is 8bytes and store up to 15 digits after decimal
		 * point
		 */
		double f = 120.989898989898989d;

		/*
		 * Char : size of char is 2bytes and used to store a single character inside a
		 * single quotes
		 */
		char g = 'A';

		/* Boolean : Boolean holds true or false values */
		boolean h = true;

		/*
		 * Note : If we try to add two byte data type values the JVM will expect the
		 * result to be stored in int data type and to overcome this issue we need to
		 * convert the type.
		 */

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
	}

}
