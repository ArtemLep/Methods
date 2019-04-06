package com.class15_2;

import com.class15.calculator;

public class Application1 {

	public static void main(String[] args) {

		calculator obj = new calculator();

		System.out.println(obj.sum(5,8));
		System.out.println(obj.sub(5,8));
		System.out.println(obj.div(5,8));
		System.out.println(obj.mult(5,8));
	}

}
