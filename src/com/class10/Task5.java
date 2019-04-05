package com.class10;

public class Task5 {
	/*
	 * Create a String and if the String is not empty perform the following: if the
	 * String has an odd number of characters and has 3 or more characters, print
	 * the character in the middle of the String
	 */
	public static void main(String[] args) {
		String text = "SOsulka";

		if (!(text.isEmpty())) {

			if (text.length() % 2 != 0 && text.length() > 3) {

				System.out.println(text.charAt(text.length() / 2));

			}

		}

	}

}
