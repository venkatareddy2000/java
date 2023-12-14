package com.java.polymorphism.runtime.methodoverriding;

public class Dog extends Animal {

	@Override
	void sound() {
		System.out.println("Animal making sound from sub class");
	}

}
