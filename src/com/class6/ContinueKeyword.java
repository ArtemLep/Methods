package com.class6;

public class ContinueKeyword {

	public static void main(String[] args) {

		for (int i = 0; i <= 10; i++) {
			if (i == 2 || i == 3) {
				continue;

			}

			System.out.println(i);

		}

		System.out.println("hello");

		// want to print numbers from 1-20 skip those that divisible by 3

		for (int a = 0; a <= 20; a++) {
			if (a % 3 == 0) {
				continue;

			}
			System.out.println(a);
		}
	}

}
