package com.java.flowcontrol.transferstatement;

public class ContinueStatement {

	public static void main(String[] args) {

		/*
		 * Continue Keyword : Continue keyword is used when we want to skip a particular
		 * loop iteration.
		 */
		System.out.println("Using continue keyword to skip the value 4");
		for (int i = 3; i <= 5; i++) {
			if (i == 4)
				continue;
			System.out.println("The value of i is : " + i);
		}
	}

}
