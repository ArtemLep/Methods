package com.class15_2;

public class NestedLoop {

	public static void main(String[] args) {
		NestedLoop loop1=new NestedLoop();
		loop1.loop();
	}
		
		void loop() {

		for (int i=0; i<5; i++) {
			
			for (int y=0; y<3; y++) {
				System.out.println("I am inner loop" +y);
			}
			System.out.println("------I am outer loop------" +i);
		}

	}

}
