package com.java.inheritance.assignment;

public class Employee {
	public int id;
	public String name;
	public String company;
	public double salary;

	public Employee(int id, String name, String company, double salary) {
		this.id = id;
		this.name = name;
		this.company = company;
		this.salary = salary;
	}

	public void work() {
		System.out.println("Common for everyone!");
	}

}
