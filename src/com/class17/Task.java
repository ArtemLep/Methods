package com.class17;

public class Task {

	public static void main(String[] args) {
		Task obj = new Task();

		System.out.println(obj.createEmail("Tommy", "Smith", "@gmail.com"));
	}

	String createEmail(String name,String lastname,String type) {
		String emailAddress=name+lastname+type;
		return emailAddress;
		
		
		
	}
}
