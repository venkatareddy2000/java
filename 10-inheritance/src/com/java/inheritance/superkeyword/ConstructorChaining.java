package com.java.inheritance.superkeyword;

class Vehicle {
	int speed;

	Vehicle(int speed) {
		this.speed = speed;
		System.out.println("Vehicle constructor called. Speed: " + speed);
	}
}

class Car extends Vehicle {
	int numWheels;

	Car(int speed, int numWheels) {
		super(speed); // Call the superclass constructor
		this.numWheels = numWheels;
		System.out.println("Car constructor called. Wheels: " + numWheels);
	}

	Car(int speed) {
		this(speed, 4); // Call another constructor in the same class
	}
}

public class ConstructorChaining {
	public static void main(String[] args) {
		Car car1 = new Car(60, 4);
		System.out.println("Car speed: " + car1.speed);
		System.out.println("Number of wheels: " + car1.numWheels);

		System.out.println();

		Car car2 = new Car(80);
		System.out.println("Car speed: " + car2.speed);
		System.out.println("Number of wheels: " + car2.numWheels);
	}
}
