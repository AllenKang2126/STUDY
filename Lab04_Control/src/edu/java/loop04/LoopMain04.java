package edu.java.loop04;

public class LoopMain04 {

	public static void main(String[] args) {
			/* 구구단 2단을 아래와 같은 형식으로 출력.
			 2 x 1 = 2
			 2 x 2 = 4
			 2 x 3 = 6
			 ...
			 2 x 9 = 18
			 */
		for (int i = 1; i < 10; i++) {  // n은 1부터 10보다 작을 때까지 1씩 증가시키면서
			int result = 2 * i;
			System.out.println("2 x " + i + " = " + result);
		}
		System.out.println("\n---------\n");
		
		for (int n = 1; n <= 9; n++) {  // n은 1부터 10보다 작을 때까지 1씩 증가시키면서
			System.out.println("2 x " + n + " = " + (2 * n));
		}
		
		System.out.println("------");
		System.out.println("1부터 10까지 합");  // sum = 1 + 2 + 3 + .... + 10 = 55
		
		// sum = 0
		// sum = sum + 1 = 1
		// sum = sum + 2 = 1 + 2 = 3
		// sum = sum + 3 = 1 + 2 + 3 = 6
		// ...
		
		int sum = 0;  // 1부터 10까지 합을 저장할 변수를 선언, 초기화
		for (int a = 1; a <= 10; a++) {
			sum += a;  // sum = sum + a;
			System.out.println("sum = " + sum);
			
		}
		// System.out.println("sum = " + sum);
		
		System.out.println("------");
		System.out.println("1부터 100까지 정수들 중에서 짝수들의 합");  // sum = 2 + 4 + 6 + ... + 98 + 100
		//TODO
		sum = 0;
		for (int n =2; n <= 100; n += 2) {
			sum += n;
		}
		System.out.println("짝수들의 합 = " + sum);
		
		sum = 0;
		for (int n = 1; n <= 100; n++) {  // 짝수이면
			if (n % 2 == 0) {
				sum += n;
			}
		}
		System.out.println("짝수들의 합 = " + sum);
		
		System.out.println("------");
		System.out.println("1부터 100까지 정수들 중에서 홀수들의 합");  // sum = 1 + 3 + 5 + ... + 97 + 99
		//TODO
		sum = 0;
		for (int n = 1; n <= 99; n += 2) {
			sum += n;
		}
		System.out.println("홀수들의 합 = " + sum);
		
		sum = 0;
		for (int n = 1; n <= 100; n++ ) {
			if (n % 2 == 1) {  // n이 홀수이면
				sum += n;
			}
		}
		System.out.println("홀수들의 합 = " + sum);
			
	}  // end main

}  // end class
