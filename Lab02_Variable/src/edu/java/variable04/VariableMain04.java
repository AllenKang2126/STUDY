package edu.java.variable04;

public class VariableMain04 {

	public static void main(String[] args) {
		// int : 4바이트 크기의 정수
		// long : 8바이트 크기의 정수
		// Java에서 정수 리터럴(literal)의 기본 타입은 int 그러므로 4byte 크기이상의 숫자를 지정할 때 에러 발생
		//  정수 리터럴(literal)을 long 타입으로 만들려면 숫자 뒤에 영문자 l 또는 L을 붙여줌.
		long longNumber = 12345678900L;
		System.out.println(longNumber);
		
		// 변수 타입 변환
		// 자동(암묵적) 타입 변환
		short shortNumber = 100;  // int 타입 리터럴 100이 short 타입으로 변환
		System.out.println(shortNumber);
		
		// 명시적 타입 변환(casting): (변환할 타입)값/변수
		int intNumber = (int)100L;
		System.out.println(intNumber);
		
		// 명시적 타입 변환 예
		byte x = 100;
		byte y = 28;
		byte add = (byte)(x + y);
		System.out.println(add);  // overflow: 변수 저장 범위가 넘침.
		
		// 다른 방법
		int add2 = x + y;
		System.out.println(add2);
		
		System.out.println(longNumber);
		
		// ctrl + space : 코드 자동 완성(힌트)
		// ctrl + / : (현재 커서가 있는 라인) 주석 만들기/해제 토글

		int n1 = 1234567890;
		int n2 = 1934678900;
		long result = n1 + n2;  // overflow가 일어난 채로 타입만 long으로 바뀜.
		System.out.println(result);
		result = (long)n1 + (long)n2;
		System.out.println(result);
		// 정수 리터럴 기본인 int 이상의 값이 사칙연산으로 나올 때는 2번방법은 사용불가
		// 각각의 정수를 long타입으로 명시적 타입 변환을 실행한 채로 넣어야 함.
		
		byte a = 1;  // 자동 타입 변환
		short b = 2;
		int c = a + b;  // (int)a + (int)b
		// 위에서 byte short int 모두 사용하는 건 정말 안 좋은 코딩방법.(한 가지 타입으로 통일.)
		
		long a1 = 1234567890;
		long b1 = 2134567890;
		long c1 = a1 + b1;
		System.out.println(c1);  // 처음부터 큰 숫자가 나올 것으로 예상되면 long으로 변수를 지정할 것.
		
		
	}

}
