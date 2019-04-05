package com.class1;

public class MultipeConditions {

	public static void main(String[] args) {
		int month=3;
		
		if (month==1) {
			System.out.println("January");
		}else if (month==2) {
			System.out.println("February");
			
		}else if (month==3) {
			System.out.println("March");
		}else if (month==4) {
			System.out.println("April");
		}else if (month==5) {
			System.out.println("May");
		}else if (month==6) {
			System.out.println("June");
		}else if(month==7) {
			System.out.println("July");
		}else {
			System.out.println("What is the month of ur birthday? ");
	
		}
		
		int a=5;
		if (a%2== 0) {
			System.out.println("The number is even!");
		}else {
			System.out.println("This number is ODD!");
		}
	}

}
