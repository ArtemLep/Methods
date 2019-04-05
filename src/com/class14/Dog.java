package com.class14;


public class Dog {
	String breed, name, color;

	public static void main(String[] args) {

		Dog Dog = new Dog ();
		Dog.breed = "Husky";
		Dog.name = "Tomas";
		Dog.color = "Grey";
		Dog.bark();
		Dog.run();
		Dog.play();

		Dog Dog1 = new Dog();
		Dog1.breed = "Buldog";
		Dog1.name = "Archibald";
		Dog1.color = "Pale";
		Dog1.bark();
		Dog1.run();
		Dog1.play();
		
		Dog Dog2 = new Dog();
		Dog2.breed = "Labrador";
		Dog2.name = "Sesk";
		Dog2.color = "Yellow";
		Dog2.bark();
		Dog2.run();
		Dog2.play();

	}

	void bark() {
		System.out.println(breed + " can bark");
	}

	void run() {
		System.out.println(breed + " can run");
	}

	void play() {
		System.out.println(breed + " can play");
	}
}
