package com.class11;

public class GroupTask {

	public static void main(String[] args) {
  
		String a="Hello";
		String b="World";
		a=a+b;
		b=a.substring(0, a.length()-b.length());
		a=a.substring(b.length());
		
		
		System.out.println("value of the a= " +a+ " value of the b= "+b);
		
		int x=10;
		int y=20;
		System.out.println("Before swap: ");
		System.out.println("x: "+x);
		System.out.println("y: "+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After swap: ");
		System.out.println("x: "+x);
		System.out.println("y: "+y);
		
	}
}