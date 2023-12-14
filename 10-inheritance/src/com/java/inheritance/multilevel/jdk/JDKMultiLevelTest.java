package com.java.inheritance.multilevel.jdk;

public class JDKMultiLevelTest {

	public static void main(String[] args) {
		@SuppressWarnings("unused")

		/*
		 * In multilevel inheritance the compiler will start instantiating from the
		 * parent class, so it printed JDK6, JDK7 and JDK8.
		 */
		JDK8 jdk8 = new JDK8();

	}

}
