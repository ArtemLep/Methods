package com.class4;

import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) {
		Scanner scan;
		String season;
		int monthNumber;
		
		 scan=new Scanner(System.in);
		 System.out.println("Please enter your birthday month number");
		monthNumber=scan.nextInt();
		
		if (monthNumber==12||monthNumber==1||monthNumber==2) {
			season="Winter";
			
			
		}else if (monthNumber==3||monthNumber==4||monthNumber==5){
			season="Spring";
			
		}else if (monthNumber==6||monthNumber==7||monthNumber==8) {
			season="Summer";
		
		}else if (monthNumber==9||monthNumber==10||monthNumber==11) {
			season="Fall";
			
		}else {
			season="Unknown";
			System.out.println("Please enter valid month number");
		}
		System.out.println( "You were born in " +season);	
	}

	


	


}
