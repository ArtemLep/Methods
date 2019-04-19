package com.class21;

/*
 * Create a class ‘Degree’ having a method ‘getDegree’ that prints “I got a degree”. 
 * Class ‘Degree’ has two subclasses namely ‘Undergraduate’ and ‘Postgraduate’ 
 * each having a method with the same name that prints “I am an Undergraduate” and “I am a Postgraduate” respectively.
 *  Call the method by creating an object of each of the three classes.
 */
public class Degree {
	public void getDegree() {

		System.out.println("I got a degree");

	}

	public static void main(String[] args) {

		Degree obj = new Degree();

		Degree obj1 = new UnderGraduate();

		Degree obj2 = new Postgraduate();

		obj.getDegree();

		obj1.getDegree();

		obj2.getDegree();

	}
}

class UnderGraduate extends Degree {

	public void getDegree() {

		System.out.println("I  am an Undergraduate");

	}

}

class Postgraduate extends Degree {

	public void getDegree() {

		System.out.println("I am a Postgraduate");

	}

}
