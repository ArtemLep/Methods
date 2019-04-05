package com.class6;

public class Sum {

	public static void main(String[] args) {
		
		int sum = 0;
		for (int i = 1; i <= 5; i++) {
			sum = sum + i;
		}
		System.out.println(sum);

		// find sum of all even numbers from 1-100
		int sum1 = 0;
		for (int a = 1; a <= 100; a += 2) {
			sum1 = sum1 + a;
			System.out.println(sum1);
		}
		
		
	}

}
