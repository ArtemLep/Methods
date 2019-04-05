package com.class13;

public class Main {

	String breed, name, color;

	public static void main(String[] args) {

		Main Dog = new Main ();
		Dog.breed = "Husky";
		Dog.name = "Tomas";
		Dog.color = "Grey";
		Dog.bark();
		Dog.run();
		Dog.play();

		Main Dog1 = new Main();
		Dog1.breed = "Buldog";
		Dog1.name = "Archibald";
		Dog1.color = "Pale";
		Dog1.bark();
		Dog1.run();
		Dog1.play();
		
		Main Dog2 = new Main();
		Dog2.breed = "Labrador";
		Dog2.name = "Sesk";
		Dog2.color = "Yellow";
		Dog2.bark();
		Dog2.run();
		Dog2.play();

	}

	void bark() {
		System.out.println(Dog.breed + " can bark");
	}

	void run() {
		System.out.println(Dog.breed + " can run");
	}

	void play() {
		System.out.println(Dog.breed + " can play");
	}
}