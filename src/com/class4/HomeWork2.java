package com.class4;

import java.util.Scanner;

/*
 * Prompt user to input two strings : "Please enter two strings"
and two integers: "Please enter two numbers"  
and make the comparisons:

    if int1 and int2 are equal and word1 and word2 are equal, output "AND"
    if int1 and int2 are equal or word1 and word2 are equal, output "OR"
    if int1 and int2 are not equal and word1 and word2 are not equal, output "NONE"
 */
public class HomeWork2 {
	public static void main(String[] args) {
		String output = "";
		String a, b;
		int num1, num2;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter two strings");

		a = scan.nextLine();
		b = scan.nextLine();

		System.out.println("Please enter two numbers");
		num1 = scan.nextInt();
		num2 = scan.nextInt();

		if (a.equals(b) && num1==num2) {
			output = "AND";
			System.out.println("AND");
		} else if (a.equals(b) || num1 == num2) {
			output = "OR";
			System.out.println("OR");
		} else if (!a.equals(b) && num1 != num2) {
			output = "NONE";
			System.out.println("NONE");
		} else {
			output = "Unknown";
			System.out.println("Unknown");
		}

	}

}
