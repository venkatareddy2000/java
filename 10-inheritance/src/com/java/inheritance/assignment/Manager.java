package com.java.inheritance.assignment;

public class Manager extends Employee {
	public String workStatus;

	public Manager(int id, String name, String company, double salary, String workStatus) {
		super(id, name, company, salary);
		this.workStatus = workStatus;

	}

	@Override
	public void work() {
		super.work();
		System.out.println("I am working in three projects");
	}

}
