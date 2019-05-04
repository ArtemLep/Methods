package com.class30;

/*
 * Create a map of countries with its capital. 

Print all keys and values from a country map using for each loop and iterator.

Print all values from a country map using for each loop and iterator.
 */
import java.util.*;

public class Task3 {

	public static void main(String[] args) {

		Map<String, String> countries = new HashMap<>();

		countries.put("Canada", "Ottawa");

		countries.put("USA", "Washington");

		countries.put("Latvia", "Riga");

		countries.put("Estonia", "Tallin");

		countries.put("Russia", "Moscow");

		countries.put("France", "Paris");

		System.out.println("PRINTING ALL KEYS AND VALUES");

		System.out.println("Using for each loop------");

		Set<String> country = countries.keySet();

		for (String s : country) {

			System.out.println("Country " + s + " has capital city " + countries.get(s));

		}

		System.out.println("Using Iterator----");

		Iterator<String> itCountry = country.iterator();

		while (itCountry.hasNext()) {

			String c = itCountry.next();

			System.out.println("Country " + c + " has capital city " + countries.get(c));

		}

		System.out.println("PRINTING ONLY VALUES");

		Collection<String> capitals = countries.values();

		System.out.println("Using for each loop------");

		for (String s : country) {

			System.out.println("Capital city " + s);

		}

	}

}