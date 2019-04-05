package com.class4;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner scan;
		String Grade;
		String Student;

		scan=new Scanner(System.in);
		System.out.println("Please enter your Grade");
		Grade=scan.nextLine();
		
switch(Grade) {
		
		case "A":
			Student="Excellent";
			break;
		case "B":
			Student="Good";
			break;
		case"C":
			Student="Average";
			break;
		case"D":
			Student="Bad";
			break;
		default:
			Student="Not Acceptable";
 		
		

	}
System.out.println("Your Grade " + Grade + " is student " + Student);
	}
}
	
