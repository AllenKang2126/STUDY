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
		result = Math.PI * radius * 2;  // Math는 클래스, pi는 (.)호출자 이후에 그냥 쓰고 있다. 즉, static으로 쓰여있다.
										// 수정이 불가하므로 final이라는 수식어 역시 포함 되어 있다.
		return result;
	}
}