package com.class12;

public class IQ8 {

	public static void main(String[] args) {
		// Write a Java Program to print first 10 numbers of Fibonacci series.

		int[] fib = new int[10];

		fib[0] = 0;

		fib[1] = 1;

		for (int i = 2; i < fib.length; i++) {

			fib[i] = fib[i - 2] + fib[i - 1];

		}
		for (int y = 0; y < 10; y++) {

			System.out.print(fib[y] + ", ");

		}
//////////////////////////////////////////////////////////////////////////////////////////////////
		int a = 1;

		int b = 0;

		int c = 0;

		for (int i = 0; i < 10; i++) {

			c = a + b;

			a = b;

			b = c;

			System.out.print(a + " ");

		}

	}

}
