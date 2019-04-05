package com.class9;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		/*                                                          //REPL 59
		 * Create an int array with the size of 5 and input values with Scanner. Print
		 * out each element of the array multiplied by ten, one element per line. Create
		 * a loop and enter values into one loop, the second loop print the values and
		 * it must be multiplied by 10.
		 * 
		 * Scanner scan=new Scanner(System.in);
		 *  int[] array =new int[5]; 
		 *  for (inta=0;a<5;a++) { 
		 *  array[a]=scan.nextInt();
		 
		 * } for (int a=array.length-1;a>=0;a--) {////5-4-3-2-1
		 * System.out.println(array[a]); }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		double[][] a = {   //REPL 60
				         { 1.4, 2.0, 3.3, 2 }, 
				         { 4, 1.5, 6.1, 1 }, 
				         { 1.2, 3.1, 4, 1.6 } 
				       };
		for (int b = 0; b < a.length; b++) {
			for (int c = 0; c < a[b].length; c++) {//multiple in double
				System.out.println(a[b][c]*2);
			}
			System.out.println();

		} 
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		int[][] a = {     //REPL 61
				{5,2,3,7},
				{1,5,2,2},
				{1,2,3,4}
			};
	
		int sum = 0;
		for( int i : a[2]) {
		    sum += i;
		}

		System.out.println(sum); ///////print 10
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		int[][] a = {                                     //REPL 62
				{5,2,3,7},
				{1,5,1,1},
				{8,3,1,2}
			};
	//should be 8
		int max=a[0][0];
		for (int num=0;num<a.length;num++) {
			for (int num1=0;num1<a[num].length;num1++) {
				if(a[num][num1]>max) {
		    		max=a[num][num1];
			}
		}

		
	}
		System.out.println(max);                 //PRINT :8
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		int[][] a = { { 1, 1, 1 }, { 1, 1, 1 }, { 1, 1, 1 } };  //REPL 63

        // true      
		boolean b = false;        
		for (int i = 0; i < a.length; i++) {

        if (a.length == a[i].length) {

         b = true;

         }

            break;

        }

        System.out.println(b);
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		int[][] a = {                                                        //REPL 64
				{1,1,2}, //sum = 4
				{3,1,2}, //sum = 6
				{3,5,3}, //sum = 11
				{0,1,2}  //sum = 3
			};
		 int sum;

	      // sum of each individual row
	      for (int row = 0; row < a.length; row++)
	      {
	         sum = 0;

	         for (int col = 0; col < a[row].length; col++)
	         {
	            sum = sum + a[row][col];
	         }

	         System.out.println(sum);
	                        
	      }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		int[][] a = {                                                         //REPL 65
				{-5,-2,-3,7},
				{1,-5,-2,2},
				{1,-2,3,-4}
			};

		 int z = 0;

         for (int j = 0; j < a.length; j++) {

             for (int i = 0; i < a[j].length; i++) {

                 if ((a[j][i] < 0) && (a[j][i] % 2!=0)) {

                     z = z+1;

                 }

             }

         }

      System.out.println(z);

     

     
	}
	   }
*/