package com.class32;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter ur number");

		try {
			int num1 = scan.nextInt();
			System.out.println(num1);
		} catch (InputMismatchException e) {
			System.out.println("Wrong");
		}
	}
}
