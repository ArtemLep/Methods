package com.class28;

import java.util.ArrayList;
import java.util.Iterator;

public class Task4EvenNumbers {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		for (int i = 0; i <= 20; i++) {
			if (i % 2 != 0) {
				numbers.add(i);
			}
			
		}			
		System.out.println(numbers);

			Iterator<Integer> evenNum = numbers.iterator();
			while (evenNum.hasNext()) {
				if (evenNum.next()%5==0) {
					evenNum.remove();
				}
			}
			System.out.println(numbers);
				
			
		
	}
}
