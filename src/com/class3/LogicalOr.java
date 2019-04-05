
package com.class3;
import java.util.Scanner;
public class LogicalOr {
	/*public static void main(String[] args) {
		
		int day=5;
		
		if (day==1 ||  day==2 || day==3 || day==4|| day==5) {
			System.out.println("Its a weekday");
		}else if (day==6 || day==7) {
			System.out.println("its a weekend");
		}else {
			System.out.println("Not a valid day");
		}
	}

*/

    /*

     * Write a Java program to ask user enter daily sales amount

     * Based on the sales range commission will be different;

     * Example: sales is <100==> commission =2

     * sales more than 100 and less than 200=5

     */    
	
	public static void main(String[] args) {        
		int sales;

        int commission;

        scan= new.Scanner(System.in);

        System.out.println("Please enter sales amount");

        sales=scan.nextInt();

        if (sales>0 && sales<100) {

            commission=2;

        }else if (sales>=100 && sales<200) {

            commission=5;

        }else if (sales>=200 && sales<500) {

            commission=10;

        }else if (sales>=500) {

            commission=20;

        }else {

            commission=0;

        }

        System.out.println("Your commision is "+commission);

        

    }

}
