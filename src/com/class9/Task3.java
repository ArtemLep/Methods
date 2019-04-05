package com.class9;

public class Task3 {

	public static void main(String[] args) {
		int sum = 0;
		int[] numbers = { 10, 11, 12, 13, 14, 15, 16 };

		for (int a = 0; a <numbers.length; a++) {
			sum = sum + numbers[a];

		}
		System.out.println(sum);
	}

}
