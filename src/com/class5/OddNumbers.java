package com.class5;

public class OddNumbers {

	public static void main(String[] args) {
		// print only odd numbers from 1 to 20

		int a = 1;
		while (a <= 20) {
			// System.out.println("Im inside while loop");
			if (a % 2 != 0) {
				System.out.println(a);
			}
			a++;
		}

		// print only even numbers from 10 to 100
		int b = 10;
		while (b <= 100) {

			if (b % 2 == 0) {
				System.out.println(b);
			}
			b++;
		}
	}

}
