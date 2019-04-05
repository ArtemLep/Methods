package com.class11;

public class Task {

	public static void main(String[] args) {
//////////////////////////////////TASK1//////////////////////////////
	/*	String str = "12213The Java###$$$%../,. is strict language!";
		String newStr = str.replace(" ", "");
		System.out.println(newStr);

		//////////////////////////// TASK 2 ///////////////////////////////////

		String str1 = str.replaceAll("[^A-z]", "");
		System.out.println(str1.length());
		///////////////////////////TASK3////////////////////////////////////////
		*/
		
		String a="Is it saturday? Is it reining? Do we have a Java Class today? ";
		String[] b=a.split("[!?]");
		System.out.println(b.length);
	}

}
