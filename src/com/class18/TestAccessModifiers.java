package com.class18;

import com.class17.AccessModifiers;

public class TestAccessModifiers {

	public static void main(String[] args) {

		AccessModifiers obj = new AccessModifiers();

		obj.isPalindrome("Hello"); // accessing public method in different package

		System.out.println(obj.name3);//// accessing public variable in different packag

	}

}