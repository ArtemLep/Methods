package com.class14;

public class Numbers {

	// Create a method that will take a number and prints whether the number is even
	// or odd.

	public static void main(String[] args) {

		Numbers numbers = new Numbers();

		numbers.evenNumberOrOddN(101);

	}

	void evenNumberOrOddN(int num) {

		if (num % 2 == 0) {

			System.out.println("The number is Even");

		} else {

			System.out.println("The number is Odd");

		}

	}

}