package com.class7;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		/*
		 * Ask a user to input a leap year. Give the user 10 chances to enter a correct
		 * leap year. As soon as the user enters the correct leap year exit the loop.
		 */
		Scanner input = new Scanner(System.in);

		int year;

		for (int a = 1; a <=10; a++) {

			System.out.println("Please Enter Year");
			year = input.nextInt();
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {

				System.out.println("Is leap Year");
				break;
			} else {

				System.out.println("Is Not leap Year");
				{

				}

			}

		}

	}

}