package com.class2;

import java.util.Scanner;

public class CityAndTemperature {

	public static void main(String[] args) {
		// Ask user to enter city and temperature in Fahrenheit
		String cityName;
		int temp;
		
		Scanner myScanner=new Scanner(System.in);
		System.out.println(" Please enter your city ");
		
		cityName=myScanner.nextLine();
		
		System.out.println(" please enter temperature in Fahrenheit ");
		
		
		
		temp=myScanner.nextInt();
		// formula (f -32 ) * 5/9;
		
		int convertedTemp=(temp -32)*5/9;
		System.out.println("the tempereture in the city" +cityName + " is " + convertedTemp );
		}

}
