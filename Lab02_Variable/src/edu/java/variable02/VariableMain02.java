package edu.java.variable02;

public class VariableMain02 {

	public static void main(String[] args) {
		// 변수 사용 방법 2: 변수 선언문 따로, 변수 초기화(값을 할당하는) 문 따로.
		// 변수타입 변수이름;
		// 변수이름 = 값;
		int x;  // 변수 선언 문장(변수 x는 정수 타입임.)
		x = 23;  // 변수 x에 정수 23을 저장(변수 x를 정수 23으로 초기화).
		System.out.println("x = " + x);
		
		// 변수의 사용 범위: 변수가 선언된 이후부터 변수가 포홤된 블록({...})의 끝까지.
		x = 45;  // 변수에 다른 값을 할당.
		System.out.println("x = " + x);
		
		// int x = 100;
		// 위의 코드는 에러가 발생 : 같은 이름(x)으로 중복된 변수를 선언하는 문장이기 때문에.
		// 같은 이름으로 변수를 두 번 선언할 수는 없다!
		
		int user_password;  // snake 표기법 뱀처럼 길게 씀.(Python언어에서 자주 씀.)
		int userPassword;  // camel 표기법 낙타의 혹처럼 튀어나오게 씀.(JAVA언어에서 자주 씀.)
	}

}
