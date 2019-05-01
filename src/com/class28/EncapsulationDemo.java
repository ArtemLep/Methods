package com.class28;

class EncapsulationDemo {

	private long acc_no;
	private String name, email;
	private float amount;

	public long getAcc() {
		return acc_no;
	}

	public String getName() {
		return name;
	}

	public String getemail() {
		return email;
	}

	public float getAmount() {
		return amount;
	}

	public long setAcc(long newAcc) {
		long acc_no = newAcc;
		return acc_no;
	}

	public void setName(String newName) {
		name = newName;
	}

	public   void setEmail(String newEmail) {
		email = newEmail;
	}

	public void  setAmount(float newAmount) {
		amount=newAmount;
	}

}
