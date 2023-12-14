package com.java.interfaces;

public class Car implements Honda {

	/* To inherit an interface we need to use the implements keyword */

	@Override
	public void go() {
		System.out.println("From the go method");
	}

	@Override
	public void run() {
		System.out.println("From the run method");
	}

}
