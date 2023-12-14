package com.java.typecasting;

public class ImplicitTypeCasting {

	public static void main(String[] args) {

		/*
		 * Implicit type casting: This type casting will be done by the JVM
		 * automatically and in this data type we can convert only from lower data types
		 * to higher data types, there will be a loss of data if we convert from higher
		 * data type conversion to lower data type conversion. So the JVM won't convert
		 * from higher data type to lower data type.
		 */

		/*
		 * In the below we had assigned the byte variable to int variable and it's not
		 * throwing any error as the JVM type cast automatically
		 */
		byte a = 120;
		int b = a;
		System.out.println("The value of b is : " + b);

		/*
		 * We are assigning a int variable to a byte variable which is not possible in
		 * implicit type casting and the compiler is throwing error, so commenting it
		 * out.
		 */
		// byte c = b;

	}

}
