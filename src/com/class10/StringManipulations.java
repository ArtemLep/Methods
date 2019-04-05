package com.class10;

public class StringManipulations {

	public static void main(String[] args) {
//////////////////////////////////////LENGTH() FUNCTION OR METHOD-RETURNS NUMBERS OF CHAR///////
		String str = "Syntax";
		int lenghtString = str.length();

		System.out.println(lenghtString);

		String str1 = "Welcome, students!";
		System.out.println(str1.length());
////////////////////////////////////////////////////////////////////////////////////////////////
		
	String str2="Hello";
	String newString=str2.toUpperCase();////       /toUPPER CASE()
	System.out.println(newString);
/////////////////////////////////////////////////////////////////////////////////////////////////
	String str3="Hello";
	String lowerCase=str3.toLowerCase();/////       toLOWER CASE()
	System.out.println(lowerCase);
///////////////////////////////////////////////////////////////////////////////////////////////////
	String str4="Hello";
	String str5="hello";
	
	boolean equality=str4.equals(str5);///////equals()-------compares to Str,if str are equal--->true,else--->false
	System.out.println(equality);//////false
////////////////////////////////////////////////////////////////////////////////////////////////////////////
	/////////////equalsIgnoreCase()-----compares 2 str but ignores case
	String expectedBrowser="Chrome";
	String actualBrowser="chrome";
	boolean compare=expectedBrowser.equalsIgnoreCase(actualBrowser);
	System.out.println(compare );///////TRUE
////////////////////////////////////////////////////////////////////////////////////////////////////////////
	}

}
