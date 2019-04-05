package com.class13;

public class Phone {

	String os, brand;

	boolean sensorScreen, camera;

	int screen, cameras;

	public static void main(String[] args) {

		Phone cell = new Phone();

		cell.os = "IOS";
		cell.brand = "Iphone";
		cell.sensorScreen = true;
		cell.camera = true;
		cell.screen = 1;
		cell.cameras = 2;
		cell.play();
		cell.chating();

		Phone cell2 = new Phone();

		cell2.os = "Android";
		cell2.brand = "Samsung";
		cell2.sensorScreen = true;
		cell2.camera = true;
		cell2.screen = 2;
		cell2.cameras = 2;

		Phone cell3 = new Phone();

		cell3.os = "Windows";
		cell3.brand = "Nokia";
		cell3.sensorScreen = false;
		cell3.camera = true;
		cell3.screen = 1;
		cell3.cameras = 2;

	}

	void play() {
		System.out.println("You can play in games om your " + brand);

	}

	void chating() {
		System.out.println("You can chat on your " + os);
	}
}
