package com.class4;

import java.util.Scanner;

public class Task1 {

	/*
	 * Write a program that prints out if it is good weather to go for any activity
	 * or not
	 * 
	 * If the temperature is between 40 degrees and 80 degrees inclusive & no
	 * rain--> we will go for hiking
	 * 
	 * otherwise--> we will not go hiking
	 * 
	 * If temperature is between 25 and 40 inclusive & snowing -->going snowboarding
	 * otherwise
	 * 
	 * we are not going snowboarding
	 * 
	 * it if temperature is more than 80 & sunny--> go to the beach
	 * 
	 * otherwise --> not go to the beach
	 */

	public static void main(String[] args) {
		Boolean snow, rain, sunny;
		int temp;
		String activity;

		Scanner scan = new Scanner(System.in);
		System.out.println("please enter a temperature");
		temp = scan.nextInt();
		

		if (temp > 40 && temp <80) {
			System.out.println("Its raining!");
			rain = scan.nextBoolean();
			if (rain) {
				activity="Watch movies!";
				
			} else {
				activity="Go Hicking!";
			}
		} else if (temp >= 25 && temp < 40) {
			System.out.println("Its snowing!");
			snow = scan.nextBoolean();
			if (snow) {
				activity="Go snowboarding!";
				
			} else {
				activity="Do coding";
			}

		} else if (temp > 80) {
			sunny = scan.nextBoolean();
			if (sunny) {
				activity="Go to the beach!";
				
			} else {
				activity="more coding";
			}
		} else {
			System.out.println("Please,enter different Temperature!");
			activity="uknown";
		}
		System.out.println("My activity for today is " + activity);

	}

}
