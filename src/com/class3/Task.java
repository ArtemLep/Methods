package com.class3;
import java. util.Scanner;
public class Task {

	public static void main(String[] args) {
		/*
		 * Prompt the user to enter two people's heights in inches. Each person should
		 * be classified as one of the following:
		 * 
		 * • short (under 5 feet)
		 * 
		 * • medium(5 to 6 feet)
		 * 
		 * • tall (6 feet and over)
		 
		int height;
		Scanner userInput = new Scanner(System.in);
		System.out.println("The height of person:");
		height=userInput.nextInt();
		
		if (height<=5) {
			System.out.println("The person is short");
		}else if (height>5 && height<6) {
			System.out.println("The person is medium");
		}else if(height>6){
			System.out.println("the person is tall");
		}*/
		
		//TASK 2
		int quiz , midterm, finalScores;
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter your quiz,midterm and final scores ");
		quiz=userInput.nextInt();
		
		midterm=userInput.nextInt();
		
		
		finalScores=userInput.nextInt();
		
		
	    double avgScore=(quiz+midterm+finalScores)/3;
	    if (avgScore>=90) {
	    	System.out.println("Grade A");
	    }else if (avgScore>=70 && avgScore<90) {
	    	System.out.println("Grade B");
	    }else if (avgScore>=50 && avgScore <70) {
	    	System.out.println("Grade C");
	    }else if (avgScore< 50) {
	    	System.out.println("Grade F");
	    }
		 
		

	}

}
