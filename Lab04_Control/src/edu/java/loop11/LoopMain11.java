package edu.java.loop11;

public class LoopMain11 {

	public static void main(String[] args) {
		// while문 연습
		// 1. 구구단 9단만 출력.
		int n = 1;
		while (n <= 9) {
			System.out.println(9 + " x " + n + " = " + (9 * n)); 
			n++;
		}
		
		// 2. 구구단 1단부터 12단 출력. (while문)
		/*n = 1;
		while (n <= 12) {
			
		}*/
		// 3. 구구단 1단부터 12단 출력. (1x1 까지, 2x2 까지, 3x3까지, ...)

		//쌤 코드
		// while문 연습
		// 1. 구구단 9단만 출력.(9x1, ..., 9x12)
		int dan = 9;
		int i = 1;
		while (i <= 12) {
			System.out.println(dan + " x " + i + " = " + (dan * i));
			i++;
		}
		
		// 2. 구구단 1단부터 12단 출력. (while문)
		dan = 1;  // 단 초기화
		while(dan <= 12) {
			System.out.println(dan + "단");
			
			i = 1;  // 곱하는 숫자 초기화. 
					//반드시 여기에 존재해야하는 코드 ( i=1로 초기화하지않으면 13인 상태로 유지되므로)
			while (i <=12 ) {
				System.out.println(dan + " x " + i + " = " + (dan * i));
				i++;
			}  // end while(i)
			
			System.out.println("-----------");
			dan++;
		}  // end while(dan)
		
		System.out.println();
		// 3. 구구단 1단부터 12단 출력. (1x1 까지, 2x2 까지, 3x3까지, ...)
		dan = 1;
		while (dan <= 12) {
			System.out.println(dan + "단");
			
			n = 1;
			while (n <= 12) {
				System.out.println(dan + " x " + n + " = " + (dan * n));

				if (dan == n) {
					break;  // 안쪽 while 반복문을 멈춤.
				}
				n++;
			}
			System.out.println("---------------------");
			dan++;
		}
		
		System.out.println();
		dan = 1;
		while (dan <= 12) {
			System.out.println(dan + "단");

			n = 1;
			while(dan >= n) {
				System.out.println(dan + " x " + n + " = " + (dan * n));
				n++;
			}
			
			System.out.println("---------------------");
			dan++;
		}
		
		
		
	}  // end main

}  // end class
