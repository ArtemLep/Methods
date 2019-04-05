package com.class4;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner scan;
		String country;
		String language;
		scan=new Scanner(System.in);
		System.out.println("Please enter wich country you are from");
		country=scan.nextLine();
 		
        switch(country) {
		
		case "USA":
			language="English";
			break;
		case "Afganistan":
			language="pushtu";
			break;
		case"Russia":
			language="Russian";
			break;
		case"Italy":
			language="Italic";
			break;
		case"Turkey":
			language="turkish";
			break;
		case"Kazakhstan":
			language="Kazahskiy";
			break;
	
		default:
			language="Unknown";
			
		}
		System.out.println("Your language is " +language);
	

	}



}


