package com.java.inheritance.hierarchical;

public class Test {

	public static void main(String[] args) {
		Bus bus = new Bus();
		System.out.println("Bus is using : " + bus.fuel());

		Car car = new Car();
		System.out.println("Car is using  : " + car.fuel());

		Bike bike = new Bike();
		System.out.println("Bike is using : " + bike.fuel());
	}

}
