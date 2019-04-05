package com.class9;

public class Task2 {

	public static void main(String[] args) {

		String[] countries = { "Ukraine", "Russia", "USA" };

		for (int a = 0; a < countries.length; a++) {
			if (countries[a] == "Ukraine") {
				System.out.println("The capital is Kiev");
			}
			if (countries[a] == "Russia") {
				System.out.println("The capital is Moscow");
			}
			if (countries[a] == "USA") {
				System.out.println("The capital is Washington");
			}
		}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		for (String country : countries) {
			if (country == "Ukraine") {
				System.out.println("The capital is Kiev");
			} else if (country == "Russia") {
				System.out.println("The capital is Moscow");

			} else if (country == "USA") {
				System.out.println("The capital is Washington");

			}
		}

	}

}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////


