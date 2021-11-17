package edu.java.inheritance09;

public class Circle extends Shape {
	// field
	private double radius;
	
	// constructor
	public Circle(double radius) {
		super("원");
		this.radius = radius;		
	}

	@Override
	public double area() {
		double result = 0;
		result = Math.PI * radius * radius;
		return result;
	}

	@Override
	public double perimeter() {
		double result = 0;
		result = Math.PI * radius * 2;
		return result;
	}
}