package edu.java.loop03;

public class LoopMain03 {

	public static void main(String[] args) {
		// 반복문을 활용하여 0, 2, 4, 6, 8, 10을 한 줄씩 출력.
		for (int even = 0; even <= 10; even += 2) {  
			// n은 0부터 10보다 작거나 같을 때까지 2씩 증가시키면서
			//+= 복합 연산자 사용! (뒤의 수만큼 더해서 even에 넣어라)
			System.out.println(even);  // n을 출력
		}
		
		System.out.println("------");
		for (int n = 0; n <= 5; n++) {  // n은 0부터 5보다 작거나 같을 때까지 1씩 증가시키면서
			System.out.println(2 * n);  // 2*n을 출력
		}	
		
		System.out.println("------");
		for (int n = 0; n <= 10; n++) {  // n은 0부터 10보다 작거나 같을 때까지 1씩 증가시키면서
			if (n % 2 == 0) {  // n이 짝수이면
				System.out.println(n);  // n을 출력
			}
		}
	}  // end main

}
