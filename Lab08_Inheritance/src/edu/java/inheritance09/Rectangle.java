package edu.java.inheritance09;

public class Rectangle extends Shape {
	// field
	private double width;
	private double height;

	// constructor
	public Rectangle(double width, double height) {
		super("직사각형");  // 상위 클래스의 생성자를 "명시적"으로 호출. (해당 타입의 fields 에 맞춰서)
		this.width = width; // 쌤 코드와 동일
		this.height = height; // 쌤 코드와 동일
	}
	
	// 상위 클래스 Shape이 가지고 있는 추상 메서드들을 override해서 구현(implement).
	@Override  // 리턴 타입과 이름과 파라미터가 모두 동일해야만 override가 가능하다.
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

} // end class Rectangle