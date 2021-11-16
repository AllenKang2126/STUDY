package edu.java.class03;

public class Rectangle {
	// field - 속성, 데이터
	double width; // 직사각형의 가로 길이
	double height; // 직사각형의 세로 길이
	double area;
	double round;
	double diagonal;

	// Constructor(생성자)
	// 1) default constructor : width와 height를 모두 0.0으로 초기화
	public Rectangle() {
	}  // do nothing.

	// 2) 파라미터 1개인 생성자 : width와 height를 같은 값으로 초기화
	public Rectangle(double length) {
		this(length, length);  // 파라미터 2개인 생성자 호출
		// 쌤 코드
		this.width = length;
		this.height = length;
	}

	// 3) 파라미터가 2개인 생성자 : 첫번째 argument로 width를 초기화, 두번째 argument로 height를 초기화
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	// method - 기능
	// 1) 직사각형의 넓이를 리턴하는 메서드
	public double calArea() {
		area = width * height;
		return area;
	}
	// 2) 직사각형의 둘레 길이를 리턴하는 메서드
	public double calRound() {
		round = 2 * (width + height);
		return round;
	}
	// 3) 직사각형의 대각선 길이를 리턴하는 메서드
	public double caldiagonal() {
		diagonal = Math.sqrt((width * width) + (height * height));
		return diagonal;
	}
	// 4) 위 모든 값을 리턴하는 메서드
	public void info() {
			System.out.println("직사각형 정보");
			System.out.println("넓이: " + area);
			System.out.println("둘레: " + round);
			System.out.println("대각선길이: " + diagonal);
	}
}
