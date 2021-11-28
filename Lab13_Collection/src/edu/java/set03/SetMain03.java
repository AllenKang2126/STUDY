package edu.java.set03;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetMain03 {

	public static void main(String[] args) {
		Random rd = new Random();  // 난수를 생성하는 도구 생성
		// 정수(Integer)를 저장할 수 있는 HashTree을 생성
		Set<Integer> set = new HashSet<>();
		System.out.println(set);
		// 0 이상 9 이하의 서로다른 정수 난수 5개를 저장.
		int count = 0;
		while(true) {
			count++;
			int r = rd.nextInt(10);  // 난수 생성
			System.out.println(r);
			set.add(r);  // 난수를 set에 추가(다른 숫자이면 추가되고, 같은 숫자이면 추가되지 않음.)
			System.out.println(set);
			System.out.println("실행 횟수 : " + count + " 회");
			if (set.size() == 5	) {  // set의 원소의 개수가 5개이면
				break;  // 무한 루프 종료
			}
		}
		
		
		
	}  // end main

}  // end class()
