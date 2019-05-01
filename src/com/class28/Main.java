package com.class28;

public class Main {

	public static void main(String[] args) {

		EncapsulationDemo demo = new EncapsulationDemo();
		long acc_no = demo.setAcc(7560504000l);
		demo.setAmount((float) 500000.0);
		demo.setEmail("sumair@syntaxsolutions.com");
		demo.setName("Sumair");
		System.out.print(demo.getAcc() + " " + demo.getName() + " " + demo.getemail() + " " + demo.getAmount());
	}

}
