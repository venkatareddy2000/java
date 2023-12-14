package com.java.inheritance.multilevel.animal;

public class Mammal extends Animal {
	
	/*
	 * We are inheriting the properties of Animal class this Animal class is the
	 * Parent class and Mammal Class is the child class
	 */
	public void moves() {
		System.out.println("Mammals moves");
	}

	public static void main(String[] args) {

		Mammal mammal = new Mammal();

		/* From parent class */
		mammal.makeSound();

		/* From child class */
		mammal.moves();

	}

}
