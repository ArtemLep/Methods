package com.class30;

import java.util.HashSet;

public class HashSetHomeWork {
	public static void main(String[] args) {

		HashSet<String> hset = new HashSet<>();

		hset.add("third");

		hset.add("first");

		hset.add("second");
		System.out.println("My HashSet content:" + hset);
		hset.clear();

		System.out.println("Content After clear: " + hset);
	}
}
