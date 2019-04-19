package com.class21;

public class TestEmployees {

	public static void main(String[] args) {

		Employee1 emp = new Employee1();

		FullTimeEmployee ft = new FullTimeEmployee();

		Contractor contractor = new Contractor();

		emp.getPaid();// Employee gets paid salary

		ft.getPaid();// Full time employee gets paid salary + bonus

		contractor.getPaid();// Contractor gets paid hourly

	}

}
