package com.class15_2;

public class NestedLoops {

	public static void main(String[] args) {
		// for (int i = 0; i <= 5; i++) {
		// System.out.println(i);
		// }
		/*
		 * if i want to print pattern : 12345-- 12345-- 12345-- 12345 4 rows and 5
		 * columns
		 */
		// for (int i = 1; i < 5; i++) {

		// for (int y = 1; y < 6; y++) {
		// System.out.print(y);

		// }
		// System.out.println();
		// }

		/*
		 * I want to print pattern
		 * 
		 * 1111111 --> rows=7, columns=7
		 * 
		 * 2222222
		 * 
		 * 3333333
		 * 
		 * 4444444
		 * 
		 * 5555555
		 * 
		 * 6666666
		 * 
		 * 7777777
		 * 
		 */

		// for (int i = 1; i <= 7; i++) {

		// for (int y = 1; y <= 7; y++) {

		// System.out.print(i);// 1111111 //2222222

		// }

		// System.out.println();

		// }
		/*
		 * ***** 
		 * ***** 
		 * ***** 
		 * ***** 
		 * *****
		 */
		// for (int i = 0; i <= 4; i++) {
		// for (int a = 0; a < 5; a++) {
		// System.out.print("*");
		// }
		// }
		/*
		 * 54321 
		 * 54321 
		 * 54321 
		 * 54321
		 */
		/*
		 * for (int a = 0; a < 4; a++) { 
		 * for (int b=5;b>0;b--) { 
		 * System.out.print(b);
		 * 
		 * } System.out.println();
		 * 
		 * }
		 * 
		 * /* 
		 * 55555 
		 * 44444 
		 * 33333 
		 * 22222 
		 * 11111
		 * 
		 * for(int i = 5; i >=1 ; i--) { 
		 * for(int x = 1; x <= 5; x++) {
		 * 
		 * System.out.print(i);
		 * 
		 * }
		 * 
		 * System.out.println();
		 * 
		 * }
		 */
		/*
		 * * 
		 * ** 
		 * *** 
		 * ****
		 */
		/*
		 * for (int x = 1; 
		 * x <= 4; x++) { 
		 * for (int y = 1; 
		 * y <= x; y++) {
		 * System.out.print("*"); 
		 * } 
		 * System.out.println(); 
		 * } 
		 * /*---->columns 6
		 *   ****** |
		 *   *    * | rows 4 
		 *   *    * ^
		 *   ******
		 */

		for (int a = 1; a <= 4; a++) {//rows

			for (int b = 1; b <= 6; b++) {//column

				if (a == 1 || a == 4 || b == 1 || b == 6) {

					System.out.print("*");

				} else {

					System.out.print(" ");

				}

			}

			System.out.println();

		}

	}
}
