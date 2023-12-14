package com.java.multithreading.threadgrouping;

public class ThreadGroupExample1 {

	public static void main(String[] args) {

		/* printing the name of the current running thread */
		System.out.println(Thread.currentThread().getThreadGroup().getName());

		/* printing the parent of the current running thread */
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());

		/* Creating a new thread group */
		ThreadGroup parent = new ThreadGroup("parent");

		/* Adding a child thread group to the parent */
		ThreadGroup child = new ThreadGroup(parent, "child");

		/* printing the name of the child thread group */
		System.out.println(child.getName());

		/* printing the parent of the parent thread group */
		System.out.println(child.getParent().getName());
	}
}
