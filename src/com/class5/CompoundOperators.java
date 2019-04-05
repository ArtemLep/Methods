package com.class5;

public class CompoundOperators {

	public static void main(String[] args) {

		/*
		 * int a = 10; a = a + 10; System.out.println(a);// 20
		 * 
		 * int b = 100; b = b + 100; System.out.println(b);// 200
		 * 
		 * int c = 100;
		 * 
		 * c += 100;// c=c+100; System.out.println(c);// 200
		 * 
		 * c += 35; System.out.println(c);// 235;
		 * 
		 * c += 50; System.out.println(c);// 285;
		 * 
		 * int d = 30; d -= 10; System.out.println(d);// 20;
		 * 
		 * d += 50; System.out.println(d);// 70
		 * 
		 * d /= 5; System.out.println(d);// 14
		 * 
		 * d %= 4; System.out.println(d);// 2
		 */

		int a = 10;
		a += 100;
		System.out.println(a);// 110

		int b = 10;
		b += 67;
		System.out.println(b);// 77

		int cakePiece = 11;
		cakePiece /= 4;
		System.out.println(cakePiece);// 2

		int cakePiece1 = 25;
		cakePiece1/=7;
		System.out.println(cakePiece1);//3

	}

}
