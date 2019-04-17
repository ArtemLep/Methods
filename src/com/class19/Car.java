package com.class19;

public class Car {
	public String make = "unknown";

	public String model = "unknown";

	public int numberOfDoors = 4;

	public int topSpeed = 90;

	public double price = 0.0;// 1

	public Car(String make, String model, int numbersOfDoors, int topSpeed, double price) {

		this.make = make;

		this.model = model;

		this.numberOfDoors = numberOfDoors;

		this.topSpeed = topSpeed;

		this.price = price;

	}

//2

	public Car(String make, String model, int topSpeed, double price) {

		this.make = make;

		this.model = model;

		this.topSpeed = topSpeed;

		this.price = price;

	}

	// 3

	public Car(int numbersOfDoors, int topSpeed, double price) {

		this.topSpeed = topSpeed;

		this.price = price;

	}

	// 4

	public Car(String make, String model, int numbersOfDoors) {

		this.make = make;

		this.model = model;

		this.numberOfDoors = numberOfDoors;

	}

}