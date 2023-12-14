package com.java.flowcontrol.transferstatement;

public class SwitchFallThrough {

	public static void main(String[] args) {

		/*
		 * If we want to use same logic for different expression, we can use this switch
		 * fall through.
		 */
		int day = 1;

		/* Here Sunday will be printed for day = 1, day = 2 day = 5 */
		switch (day) {
		case 1:
		case 2:
		case 5:
			System.out.println("Sunday");
			break;
		}

	}

}
