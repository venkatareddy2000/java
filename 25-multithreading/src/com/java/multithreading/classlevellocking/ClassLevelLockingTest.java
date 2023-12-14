package com.java.multithreading.classlevellocking;

public class ClassLevelLockingTest {

	public static void main(String[] args) {

		ClassLevelLockingExample t1 = new ClassLevelLockingExample("Challa");
		ClassLevelLockingExample t2 = new ClassLevelLockingExample("Venkata");

		t1.start();
		t2.start();
	}

}
