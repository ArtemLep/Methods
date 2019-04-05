package com.class12;

public class IQ5 {

	public static void main(String[] args) {
		// Write a java program to reverse String?
		// Reverse a string word by word?

		String original = "Debugers are the best";

		String reverse = "";
		char[] array = original.toCharArray();

		for (int i = array.length - 1; i >= 0; i--) {

			reverse = reverse + array[i];

		}

		System.out.println("Reversed String is: " + reverse);
	}

}
