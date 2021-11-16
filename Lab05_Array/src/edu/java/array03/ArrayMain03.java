package edu.java.array03;

public class ArrayMain03 {

	public static void main(String[] args) {
		// int 10개를 저장할 수 있는 배열 array1을 선언
		// array1에 5의 배수들을 저장(5, 10, 15, ..., 50)
		// array1의 원소들을 출력.
		int[] array1 = new int[10];  // 쌤코드랑 동일
		for (int n = 0; n < array1.length; n++) {  // 쌤코드랑 동일
			array1[n] = 5 * (n + 1);  // 썜코드랑 동일
			System.out.print(array1[n] + " ");  // 내 코드
		}
		for (int x : array1) {  // 쌤코드
			System.out.print(x + " ");
		}
		
		System.out.println();
		// boolean 5개를 저장할 수 있는 배열 array2를 선언
		// array2의 기본값들을 출력.
		// array2의 값들을 {true, false, true, false}로 변경.
		// array2의 값들을 출력.
		boolean[] array2 = new boolean[5];  // 쌤코드랑 동일
		for ( boolean n : array2) {  // 쌤코드랑 동일
			System.out.print(n + " ");  // 쌤코드랑 동일
		}
		System.out.println();
		
		for (int i = 0; i < array2.length; i++) {
			if (i % 2 == 0) {
				array2[i] = true;
			} else {
				array2[i] = false;
			}
			
		}
		
		for (boolean x : array2) {
			System.out.print(x + " ");
		}
		
		//3항 연산자 사용
		for (int i = 0; i < array2.length; i++) {
			array2[i] = (i % 2 == 0) ? true : false;
		}
		System.out.println();
		
		// char(문자) 26개를 저장할 수 있는 배열 array3을 선언.
		// array3에 영문 소문자들을 저장(a, b, c, ..., z)
		// array3의 원소들을 출력.
		char[] array3 = new char[26];  // 쌤코드랑 동일
		for (int n = 0; n < array3.length; n++) {  // n값을 항상 0을 지정해줘야함. index의 경우 0부터 세므로
			array3[n] = (char)('a' + n);
		}
		for (char x : array3) {
			System.out.print(x + " ");
		}
		
	}

}
