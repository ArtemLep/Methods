package com.class10;

public class StringManipulatios2 {
/////////////////////////////////////////////////contains()------>checks for specific value in the str
/////////////////////////////////////////////////if value is present --->true,else--->false
	public static void main(String[] args) {
		String str = "Good morning, students!";
		boolean contains = str.contains("students");
		System.out.println(contains);
/////////////////////////////////////////////////////////////////////////////////////////
		String present="Welcome, Asel";
		String nedeedValue="WELCOME,";
		
	boolean flag=present.contains(nedeedValue);
	System.out.println(flag);
	
	boolean flag1=present.toUpperCase().contains(nedeedValue);
			System.out.println(flag1);
/////////////////////////////////////////////////////////////////////////////////////////
			/////////////////////////////////////////////////startsWith()  & endsWith()///////////
			String str1="syntax";
		boolean starts=	str1.startsWith("s");
		System.out.println(starts);
		
		System.out.println(str1.endsWith("y"));///False
////////////////////////////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////__________isEmpty()__________;
		String str2="Hello";
		System.out.println(str2.isEmpty());//FALSE
////////////////////////////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////______________concat()__________;
		String str3="Hello ";
		String str4="Ali ";
		System.out.println(str3+str4);
		System.out.println(str3.concat(str4));
		System.out.println("Hello Ali");
///////////////////////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////____________trim()___________;
		String str5="You may qualify for a multi-policy discount!";
		String actual="    You may qualify for a multi-policy discount!     ";// if spaces should be----->FALSE ---but w trim()----->true
		
		actual=actual.trim();
			System.out.println(str5.equals(actual));
	}

}
