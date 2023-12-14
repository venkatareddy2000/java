package com.java.inheritance.assignment;

public class Test {

	public static void main(String[] args) {
		Manager manager = new Manager(123, "Venkata Reddy", "DXC Technology", 400000.000d, "Completed");
		System.out.println(manager.id);
		System.out.println(manager.name);
		System.out.println(manager.company);
		System.out.println(manager.salary);
		System.out.println(manager.workStatus);
		manager.work();
	}

}
