package com.class17;

public class Task2 {
	String name;
	char grade;

	public char getGrade(int score) {
		if (score > 90)
			return 'A';
		else if (score > 80)
			return 'B';
		else if (score > 70)
			return 'C';
		else if (score > 50)
			return 'D';
		else
			return 'F';

	}

	public static void main(String[] args) {

		Task2 obj=new Task2();
		System.out.println("Student grade is : "+ obj.getGrade(100));
		}

}
