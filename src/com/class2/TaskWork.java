package com.class2;

import java.util.Scanner;

public class TaskWork {

	public static void main(String[] args) {
		
		/*  TASK   #1
		  Scanner input=new Scanner(System.in);
		System.out.println("Enter the loan amount:");
		int loan = input.nextInt();
		
		if(loan<200000) {
			System.out.println("I should refuse with the loan");
		}else {
			System.out.println("Congrats, You gonna get your Loan!");
		}   TASK   #2*/
		
		int age,age1;
		age1=10;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your age");
		age = input.nextInt();
		int mult = age+age1;
		System.out.println("Your age after 10 years " + mult);
		

	}

}
