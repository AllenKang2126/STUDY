package edu.java.loop08;

public class LoopMain08 {

	public static void main(String[] args) {
		/* 	구구단을 1단부터 12단까지 출력. 1단은 1x1단까지, 2단은 2x2까지, ... 12단은 12x12까지 출력하세요.
		 	break를 사용하는 방법과 break를 사용하지 않는 방법을 모두 생각해보세요.
		 	(출력 결과)
		 	1 x 1 = 1
		 	----------
		 	2 x 1 = 2
		 	2 x 2 = 4
		 	----------
		 	3 x 1 = 3
		 	3 x 2 = 6
		 	3 x 3 = 9
		 	----------
		 	...
		 */
		// break 사용 구문
		for (int dan = 1; dan <= 12; dan++) {
			for (int n = 1; ;n++ ) {
				if (dan < n) {
					break;
				}
				System.out.println(dan + " x " + n + " = " + (dan * n));
			}
			System.out.println("----------");
		}
		
		
		System.out.println("\n==========\n");
		// break 미사용 구문
		for (int dan = 1; dan <= 12; dan++) {
			for (int n = 1; n <= dan; n++) {  // dan의 수와 n의 수가 동일할 경우 다음 단으로 넘김.
				System.out.println(dan + " x " + n + " = " + (dan * n));
			}  // end for(n)
			System.out.println("----------");
		}  // end for(dan)
		
	}  // end main

}
