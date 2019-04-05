package com.class11;

public class ReverseString {

	public static void main(String[] args) {
		// Reverse a String without using a reverse function
		//#1   Using toCharArray();
		String original="Today is Java Class";
		String reverse="";
		
		char[] array=original.toCharArray();
		
		for (int i=array.length-1; i>=0; i--) {
			reverse=reverse+array[i];
			
		}
		 System.out.println("Reversed String is: "+reverse);/////////Reversed String is: ssalC avaJ si yadoT

		/////////////-------------#2 charAt()-----------/////////////
		 
		 String reverse1="";
		 
		 for (int i=original.length()-1;i>=0;i--) {
			reverse1=reverse+ original.charAt(i);
			
		 }

		 System.out.println("Reversed String is: "+reverse1);/////////Reversed String is: ssalC avaJ si yadoT
		 
		 /////////////////////---------------#3 substring()-----------/////////////////
		 
		 String reverse2="";
		 
		 for (int i=original.length()-1;i>=0;i--) {
			reverse2+= original.substring(i,i+1);
		 }
		 System.out.println("Reversed String is: "+reverse1);/////////Reversed String is: ssalC avaJ si yadoT
			 
	}

}
