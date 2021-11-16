package edu.java.class04;

public class ClassMain04 {

	public static void main(String[] args) {
		// default 값
		Point point1 = new Point(); // point 클래스의 인스턴스를 생성
		point1.info(); // pt1의 정보를 출력.
		// (0, 0) -> (2, 3) 이동
		point1.move(2, 3);
		point1.info();

		System.out.println();
		// 파라미터 2개의 생성자
		Point point2 = new Point(4, 3);
		point2.info();

		Point result = point2.move(2, 1);
		System.out.println(point2);
		System.out.println(result); // point2 와 result는 같은 인스턴스를 가리킨다.

		result.move(0, 2); // (2)
		point2.info();
		result.info();
		// point2와 result가 같은 인스턴스를 가리키기 때문에,
		// result를 move

		// 메서드
		System.out.println();
		point2.move(2, 1);
		point2.info();
		point2.move(2, 1).move(2, 2); // 메서드 연쇄 호출. (객체 타입을 리턴하는 메서드 사용 시 가능)
		point2.info();
		System.out.println("---------");
		// Circle 확인
		Circle c1 = new Circle();
		Point pt = new Point();
		pt.info();
		System.out.println(c1.radius);
		System.out.println(c1.center); // null : Point 인스턴스(center)가 아직 생성되지 않았음.

		System.out.println(c1.center.x); // NullPointerException
		c1.info();
		
		System.out.println();
	Point center = new Point();  // 원점(0, 0)을 생성
		Circle c2 = new Circle(center, 10.0);  // 중심이 원점에 있고 반지름이 10인 원을 생성
		// new Circle(new Point(), 10.0); 와 동일
		c2.info();
		
		System.out.println();
		Circle c3 = new Circle (0, 0, 1);
		c3.info();
		c3.CalArea();
		System.out.println("c3 넓이 = " + c3.area);
		System.out.println("c3 둘레 = " + c3.CalRound());
		
		// c3 >Circle을 -1, -1로 이동
		c3.move(-1, -1);
		c3.info();
		
	} // end main()

} // end class()
