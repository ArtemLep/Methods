package com.class10;

import java.util.Scanner;

public class HomeWorkString1 {
/*
 * If language is Java
It should print the 
Java is a programming language.
If language is C
It should print the 
C is a procedural programming language
If language is C++
It should print the                                        ///////////////REPL 74
C++ is a middle-level programming language
If any other should print 
Doesn't match any programming language
 
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in); 
		  System.out.println("Enter any programming language");
		   String language = sc.nextLine(); 
		  if (language.equals("Java")) {
			  System.out.println("Java is a programming language.");
		  }else if (language.equals("C")) {
			  System.out.println("C is a procedural programming language");
		  }else if(language.equals("C++")) {
			  System.out.println("C++ is a middle-level programming language");
		  }else {
			  System.out.println("Doesn't match any programming language");
		  }*/
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	/*
	 * For you to do:
If browser is ChRoME
It should print the 
Proceed with chrome Browser
If browser is FireFOX
It should print the 
Proceed with firefox Browser
If browser is Ie
It should print the 
Proceed with ie Browser
If any other browser 
It should print the  
Invalid Browser
	 */
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in); 
	  System.out.println("Enter the browser name to proceed further with execution");
	   String browser = sc.nextLine(); 
	   if (browser.equalsIgnoreCase("ChRoME")) {
		   System.out.println("Proceed with chrome Browser");

	}else if (browser.equalsIgnoreCase("FireFOX")) {
		System.out.println("Proceed with firefox Browser");
	}else if (browser.equalsIgnoreCase("Ie")) {
		System.out.println("Proceed with ie Browser");
	}else {
		System.out.println("Invalid Browser");
	}
	   System.out.println();
}

}
