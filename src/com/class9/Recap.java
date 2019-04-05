package com.class9;

public class Recap {

	public static void main(String[] args) {
		// lets create an array of names that will hold 5 elemnts and retrieve all
		// values from it

		String[] names = new String[7];

		names[0] = "Asel";
		names[1] = "Awet";
		names[2] = "Arif";
		names[3] = "Wegas";
		names[4] = "Dzmitri";
		names[5] = "Shiva";
		names[6] = "Dzmitriy";

		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}

		// create an array using array literal

		String[] studentNames = { "Shaban", "Bilal", "Mehmet", "Zaki", "Samir", "Frank" };

		System.out.println("---------For loop--------");

		for (int i = 0; i <= studentNames.length - 1; i++) {

			System.out.println(studentNames[i]);

		}

		// retrieve values using: advanced for loop, for each loop, enhanced for loop

		System.out.println("---------Advanced for loop--------");

		for (String student : studentNames) {

			System.out.println(student);

		}

	}

}
