package com.class10;

public class HomeWorkString {

	public static void main(String[] args) {
/*
 *     Create a String named "name" and assign the value "Timmy" to it              //REPL 66
    Find out how many characters are there in the given String
 
		String name="Timmy";
		int characters=name.length();
		System.out.println(characters);    //PRINT=5
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	//Create a String named s1 = "hello"  check weather string is empty or not
	//	Create a String named s2 = ""  check weather string is empty or not            //REPL 67
		
		String s1="hello";
		System.out.println(s1.isEmpty());
		
		String s2="";
		System.out.println(s2.isEmpty());
		
		
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		/*
		 * create first string named str1= syntaxsolutions convert into SYNTAXSOLUTIONS 
           create first string named str2=  SYNTAXSOLUTIONS  convert into syntaxsolutions /////REPL 68
		
		String str1="syntaxsolutions";
		String str2="SYNTAXSOLUTIONS";
		System.out.println(str1.toUpperCase());
		System.out.println(str2.toLowerCase()); */
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		/*
		 * Validate if the string ends with "u" prints the Boolean value accordingly
           Validate if the string ends with "world" prints the Boolean value accordingly
           Validate if the string ends with "are" prints the Boolean value accordingly
           Validate if the string ends with "you" prints the Boolean value accordingly  //////////REPL 69
		 
		
		 String s1="hello how are you"; 
		System.out.println(s1.i("u"));
		System.out.println(s1.endsWith("world"));
		System.out.println(s1.endsWith("are"));
		System.out.println(s1.endsWith("you"));*/
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
		/*
		 * Print out the position of the first occurrence of "c"
           Print out the position of the first occurrence of " "
           Print out the position of the first occurrence of the variable target1
           Print out the position of the first occurrence of the variable target2  //////////////REPL 70
		 
		 String str = "abracadabra alakazam";
		    String target1 = "dab";
		    String target2 = "ABRA";
		 System.out.println(str.indexOf("c"));
		 System.out.println(str.indexOf(" "));
		 System.out.println(str.indexOf("dab"));
		 System.out.println(str.indexOf("ABRA"));*/
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		/*
		 *     Output 1: print str starting at index 5 and going to the end
               Output 2:  print str starting at index 7 and ending at index 10
               Output 3: print "harambe" this must not be a new string must be from str
               Output 4: print "t f" this must not be a new string must be from str on one line  ////////////REPL 71
		
		
		  String str = "laptops out for harambe";
		System.out.println(str.substring(5));
	
		System.out.println(str.substring(7,10));
		
	    System.out.println(str.substring(14));
		
		 System.out.println(str.substring(3,4)+" "+str.substring(12,13)); */
		
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		  
		/*
		 *     Print out the character in the 5th index of the String str           ///REPL 72
               Print out the character in the 8th index of the String str
               Print out the character in the 1st index of the String str
               Print out the character in the 10th index of the String str
		 
		String str = "boopity bop";
		System.out.print(str.charAt(5));
		System.out.print(str.charAt(8));
		System.out.print(str.charAt(1));
		System.out.print(str.charAt(10));*/
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		/*
		 * Given a String banana do the following:
           Print out the following: "The first 3 letters of ___ is ___"
           For example, if the input is "banana", your output should be "The first 3 letters of banana is ban"  ///////REPL 73
		 
		String str="banana";
		System.out.println("The first 3 letters of banana is "+str.substring(0, 3));*/
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		
	}

}
