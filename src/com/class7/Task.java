package com.class7;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		// 1. Write a program that reads a range of integers (start and end point),
		// provided by a user and then from that range prints the sum of the even and
		// odd integers.

		int start, end, sumodd, sumeve;

		Scanner sc = new Scanner(System.in);

		System.out.println("enter start");

		start = sc.nextInt();

		System.out.println("Enter end");

		end = sc.nextInt();

		sumodd = 0;

		sumeve = 0;

		for (int a = start; a <= end; a++) {

			if (a % 2 == 0) {

				sumodd = sumodd + a;

			} else

				sumeve = sumeve + a;

		}

		System.out.println(sumodd);

		System.out.println(sumeve);

	}

}
