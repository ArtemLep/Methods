package com.class11;

public class GroupTask1 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		System.out.println("-----------------------------1---------------------------------------");

		int a = 5;

		int b = 10;
		System.out.println("B=" + b / 2 + " and A=" + a * 2);

		String q = "New York";

		String w = "Brooklyn";

		q = q + w;

		w = q.replaceAll(q, "");

		q = q.replaceAll(q, "");

		System.out.println(q);

		System.out.println(w);

		System.out.println("-----------------------------2---------------------------------------");

		// Write a java program to find the second largest number in the array? Maximum
		// and minimum number in the array?

		int[] n = { 5, 2, 3, 7 };
		
		int max = n[0];

		int min = n[0];

		int sclg = 0;
		
		for (int num1 : n) {

			if (num1 > max) {

				max = num1;

			}

			if (num1 < min) {

				min = num1;

			}
		}

		System.out.println("The Largest number is " + max);

		System.out.println("The Smalest number is " + min);

		for (int num1 : n) {

			if (num1 > sclg && num1 < max) {

				sclg = num1;

			}

		}

		System.out.println("Second large number is " + sclg);

		System.out.println("-----------------------------3---------------------------------------");

		// Find out how many alpha characters present in a string?

		String A = "Debugers12$%are34th6eBest!";

		String B = A.replaceAll("[^A-Za-z]", "");
		System.out.println("There are " + B.length() + " alpha characters in a string");

		System.out.println(
				"-------------------------------------------4---------------------------------------------------------------");

		// 4.How to find out the part of the string from a string? What is substring?
		// Find number of words in string?

		String s = "Debugers are the best";

		String[] str = s.split(" ");

		System.out.println("There are " + str.length + " words in string");
		System.out.println(

				"---------------------------------------------------------5--------------------------------------------------------------");

		// 5. Write a java program to reverse String? Reverse a string word by word?

		String original = "Debugers are the best";

		String reverse = "";
		char[] array = original.toCharArray();

		for (int i = array.length - 1; i >= 0; i--) {

			reverse = reverse + array[i];

		}

		System.out.println("Reversed String is: " + reverse);
	}
}