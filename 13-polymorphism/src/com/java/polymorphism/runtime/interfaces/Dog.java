package com.java.polymorphism.runtime.interfaces;

public class Dog implements Animal {
	@Override
	public void sound() {
		System.out.println("Animal making sound from sub class");
	}

	public void eats() {
		System.out.println("Dog eats chicken");
	}

}
