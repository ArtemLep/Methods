package com.class14;

public class Task3 {

	public static void main(String[] args) {

	}

	void palindrome(String str) {

		char[] array = str.toCharArray();

		String reverse = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			reverse = reverse + array[i];

		}

		if (reverse.equalsIgnoreCase(str)) {

			System.out.println(str + " String is polindromec ");

		} else {

			System.out.println(str + " String is not polindromic");

		}

	}

}