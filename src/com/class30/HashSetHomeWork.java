package com.class30;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetHomeWork {
	public static void main(String[] args) {

		List<String> aList = new ArrayList<>();

		aList.add("John");

		aList.add("Jane");

		aList.add("James");

		aList.add("Jasmine");

		aList.add("Jane");

		aList.add("James");

		Set<String> set = new HashSet<>(aList);
		set.addAll(aList);
		System.out.println(set);
	}
}
