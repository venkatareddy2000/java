package com.java.flowcontrol.transferstatement;

public class SwitchStatement {

	public static void main(String[] args) {
		
		/*
		 * Switch-Statement : Switch statement is used to execute one single statement
		 * from multiple statements with the help of the switch expression.
		 */
		int day = 5;
		switch (day) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Satday");
			break;
		}
		
		/*
		 * We use break to exit out of the loop, if we don't use the break then it will
		 * print every statement after the condition is executed. We can use the default
		 * keyword, if any of the case is not executed then the default case will be
		 * executed
		 */
		
		/*
		 * In the below code we have not used break so it will print Day 6, Day 0
		 * as the output
		 */
		String days = "Friday";
		switch (days) {
		case "Thursday":
			System.out.println("Day 5");
		case "Friday":
			System.out.println("Day 6");
		default:
			System.out.println("Day 0");
		}
		
	}

}
