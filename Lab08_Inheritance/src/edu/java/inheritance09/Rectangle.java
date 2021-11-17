package edu.java.inheritance09;

public class Rectangle extends Shape {
	// field
	private double width;
	private double height;
	
	// constructor
	public Rectangle(double width, double height) {
		super("사각형");
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double area() {
		double result = 0;
		result = height * width;
		return result;
	}

	@Override
	public double perimeter() {
		double result = 0;
		result = (width + height) * 2;
		return result;
}
}  // end class Rectangle