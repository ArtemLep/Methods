package com.class2;

public class NestedIfAgain {

	public static void main(String[] args) {
	/*
	 * declare var for gpa and having a diploma
	 *if user has a diploma--> congats--> if gpa is higher 3.5-->hire person
	 */
	 double gpa=3.5;
	 double expectedGpa=3.6;
	 
	 boolean hasDiploma=true;
	 if(hasDiploma) {
		 System.out.println("Congrats");
		 if(gpa>expectedGpa) {
			 System.out.println("You are hired");
		 }else {
			 System.out.println("Sorry, we gonna look someone else");
		 }
	 }else {
		 System.out.println("Please get your degree");
		 
	 }

	}

}
