package com.java.flowcontrol.assignment;

public class IfElseIfElseAssignment {

	public static void main(String[] args) {
		int maths = 50;
		int chemistry = 100;
		int physics = 90;
		int result = maths + chemistry + physics;
		float average = result / 3;
		if (maths < 35 || chemistry < 35 || physics < 35) {
			System.out.println("Failed");
		} else if (average <= 59) {
			System.out.println("C Grade");
		} else if (average <= 69) {
			System.out.println("B grade");
		} else {
			System.out.println("A Grade");
		}
	}

}
