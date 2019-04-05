package com.class12;

import java.util.Scanner;

public class IQ6 {

	public static void main(String[] args) {
		// Write a Java Program to find whether a String is palindrome or not?

		Scanner scan = new Scanner(System.in);

		System.out.println("Check if it palindrome!");
		String word = scan.nextLine();

		String reverse = "";

		for (int i = word.length() - 1; i >= 0; i--) {
			reverse += word.charAt(i);

		}

		if (word.equalsIgnoreCase(reverse)) {
			System.out.println("The word is a palidrome ");
		} else {
			System.out.println("The word is not a palidrome ");
		}
	}

}
