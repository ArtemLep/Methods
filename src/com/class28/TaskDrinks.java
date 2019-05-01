package com.class28;

import java.util.ArrayList;

public class TaskDrinks {

	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<String>();

		words.add("Sambuca");

		words.add("Long Island Ice Tea");

		words.add("Negroni");

		words.add("Manhatten");

		for (int i = 0; i < words.size(); i++) {

			String coctails = words.get(i);
			if (coctails.contains("a") || coctails.contains("e")) {
				words.set(i, "water");
			}
		}
		System.out.println(words);
	}

}
