package com.java.operators;

public class RelationalOperators {

	public static void main(String[] args) {
		
		/*
		 * Relational Operators are used to compare two different expressions and the
		 * result will be a boolean. The relational operators are < ,>, <=, >=, ==, !=.
		 */
		int a = 10;
		int b = 20;
		/* Greater than(>) */
		System.out.println(a > b);// output false.
		/* less than(<) */
		System.out.println(a < b);// output true.
		/* Greater than equals to(>=) */
		System.out.println(a >= b);// output false.
		/* less than equals to(<=) */
		System.out.println(a <= b);// output true.
		/* equals to(==) */
		System.out.println(a == b);// output false.
		/* not equals to(!=) */
		System.out.println(a != b);// output true.

		/* Note : We cannot apply the relational operators on boolean data type */
	}

}
