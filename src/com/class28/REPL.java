package com.class28;

import java.util.ArrayList;

public class REPL {

	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<String>();
		words.add("hi");

		words.add("yo");

		words.add("sup");

		words.add("yolo");
		
		words.add("boop");
		
		System.out.println(words);

		for(String word:words) {
			if(word.contains(word)) {
				word="yo";
				word="yolo";
			}
			System.out.println(word);
		}
	}

}
