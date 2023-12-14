package com.java.polymorphism.autopromotion;

public class AutoPromotion {

	public void display(char i) {
		System.out.println("The Interger value is : " + i);
	}

	public void display(float i) {
		System.out.println("The Float value is : " + i);
	}

	public static void main(String[] args) {
		AutoPromotion promotion = new AutoPromotion();

		/*
		 * We are passing the integer but there is no method that takes integer as a
		 * parameter so it auto promotes to the next data type, the next data type
		 * present in the class is float.
		 */
		promotion.display(123);

		promotion.display(120.5f);

	}

}
