package edu.java.inheritance09;

public abstract class Shape {  // << 도형들 각각의 넓이, 둘레 길이 구하는 방법을 모두 만족시키는 식은 힘듬.
							   // << 
	// field
	protected String type; // 원, 사각형 등등
	
	// constructor  - 추상클래스도 생성자 생성은 가능. 다만, 호출은 불가.
	public Shape(String type) {
		this.type = type;
	}
	
	// abstract method  << 추상클래스 내
	public abstract double area();  // 넓이
	public abstract double perimeter();  // 둘레길이
	
	// final method
	public final void draw() {
		String result = type + "(넓이:" + area() + ", 둘레:" + perimeter();
		System.out.println(result);
	}
}