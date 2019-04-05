package com.class10;

public class Task3 {
	///////////////////////////////////////////// Create a String and print it in
	///////////////////////////////////////////// reverse order (Sunday → yadnuS).
	public static void main(String[] args) {
		String rev = "Sunday";
		for (int i = rev.length() - 1; i >= 0; i--) {
			System.out.print(rev.charAt(i));
		}
	}
}