package com.class28;

import java.util.ArrayList;
import java.util.Iterator;

public class Words {

	public static void main(String[] args) {

		ArrayList<String> words = new ArrayList<String>();

		words.add("Bershka");

		words.add("Metalica");

		words.add("Tree");

		words.add("Chelsea");
		Iterator<String> litter = words.iterator();
		while (litter.hasNext()) {
			String word = litter.next();
			if (word.endsWith("e")) {
				litter.remove();
			}
		}
		System.out.println(words);
	}

}