package com.class18;

public class Emploee {
	int eID;

	int salary;

	static String Ceo="Sumair";

	

	public static void main(String[] args) {

		Emploee caliskan=new Emploee();

		Emploee tembel=new Emploee();

		caliskan.eID=00001;

		tembel.eID=00002;

		caliskan.salary=100000;

		tembel.salary=100;

		System.out.println(caliskan.eID+" salary is "+ caliskan.salary+" and Ceo for him is "+caliskan.Ceo+".");

		System.out.println(tembel.eID+" salary is "+ tembel.salary+" and Ceo for him is "+tembel.Ceo+".");

	}



}
	/*
	 * Create a Class called Employee:
	 * 
	 * Create three variables eID , salary and set the CEO to “Sumair”
	 * 
	 * Create two objects of the class Employee
	 * 
	 * Set the value of eID, salary for each of the objects
	 * 
	 * Print out the eID , salary and CEO for each of the objects
	 */


