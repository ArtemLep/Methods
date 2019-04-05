package com.class10;

public class StringManipulations3 {

	public static void main(String[] args) {
//////////////////////////////////////////////////////____________.charAt()______--->returns a char at specified index

		String str="Students";
		//char character=str.charAt(4);
		//System.out.println(character);

		for(int i=0;i<str.length();i++) {
			System.out.print(str.charAt(i)+",");
		}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
System.out.println();///////////////////////////////////////______________.indexOf("");___________--->>return character
		String str1="Sunday";
		int index=str1.indexOf("n");
		System.out.println(index);
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	String str2="Syntax Technologies";
	System.out.println(str2.indexOf("Syntax"));/////////0
	System.out.println(str2.indexOf("Technologies"));////7
	System.out.println(str2.indexOf(" "));///6
	System.out.println(str2.indexOf("w"));//-1
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//////////////////////////////____________________.substring()________________;
	String str3="Today is Sunday Java class";
	String newString=str3.substring(9);
	System.out.println(newString);
	//////////////Sunday Java class
////////////////////////////////////////////////////////______.substring(,)________;	
	System.out.println(str3.substring(0, 5));//Today
	System.out.println(str3.substring(9, 20));//Sunday Java
	System.out.println(str3.substring(16, 20));//Java
	System.out.println(str3.substring(21));////class
	}

}
