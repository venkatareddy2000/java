package com.java.inheritance.multilevel.animal;

public class Cat extends Mammal {
	/*
	 * Here Cat is the Sub Class and Mammal is the Parent class and this Mammal
	 * class is also a sub class of Animal class
	 */
	/*
	 * So here the Multilevel inheritance come into picture as the cat class is
	 * inheriting the makeSound method with the help of multilevel inheritance.
	 */
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.makeSound();
		cat.moves();
	}

}
