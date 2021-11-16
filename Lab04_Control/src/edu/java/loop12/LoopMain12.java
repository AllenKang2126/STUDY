package edu.java.loop12;

public class LoopMain12 {

	public static void main(String[] args) {
		// for 구문, while 구문을 모두 사용

		/* 1. 아래와 같이 출력되도록 코드 작성.
		 	(출력 결과)
		 	*
		 	**
		 	***
		 	****
		 	*****		 
		 */
		for(int n = 1; n <= 5; n++) {
			for(int i = 1; i <= n; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("============");
		
		int y = 1;
		while (y <= 5) {
			int x = 1;
			while (x <= y) {
				System.out.print("*");
				x++;
			}
			System.out.println();
			y++;
		}

		
		/* 2. 아래와 같이 출력되도록 코드 작성
		 	(출력 결과)
		 	1꼬마 2꼬마 3꼬마 인디언
		 	4꼬마 5꼬마 6꼬마 인디언
		 	7꼬마 8꼬마 9꼬마 인디언
		 	10꼬마 인디언 소년
		 */
		for (int s = 1; s <= 10; s++) {
			if(s % 3 == 0) {
				System.out.print(s + "꼬마 ");
				System.out.print("인디언");  // 과도하게 생각하는 경향이 존재.
				System.out.println();
			} else {
				System.out.print(s + "꼬마 ");	
			}
		}
		System.out.print("인디언 소년");
		
		/* 3. 369게임 출력
	 	(출력 결과)
	 	1 2 * 4 5 * 7 8 * 10
	 	11 12 * 14 15 * 17 18 * 20
	 	21 22 * 24 25 * 27 28 * *
	 	* * * * * * * * * 40
	 	...
	 	* * * * * * * * * 100
	 */
		for (int a = 1; a <= 100; a++) {
			
		}
		System.out.println("\n--------\n");
		// 쌤 코드
		// 1번 문제
		for (int i = 1; i <= 5; i++) {
			// 한 줄에 "*"들을 출력
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();  // 줄바꿈
		}
		
		System.out.println();
		
		int x = 1;
		while(x <= 5) {
			// 한 줄에 "*"를 출력
			int b = 1;
			while (b <= x) {
				System.out.print("#");
				b++;
			}
			System.out.println();
			x++;
		}
		
		
		
		

		
		
	}
		

}
