package com.class21;

 class main {

	public static void main(String[] args) {
		Employee item = new Employee("Eggs", 3, "Produce", true, 10);
		Employee item1 = new Employee("Paper Towels", 2, 24);
		Employee item2 = new Employee("Paper Towels", 2);
		item.output();
		item1.output();
		item2.output();

	}

}
