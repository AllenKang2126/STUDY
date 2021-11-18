package edu.java.wrapper01;  // 클래스 = 데이터 (+ 생성자) + 기능 = 데이터 타입
// 기본 타입 -> 기능 x, 메서드 x.

// Wrapper class : 자바의 기본 데이터 타입을 감싸는 (상자와 같은) 클래스
// java.lang 패키지에 포함. import 문 없이 사용 가능.
// 기본 데이터 타입(primitive type) : boolean, byte, short, int, long, char, float, double
// wrapper class : Boolean, Byte, Short, Integer, Long, Character, Float, Double
// wrapper class를 만든 목적 : 
// 1) 기본 타입 데이터를 다루는 메서드를 제공
// 2) 다형성(Polymorphism)을 사용하기 위해서.
// 3) generic 클래스에서 사용하기 위해서.

public class WrapperMain01 {

	public static void main(String[] args) {
		Integer num1 = Integer.valueOf(1);
		// 정수 1을 담고 있는 Integer 객체를 생성. -> boxing
		System.out.println(num1);  // Integer 클래스는 Object 클래스의 toString() 메서드를 override
		
		Integer num2 = Integer.valueOf("2");
		// 문자열 "2"를 정수 2로 변환해서 정수를 담고 있는 Integer 객체를 생성. - boxing
		System.out.println(num2);
		
		int x = num1.intValue();
		// Integer 객체(상자)가 담고 있는 기본 타입(int)의 값을 리턴. -> unboxing
		System.out.println(x);
		
		int y = num2.intValue();
		System.out.println(y);
		
		// Java 5 버전부터 auto-boxing, auto-unboxing 기능을 제공함.
		Integer num3 = 100;  // auto-boxing : 정수(int)을 자동으로 클래스(Integer) 객체로 변환해서 저장.
		int z = num3;  // auto-unboxing : 클래스(Integer) 객체에서 정수(int) 값을 추출
		System.out.println(z);
		
	}

}
