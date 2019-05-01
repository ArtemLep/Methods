package com.class28;

import java.util.ArrayList;
import java.util.Iterator;

public class Cars {
	public static void main(String[] args) {

		ArrayList<String> cars = new ArrayList<String>();

		cars.add("Toyota");

		cars.add("M&B");

		cars.add("BMW");

		cars.add("Honda");
		System.out.println("--- for loop ---");

		for (int i = 0; i < cars.size(); i++) {

			System.out.println(cars.get(i));
		}
		System.out.println("--- advance for loop ---");

		for (String models : cars) {

			System.out.println(models);
		}
		System.out.println("--- using iterator ---");
		Iterator<String> models = cars.iterator();
		while (models.hasNext()) {
			System.out.println(models.next());
		}
		System.out.println("--- using while loop ---");
		int i = 0;
		while (i < cars.size()) {
			System.out.println(cars.get(i));
			i++;
		}
	}
}
