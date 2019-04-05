package com.class5;

public class IncrementDecrement {

	public static void main(String[] args) {

		int x = 1;
		x = x + 1;
		System.out.println(x);

		int y = 1;
		y += 1;
		System.out.println(y);

		int z = 1;
		z++;
		System.out.println(z);

		int w = 2;
		w++;
		System.out.println(w);
		
		int v=10;
		v--;
		System.out.println(v);
		
		int a=10;
		int b=++a;//preincrement= first increment --->assign
		
		int c=10;
		int d=c++;//postincremenet= first assign--> incement
		System.out.println(b);
		System.out.println(d);
		
		
		int q=10;
		
	}

}
