package edu.java.class04;

// 원(동그라미)를 표현하는 클래스
// 속성(상태, 데이터): 중심의 좌표(x, y), 반지름
// 기능 : 넓이(3.14 * r^2), 둘레의 길이(2 * 3.14 * r), 원의 중심을 이동, info
public class Circle {
	// field
	double pi = Math.PI;
	Point center;  // 클래스 이름은 '타입'이기 때문에 변수를 선언할 때 사용 가능.
	double radius;
	double area;
	double round;
	
	// 생성자(constructor)
	public Circle() {
		center = new Point();  // center가 null이 되지 않도록 하기 위해서.
	}
		
	public Circle( Point center, double radius) {
		this.center = center;
		this.radius = radius;
	}
	
//	public Circle(double x, double y, double r) {
//		this.center.x = x;
//		this.center.y = y;
//		this.radius = r;
//	}
	
	public Circle(double x, double y, double r) {
		this.center = new Point(x, y);
		this.radius = r;
	}
	
	// 메서드(Method)
	// info 기능
	public void info() {
		System.out.println("Circle(중심 x = " + center.x + ", 중심 y = " + this.center.y + ", 반지름 = " + this.radius +  ")");
	}
	
	// 넓이 구하기 기능
	public double CalArea() {
		area = pi * radius * radius;
		return area;
	}
	
	// 둘레 구하기 기능
	public double CalRound() {
		round = 2 * pi * radius;
		return round;
	}
	
	// 원의 중심 이동
	public Circle move(double dx, double dy) {
		center.move(dx, dy);
		return this;
	}

}
