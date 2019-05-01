package com.class27;

interface MyInterface {

	public int a=100;
	public final int b=200;
	public static int c=300;

	public static int getNum1() {
		return a;
	}

	public static int getNum2() {
		return b;
	}

	public static int getNum3() {
		return c;
	}

	public static void setNum1(int newValue) {
		int Num1 = newValue;
	}

	 static void setNum2(int newValue) {
		int Num2 = newValue;
	}

	 static  void setNum3(int newValue) {
		int Num3 = newValue;
	}
}
