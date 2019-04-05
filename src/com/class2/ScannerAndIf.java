package com.class2;

import java.util.Scanner;

public class ScannerAndIf {

	public static void main(String[] args) {
/*
		Scanner user = new Scanner(System.in);
		System.out.println("Enter your name:");
		
		String Firstname = user.nextLine();
		System.out.println("Enter your mobile number");
		
		String Number = user.nextLine();
		System.out.println("Enter your age");
		
		int Age =user.nextInt();
		System.out
				.println("Your name is " + Firstname + ", Your age is " + Age + " and your mobile number is " + Number);
*/
		boolean value;
		
		Scanner user = new Scanner(System.in);
		System.out.println(" Input the boolean value ");

		value = user.nextBoolean();
		System.out.println(" The value is " + value);
		
		
	}

}
