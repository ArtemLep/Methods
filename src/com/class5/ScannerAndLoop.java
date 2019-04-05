package com.class5;

import java.util.Scanner;

public class ScannerAndLoop {

	public static void main(String[] args) {
		Scanner scan;
		String name;
		scan = new Scanner(System.in);
		int a = 1;

		while (a <= 3) {
			System.out.println("Hello Syntax Solutions how are you");
			name = scan.nextLine();

			System.out.println("You are doing great " + name);

			a++;

		}

	}

}
