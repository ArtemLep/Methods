package com.class14;

public class NoMainMethod {
	// methods and variables are member of the class

	


	void hello() {

		System.out.println("Hello");

		System.out.println("Hello friends");

		System.out.println("Hello");

		System.out.println("Hello friends");

	}

	void bye() {

		System.out.println("Bye");

	}

	public static void main(String[] args) {// method signature

		NoMainMethod obj = new NoMainMethod();// method body

		obj.hello();// we calling a method hello

		obj.bye();

	}

	void howAreYou() {

		System.out.println("How are you?");

	}

}
