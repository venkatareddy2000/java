package com.java.generics.demo;

public class RestrictedGenericsType<T extends Number> {

	T obj;

	RestrictedGenericsType(T obj) {
		this.obj = obj;
	}

	public void displayObjectDetails() {
		System.out.println("The object type is : " + obj.getClass().getName());
	}

	public T getObjects() {
		return obj;
	}

}
