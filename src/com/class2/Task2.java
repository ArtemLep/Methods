package com.class2;

public class Task2 {

	public static void main(String[] args) {
		/*double rate=4.5;
		double expectedRate=5;
		double price=180000;
		double expectedprice=200000;
		
		if (rate>expectedRate){
			System.out.println("You will not buy a house");
			
		}else {
				System.out.println("I will pay by cash");
		if(price>expectedprice) {
					System.out.println("I will take a loan");
				
		}else {
			System.out.println("I will not buy a house");
		} 
		
		}*/
		
		int workedYears=5;
		int expectedYears=7;
		int expectedSalary=3000;
		int anualSalary=5000;
		
		if (workedYears>=5) {
			System.out.println("User is eligble for the bonus");
			if (expectedSalary<=anualSalary) {
				System.out.println("Than u will get the Bonus 5000");
			}else {
				System.out.println("Then you will get the bonus 3000");
			}
		}else {
			System.out.println("User doesn't eligble for the bonus");
		}

	}

}
