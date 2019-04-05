package com.class4;

import java.util.Scanner;

public class HomeWork4 {
	/*
	 * Take 2 boolean inputs from a user:
	 * 
	 * "Are you thirsty?" "Are you sleepy?"
	 * 
	 * If user is thirsty and not sleepy--> drink=Water If user is thirsty and
	 * sleepy--> drink=Coffee If user is not thirsty and sleepy --> drink=Tea
	 * Otherwise drink="Nothing"
	 * 
	 * The output should be: "Looks like you need ___ "
	 */

	public static void main(String[] args) {

		String drink = "";
		Boolean a;
		Boolean b;

		Scanner scan = new Scanner(System.in);
		System.out.println("Are you thirsty?");

		a = scan.nextBoolean();

		System.out.println("Are you sleepy?");
		b = scan.nextBoolean();

		if (a && !b) {
			drink = "Water";

		} else if (a && b) {
			drink = "Coffee";

		} else if (!a && b) {
			drink = "Tea";

		} else {
			drink = "Unknown";

		}
		System.out.println("Looks like you need drink " + drink);
	}

}
