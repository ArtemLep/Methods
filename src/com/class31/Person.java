package com.class31;

import java.util.HashMap;
import java.util.Map;

/*
 * Create a Person class with following private fields: name, lastName, age, salary.

Variables should be initialized through constructor.

Inside the class also create a method to print user details.

In Test Class create a Map to store personId and a Person Object. Print each object details
 */
public class Person {
	private String name, lastName;

	private int age, salary;

	public Person(String name, String lastName, int age, int salary) {

		super();

		this.name = name;

		this.lastName = lastName;

		this.age = age;

		this.salary = salary;

	}

	public void userDetail() {

		System.out.println(name + " " + lastName + " is " + age + " years old and his salary is:" + salary);

	}

	public static void main(String[] args) {

		Map<Integer, Person> person = new HashMap();

		person.put(011, new Person("Vasil", "Barikin", 33, 35000));

		person.put(012, new Person("Busil", "Marikin", 43, 135000));

		person.put(013, new Person("John", "Smith", 23, 15000));

		person.put(014, new Person("Usuf", "Moon", 73, 335000));

		for (Person detail : person.values()) {

			detail.userDetail();

		}

	}
}
