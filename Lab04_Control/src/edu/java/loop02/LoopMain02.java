package edu.java.loop02;

public class LoopMain02 {

	public static void main(String[] args) {
		// 1. for 반복문을 사용해서 1부터 10까지 오름차순으로 출력.
		for (int i = 1; i < 11; i++) {
			System.out.println(i);
		}
		
		System.out.println("\n=====\n");
		// 2. for 반복문을 사용해서 10부터 1까지 내림차순으로 출력.
		for (int i2 = 10; i2 > 0; i2--) {
			System.out.println(i2);
		}
		
		// 지역 변수(local variable): 메서드 안에서 선언된 변수.
		// 지역 변수의 사용 범위 : 
		// 지역 변수가 선언된 위치에서부터 변수가 포함된 블록({...})이 끝날 때까지만 사용 가능!
		// for () 구문의 초기화 식에서 선언된 변수는 for 블록 내부에서만 사용 가능한 지역 변수!
		// for () 구문의 초기화 식에서 선언된 변수를 for 블록 바깥에서 사용하려고 하면 에러가 발생함!
	}

}
