package com.java.strings.immutable;

public class Immutablity {

	public static void main(String[] args) {
		
		/*
		 * In this example we are going to see that string's are immutable and for that
		 * we have created two strings firstName and lastName
		 */
		String firstName = "Challa";
		String lastName = "Venkata Reddy";
		System.out.println("Before concatination : \nFirstName: " + firstName + "\nLastName : " + lastName);
		firstName = firstName.concat(lastName);
		
		/*
		 * In the above line we are adding the lastName to the firstName and assigning
		 * it to the firstName. The output for the firstName will be ChallaVenkata Reddy
		 * and the "Challa" will be present in the memory location without any object
		 * reference and it will be garbage collected by the JVM.
		 */
		System.out.println("After concatination : \nFirstName: " + firstName + "\nLastName : " + lastName);
	}

}
