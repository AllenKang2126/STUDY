package edu.java.array08;

import java.util.Random;

public class ArrayMain08 {

	public static void main(String[] args) {
		// 성적 처리 프로그램

		Random rand = new Random();  // 난수를 이용해서 점수를 만듦.
		
		// 0 ~ 10 사이의 난수 5개를 저장할 수 있는 배열 선언.
		int[] scores = new int[5];
		// 배열에 난수 5개를 저장.
		for (int n = 0; n < scores.length; n++) {  // 쌤 코드와 동일
			scores[n] = rand.nextInt(11);  // 쌤 코드와 동일
			
			// 내코드
			//System.out.print(scores[n] + " ");  
		}
		// 배열에 저장된 모든 점수를 한 줄에 출력.
		System.out.print("scores: ");  // 배열 저장과 출력을 서로 다른 블록으로 함.
		for (int s : scores) {
			System.out.print(s + " ");
		}
		

		System.out.println();
		// 총점을 계산하고 출력. : sum = 0 + scores[0] + scores[1] + scores[2] + ...
		int sum = 0;
		for (int n = 0; n < scores.length; n++) {
			sum = scores[n] + sum;
		}
		System.out.println("총점: " + sum);
		// 쌤 코드 
		// sum 변수 초기화 및 선언은 동일
		//  for ( int s : scores) {
		//	sum += s;
		//  }
		
		
		// 평균을 계산하고 출력. : (double)sum / length
		double avg = (double)sum / scores.length;
		System.out.println("평균 : " + avg);
		
		// 표준편차를 계산하고 출력. : Math.sqrt() 메서드를 이용 -> 제곱근(squared root)
		// 표준 편차(standard deviation) = sqrt(분산)
		// 분산(deviation) = ((x_0 - mean)^2 + (x_1 -mean)^2  + ...) / (N - 1) = 데이터들이 평균에서 떨어져 있는 정도
		double sumOfSquares = 0;
		for (int n = 0; n < scores.length; n++) {
			sumOfSquares += (scores[n] - avg) * (scores[n] - avg);

		}
		double deviation = sumOfSquares / scores.length;
		double stdDev = Math.sqrt(deviation);
		System.out.println("표준 편차: " + stdDev);
		
		// 최댓값을 찾아서 출력.
		int max = scores[0];  // 배열의 첫번째 원소를 최댓값이라고 가정
		for (int i = 1; i < scores.length; i++) {  // 배열의 원소들을 모두 반복하면서
			if (max < scores[i]) {  // 배열에서 max보다 더 큰 값을 찾으면
				max = scores[i];  // max를 배열에서 찾은 값으로 바꿈.
			}
		}
		System.out.println("최댓값: "+ max);
		// 최솟값을 찾아서 출력.
		int min = scores[0];  // 최솟값을 배열의 첫번째 값이라고 가정
		for (int s : scores) {  // 배열의 모든 원소들에 대해서 반복하면서
			if(min > s) {  // 배열에서  min보다 더 작은 값을 발견했다면
				min = s;  // 더작은 값으로 min을 변경  %향상된 for문의 경우 시작지점 지정이 불가능.
			}
		}
		System.out.println("최솟값 : "+ min);
		
	
	}  // end main

}  // end class
