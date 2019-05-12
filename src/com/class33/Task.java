package com.class33;

public class Task {

	public static void main(String[] args) {
		withdraw(1000.00);
	}

	public static void withdraw(double money) {
		if (money < 600.00) {
			System.out.println("This is ur money");
		} else {
			throw new ArithmeticException("Get out ");
		}

	}
}
