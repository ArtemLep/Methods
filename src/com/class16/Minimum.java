package com.class16;

public class Minimum {
	/*
	 * Create a class Called Minimumwith in it crate a method called minOfValuesmake
	 * it staticFrom your previous Applicaions class call the method and pass an
	 * array argument and print out the result
	 */
	static int minOfValues(int[] x) {

		int min = Integer.MAX_VALUE;
		for (int y : x) {
			if (y < min) {
				min = y;
			}
		}
		return min;

	}

	static int maxOfValues(int[] x) {

		int max = Integer.MIN_VALUE;
		for (int y : x) {
			if (y > max) {
				max = y;
			}
		}
		return max;

	}
}
