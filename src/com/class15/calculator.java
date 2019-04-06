package com.class15;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		calculator obj = new calculator();

		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();

		int b = scan.nextInt();

		System.out.println(obj.sum(a, b));
	}
	public int sum(int a, int b) {
		return(b+a);
	
	}
	public int div(int a, int b) {
		return(a/b);
	}
	public int sub(int a, int b) {
		return(a-b);
	}

	public int mult(int a, int b) {
		return(a*b);
	}
}
