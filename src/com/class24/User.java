package com.class24;

public class User {

	/*
	 * Write program: user class  has a constructor that takes name and mobile number. 
	 *Extend this class  by userInfo that will have user address variable.
	 * Print users name, mobile number and address in userDetails method. Test your code. (edited) 
	 */
	String name;
	int  mobileNumber;
	User(String name,int mN){
		this.name=name;
		this.mobileNumber=mN;
	}
}
		 class userInfo extends user{
			String userAddress;
			
		userInfo(String name,int mN,String uAdd){
			super(name,mN);
			this.userAddress=uAdd;
		
	}
	void userDetails() {
		System.out.println("Student name is "+name+ " mobile number is "+ mobileNumber+ " user address is "+ userAddress);
	}
}



