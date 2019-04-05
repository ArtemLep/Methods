package com.class11;

public class StringManipulations {

	public static void main(String[] args) {
		// 1 replace()
		// What we are looking for to replace, new value
		String str = "I am good tester#1!";
		String newStr = str.replace("a", "e");
		System.out.println(newStr);// I em good tester

		String newStr1 = str.replace("good", "great");
		System.out.println(newStr1);// I am great tester

		String newStr2 = str.replace("tester", "programmer");
		System.out.println(newStr2);// I am good programmer

		String newStr3 = str.replace("Tester", "programmer");
		System.out.println(newStr3);// no change--->uppercase

		String newStr4 = str.replace("!", "?");
		System.out.println(newStr4);// I am good tester?

		str.replace("1", "2");
		System.out.println(str);

		///////////////////////// ------------2-----------///////////////

		String str1 = "12Hello 3234 World 465%^%";
		String replacedNoNumbers = str1.replaceAll("[0-9]", "");
		System.out.println(replacedNoNumbers);// Hello World %^% (replaced all numbers)

		String newString=replacedNoNumbers.replaceAll("[^A-Z a-z]","");
		System.out.println(newString);//HelloWorld

		//String replaceNoCharacter = replaced.replaceAll("[A-Za-z]", "");
		//System.out.println(replaceNoCharacter);// %^%
       
	}

}
