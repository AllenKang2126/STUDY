package edu.java.variable09;

import java.util.Scanner;

public class VariableMain09 {

	public static void main(String[] args) {
		// 간단한 성적 처리 프로그램
		// Java, SQL, JSP 과목의 점수(int)를 Scanner를 사용해서 입력받음.
		// 세 과목의 점수를 출력		
		// 세 과목의 총점을 출력
		// 세 과목의 평균을 출력 - 소수점이 계산되도록!
		Scanner sc = new Scanner(System.in);  // 입력 도구 생성
		
		System.out.println("↓↓↓Java과목의 점수를 입력해주세요");
		int JavaScore = sc.nextInt();  // Java 점수를 입력받고 변수에 저장
		System.out.println("↓↓↓SQL과목의 점수를 입력해주세요");
		int SQLScore = sc.nextInt();
		System.out.println("↓↓↓JSP과목의 점수를 입력해주세요");
		int JSPScore = sc.nextInt();
		
		System.out.println("Java과목의 점수 : " + JavaScore);
		System.out.println("SQL과목의 점수 : " + SQLScore);
		System.out.println("JSP과목의 점수 : " + JSPScore);
		
		int total = JavaScore + SQLScore + JSPScore;  // 세 과목의 총점을 계산하고 변수에 저장.
		
		System.out.println("세과목의 총점 : " + total);
		
		double average = total / 3.0;  // 평균을 계산하고 변수에 저장.
		System.out.println("세 과목의 평균점 : " + average);
		
		sc.close();
		System.out.println("프로그램 종료");
		
	}

}
