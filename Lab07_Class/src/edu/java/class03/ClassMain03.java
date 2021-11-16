package edu.java.class03;

public class ClassMain03 {

	public static void main(String[] args) {
		// Rectangle 클래스의 인슽턴스를 생성.
		// default constructor를 사용해서 인스턴스를 생성.
		Rectangle rec1 = new Rectangle();
		System.out.println(rec1);	
		System.out.println(rec1.calArea());
		System.out.println(rec1.calRound());
		
		System.out.println("rec1.width = " + rec1.width);
		System.out.println("rec1.height = " + rec1.height);

		// 파라미터(매개변수)가 1개인 생성자를 사용해서 인스턴스를 생성.
		Rectangle rec2 = new Rectangle(5.0);
		System.out.println(rec2);
		System.out.println(rec2.calArea());
		System.out.println(rec2.calRound());
		// 쌤 코드
		System.out.println("rec2.width = " + rec2.width);
		System.out.println("rec2.height = " + rec2.height);
		
		// 파라미터가 2개인 생성자를 사용해서 인스턴스를 생성.
		Rectangle rec3 = new Rectangle(10, 30);
		System.out.println(rec3);
		System.out.println(rec3.calArea());
		System.out.println(rec3.calRound());
		System.out.println(rec3.caldiagonal());
		rec3.info();
		
	}  // end main()

}  // end class()
