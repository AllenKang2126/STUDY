package edu.java.inheritance09;

public class InheritanceMain09 {

	public static void main(String[] args) {
		// Shape 타입 2개를 저장할 수 있는 배열을 선언
//		 Shape[] shapes = {};  // 내 코드
		Shape[] shapes = new Shape[2];
		// Rectangle 객체를 생성하고 배열의 첫번째 원소로 저장
		// Shape rectangle = new Rectangle(2, 2); // <- 임의로 넣어야하는건지 아니면 따로 설정을 해줘야하는건지
		// 모르겠습니다.(내 코드)
		shapes[0] = new Rectangle(4, 5); // 다형성(polymorphism) (=)사이에 좌측이 super클래스 우측이 sub클래스일 때 upcasting이 일어남.
		// Circle 객체를 생성하고 배열의 두번째 원소로 저장
		// Shape circle = new Circle(1); // 내 코드
		// shapes[1] = circle; // 내코드
		shapes[1] = new Circle(10);
		// 향상된 for 문을 사용해서 배열의 원소들의 area() 메서드를 호출하고 결과 확인
		for (Shape s : shapes) { // 우측편에 배열, 좌측편에 타입
			s.draw();
		}

	} // end main()

} // end class Inheritance09