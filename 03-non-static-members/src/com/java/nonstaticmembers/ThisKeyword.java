package com.java.nonstaticmembers;

public class ThisKeyword {
	/*
	 * In Java, the this keyword is a reference variable that is used to refer to
	 * the current object. It can be used inside any method, constructor, or block
	 * of code within a class.
	 */
	
	int x;

	ThisKeyword() {

		/* Prints the memory address */
		System.out.println(this);

		/* Prints the value of X */
		System.out.println(this.x);
	}

	public static void main(String[] args) {
		new ThisKeyword();
		new ThisKeyword();
	}

}
