package com.class26;

/*
 * 1. Create an Interface ‘Shape’ with undefined methods as calculateArea() and calculatePerimiter(). Create 2 child classes: 
 * Circle & Square that should have an implementation of area and perimeter calculation. 
 * Test your code.
 */
public interface Shape {

	public void calculateArea();

	public void calculatePerimeter();

}

class Circle implements Shape {

	int r = 10;

	double pi = 3.14;

	public void calculateArea() {

    double area;

        area = pi * r * r;

        System.out.println("Area of circle: "+area);

    }

	public void calculatePerimeter() {

        double perimeter = 2 * pi *r;

        System.out.println("Perimeter of circle: "+perimeter);

    }

}

class Square implements Shape {

	int x = 10;

	int y = 20;

	public void calculateArea() {    

        int area=x*x;

        System.out.println("Area of Square: "+area);

    }

	public void calculatePerimeter() {

        int perimeter=4*x;

        System.out.println("Perimeter of Square: "+perimeter);

    }

}