package edu.java.array07;

import java.util.Random;

public class ArrayMain07 {

	public static void main(String[] args) {
		// 1 ~ 5 사이의 정수 난수 3개를 저장하는 배열
		// 단, 3개의 숫자는 모두 달라야 함.
		/*Random rand = new Random();     <-----내 코드 ㅠㅠ
		int[] score = new int[3];
		
		int count = 0;  // 배열에 난수가 저장된 갯수
		while (count < 3) {
			
			for (int i = 0; i < 3; i++) {
				score[i] = rand.nextInt();
			}
				
			if score
			
		}  // end while
		*/
		
		Random rand = new Random();  // 난수 만드는 도구
		int[] numbers = new int[3];  // 정수 3개를 저장하는 배열
		int count = 0;  // 배열에 저장된 난수 갯수
		
		while (count < 3) {  // 배열에 저장된 난수 개수가 3개보다 작으면 반복
			int r = rand.nextInt(5) + 1;
			System.out.println(r);
			
			boolean isSame = false;  // 배열에서 같은 숫자가 있으면 true로 바꿀 변수
			for (int i = 0; i < count; i++) {
				if (numbers[i] == r) {
					isSame = true;
					break;  // for문 종료
				}
			}  // end for
				
			if (isSame == false) {  // 같은 숫자를 발견하지 못했을 때
				numbers[count] = r;  // 배열에 난수 저장
				count++;  // 저장된 난수 개수를 1 증가
			}
			
		}  // end while
		
	}  // end main

}  // end class