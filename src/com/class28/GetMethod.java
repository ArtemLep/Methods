package com.class28;

import java.util.ArrayList;

public class GetMethod {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(111);
		al.add(333);
		al.add(444);
		al.add(555);
		al.add(666);

		for (Integer num : al) {
			System.out.println(num);

		}

	}
}