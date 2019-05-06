package com.class31;

import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Set<String> list = new TreeSet<>();
		list.add("India");
		list.add("Australia");
		list.add("South Africa");
		list.add("India");
		list.add("America");
		list.add("America");

		
		System.out.println(list);
	}

}
