package edu.java.inheritance09;

public class InheritanceMain09 {

	public static void main(String[] args) {
		// Shape 타입 2개를 저장할 수 있는 배열을 선언
		Shape[] shapes = {, };
		// Rectangle 객체를 생성하고 배열의 첫번째 원소로 저장
		Shape rectangle = new Rectangle(2, 2);  // <- 임의로 넣어야하는건지 아니면 따로 설정을 해줘야하는건지 모르겠습니다.
		shapes[0] = rectangle;
		// Circle 객체를 생성하고 배열의 두번째 원소로 저장
		Shape circle = new Circle(1);
		shapes[1] = circle;
		// 향상된 for 문을 사용해서 배열의 원소들의 area() 메서드를 호출하고 결과 확인


	}
}