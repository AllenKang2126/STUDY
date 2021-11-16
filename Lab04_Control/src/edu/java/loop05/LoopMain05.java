package edu.java.loop05;

public class LoopMain05 {

	public static void main(String[] args) {
		/* 아래와 같이 출력이 되도록 for 반복문을 작성
			1 2 3 ... 9 10
			11 12 13 ... 19 20
			21 22 23 ... 29 30
			...
			91 92 93 ... 99 100
		 */
		//System.out.println("a");  // print line 줄바꿈을 하여 다음 줄부터 나옴.
		System.out.print(1 + " ");  // 줄바꿈을 하지 않고 바로 다음칸부터 나옴.
		System.out.print(2 + " ");
		System.out.println();
		System.out.println(3 + " ");
		
		for (int n = 1; n <= 100; n++) {
			System.out.print(n + " ");  // 숫자를 한 줄에 출력
			if (n % 10 == 0 ) {  // 10의 배수이면
				System.out.println();  // 줄바꿈
			}  // end if
		} // end for
	}  // end main

}  // end class
