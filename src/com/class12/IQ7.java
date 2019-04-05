package com.class12;

import java.util.Scanner;

public class IQ7 {

	public static void main(String[] args) {
		// Write a java program to check whether a given number is prime or not?
		int count = 0;

		Scanner in = new Scanner(System.in);

		System.out.println("Enter number to check if it's prime?");

		int n = in.nextInt();

		for (int i = 2; i < n; i++) {

			if (n % i == 0) {

				count++;

			}

		}

		if (count == 0) {

			System.out.println("Number is prime.");

		} else {

			System.out.println("Number is not prime.");

		}
////////////////////////////////////////////////////////////////////////////////////////////////////////////

		int number = 3337;

		boolean prime = false;

		if (number == 1 || number == 2 || number == 3) {

			prime = true;

		} else {

			for (int i = 2; i <= number / 2; i++) {

				if (number % i != 0) {

					prime = true;

				} else {

					prime = false;

					break;

				}

			}

		}

		System.out.println("Number " + number + " is prime: " + prime);

	}

}
