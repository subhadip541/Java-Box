package com.aot.interface_blocks;

interface Shape {
	double pie = 3.14;

	void area(double height, double width);
}

class Rectangle implements Shape {
	public void area(double height, double width) {
		double value = height * width;
		System.out.println("Area of Recatangle : " + value);
	}
}

class Circle implements Shape {
	public void area(double a, double r) {
		double value = pie * r * r;
		System.out.println("Area of circle : " + value);
	}
}

public class Program1 {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.area(10, 20);
		Circle c1 = new Circle();
		c1.area(10, 10);
	}
}
