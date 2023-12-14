package com.java.annotations.custom;

import java.lang.reflect.Method;

public class Test {

	/* I am using the custom annotation below */
	@CustomAnnotation(name = "Challa", employeeId = 12345)
	public void doNothing() {
		System.out.println("Do Nothing");
	}

	public static void main(String[] args) {
		Test test = new Test();

		/* Retrieving the values of the annotation */
		try {
			Class<? extends Test> testClass = test.getClass();
			Method method = testClass.getMethod("doNothing");
			CustomAnnotation annotation = method.getAnnotation(CustomAnnotation.class);
			System.out.println("The value of the name in the custom annotation is : " + annotation.name());
			System.out.println("The value of the employeeId in the custom annotation is : " + annotation.employeeId());
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
