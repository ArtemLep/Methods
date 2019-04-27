package com.class27;

public abstract class Parent {

	public void method1() {
		System.out.println("abstract method1 implementation in main class");
	}
	public abstract void method2();
	


}

class main extends Parent {


	@Override
	public void method2() {
		System.out.println("abstract method2 implementation in parent class");
	}

}


