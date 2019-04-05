package com.class5;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		/*Ask user to pay for a soda
		 * keep asking user to pay for soda until entered price is not equal to 1.99
		 * after user got a write amount print "Please enjoy your soda
		 */
		Scanner scan;
		double a;
		scan = new Scanner(System.in);
		do {
			System.out.println("Please pay for soda");
			a = scan.nextDouble();
		}while (a != 1.99);
		System.out.println("Please enjoy your soda!");
		

	
	}

}
