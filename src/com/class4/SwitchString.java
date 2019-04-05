package com.class4;

import java.util.Scanner;

public class SwitchString {

	public static void main(String[] args) {
		Scanner scan;
		String FavoriteCar;
		String carOrigin;

		scan = new Scanner(System.in);
		System.out.println("Please enter your favorite car make");
		FavoriteCar = scan.nextLine();

		switch (FavoriteCar) {

		case "BMW":
			carOrigin = "german car";
			break;
		case "Toyota":
			carOrigin = "japanese car";
			break;
		case "Maserati":
			carOrigin = "italian car";
			break;

		default:
			carOrigin = "unknown";

		}

		System.out.println("Your favorite car  " + FavoriteCar);

	}

}
