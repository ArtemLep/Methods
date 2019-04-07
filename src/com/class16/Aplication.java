package com.class16;

public class Aplication {

	public static void main(String[] args) {

		Animal anim = new Animal();

		System.out.println("This is anim");

		System.out.println(anim.age);

		System.out.println(anim.weight);

		System.out.println(anim.breed);

		System.out.println(anim.name);

		anim.name = "Joe";

		anim.age = 40;

		System.out.println(anim.age);
		
		System.out.println(anim.canBark());


		Animal anim2 = new Animal();

		System.out.println("This is anim2");

		System.out.println(anim2.age);

		System.out.println(anim2.weight);

		System.out.println(anim2.breed);

		System.out.println(anim2.name);
		

		   Animal anim3 = new Animal();

	        System.out.println("This is anim3" );

	        System.out.println(anim3.age);

	        System.out.println(anim3.weight);

	        System.out.println(anim3.breed);

	        System.out.println(anim3.name);


	        int my_array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	        int[] array = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
	        System.out.println("Printing the maximum value " +Minimum.minOfValues(my_array));
	        System.out.println("Printing the minimum value " +Minimum.maxOfValues(array));
	      System.out.println(Minimum.minOfValues(my_array));
	      System.out.println(Minimum.maxOfValues(array));
	}
}