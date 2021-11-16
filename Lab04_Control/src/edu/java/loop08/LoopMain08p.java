package edu.java.loop08;

public class LoopMain08p {

	public static void main(String[] args) {
		//쌤 코드
		
		// break 사용하는 방법
		for (int x = 1; x <= 12; x++) {
			System.out.println(x + "단");
			for (int y = 1; y <= 12; y++) {
				System.out.println(x + " x " + y + " = " + (x * y));
				if (x == y) {  // 단과 곱해주는 숫자가 같은 경우
					break;  // 구구단 출력을 멈춤
					
				}
			}  // end for(y)
			System.out.println("----------");
		}  // end for(x)
		System.out.println();
		
		// break 사용하지 않는 방법
		for (int x = 1; x <=12; x++) {
			System.out.println(x + "단");
			
			for (int y = 1; y <= x; y++) {
				System.out.println(x + " x " + y + " = " + (x * y));
			}
			
			System.out.println("---------");
		}  // end for(x)
		
	}  // end main

}  // end class
