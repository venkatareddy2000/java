package com.venky.encapsulation.example;

public class Test {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setFirstName("Challa");
		customer.setLastName("Venkata Reddy");
		customer.setPhoneNo(630274442);

		System.out.println("First Name : " + customer.getFirstName());
		System.out.println("Last Name : " + customer.getLastName());
		System.out.println("Phone Number : " + customer.getPhoneNo());

	}

}
