package com.class4;

import java.util.Scanner;
/*
 * Create main Method!!!!!!!! 
Scanner Class and Switch case is needed for this Assignment

Write a program using the switch statement  
Let us consider there are three students in the class with roll number  starting from (101 to 103) if any number other than 101-103 are present display
"Not found Student name: in Class"

First Output: "enter the roll number of the Child"

case 101: if roll number is 101 print as "Student name: Ramesh "

case 102 :if roll number is 102 print as "Student name: Mahesh "

case 103:if roll number is 103 print as "Student name: Mukesh "

other than this roll number  it should print "Not found Student name: in Class"


 */

public class HomeWork5 {

	public static void main(String[] args) {

		String StudentName;
		int number;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the roll number of the Child");
		number = scan.nextInt();

		switch (number) {

		case 101:
			StudentName = "Student name:Ramesh ";
			System.out.println("Student name:Ramesh");
			break;
		case 102:
			StudentName = "Student name:Makesh";
			System.out.println("Student name:Makesh");
			break;
		case 103:
			StudentName = "Student name:Mukesh";
			System.out.println("Student name:Mukesh");
			break;

		default:
			StudentName = "Not found Student name: in Class";
			System.out.println("Not found Student name: in Class");

		}

	}

}
