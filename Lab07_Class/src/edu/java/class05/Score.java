package edu.java.class05;

import java.util.Scanner;

public class Score {
	// field(멤버 변수)
	int korean;
	int english;
	int math;
	int science;
	
	// 생성자 - default, 파라미터(매개변수) 4개
	public Score() {}
	
	public Score(Scanner sc, Scanner sc2, Scanner sc3, Scanner sc4) {}
	
	public Score(int korean, int english, int math, int science) {
		this.korean = korean;
		this.english = english;
		this.math = math;
		this.science = science;
	}
	
	// 메서드 - 총점 리턴, 평균 리턴.
	public int getTotal() {
		return math + english + science + korean;
	}
	
//	public double getAverage() {
//		return (math + english + science + korean) / 4.0;
//	}
	
	public double getAverage() {
		return getTotal() / 4.0;  // or getTotal을 강제형변환해줌. (double)getTotal
	}
	
	
}  // end class Score()