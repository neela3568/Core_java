package com.Labprograms;

class Rectangle extends Shape {
	String type;
	double length;
	double breadth;

	Rectangle() {
		System.out.println("rectangle created");
	}

	Rectangle(String type, double length, double breadth) {
		super(type);
		System.out.println("Length:" + length);
		System.out.println("Beadth:" + breadth);
		this.type = type;
		double Area = length * breadth;
		System.out.println("Area : " + Area);
	}

	public static void main(String[] args) {
		System.out.println("main method start from rectangle");
		Rectangle r = new Rectangle();
		Rectangle r1 = new Rectangle("AreaOfRectangle", 7.8, 6.8);

	}

}

public class Shape {
	Shape() {
		System.out.println("shape created");
	}

	Shape(String type) {
		System.out.println("Shape Type:" + type);
	}

}
