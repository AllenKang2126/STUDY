package edu.java.lambda01;

public class LambdaMain01 {

	public static void main(String[] args) {
		// 목적 : Calculable 인터페이스를 구현한 클래스의 객체를 사용(메서드 calculate를 호출해서 값을 계산).
		// 1. Calculable을 구현하는 클래스를 정의
		Calculable adder = new Adder();
		// adder 객체의 기능을 사용.
		double result = adder.calculate(1.0, 2.0); // 객체가 가지고 있는 메서드 호출
		System.out.println(result);

		// 2. Calculable을 구현하는 지역 클래스(local inner class)를 정의
		class Subtracter implements Calculable {

			@Override
			public double calculate(double x, double y) {
				return 0;
			}
			
		}  // end local class Subtracter

	} // end main()

} // end class LambdaMain01
