package com.class4;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		
		Double num1,num2,result;
		char operation;
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println("Please enter two numbers");
		num1=scan.nextDouble();
		num2=scan.nextDouble();
		System.out.println("Make a math operations with (+,-,*,/)");
		
		operation=scan.next().charAt(0);
		
		switch(operation) {
		case '+' :
			result=num1+num2;
			break;
		case '-' :
			result=num1-num2;
			break;
		case '*' :
			result=num1*num2;
			break;
		case '/' :
			result=num1/num2;
			break;
		default:
			System.out.println("Unknown");
			result=(double) 0;
		
		
		
		}
		System.out.println("The result is " +result);
		
		
	}

}
