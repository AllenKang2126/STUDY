package edu.java.swing12;

public class Score {
	// 멤버 변수
	private int korean;
	private int english;
	private int math;
	
	// 생성자
	public Score() {}
		public Score(int korean, int english, int math) {
		this.korean = korean;
		this.english = english;
		this.math = math;
	}
		
	// getters & setters
	public int getKorean() {
		return korean;
	}

	public void setKorean(int korean) {
		this.korean = korean;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
	
	// 총점 계산 메서드
	public int total() {
		return this.korean + this.english + this.math;
	}
	
	// 평균 계산 메서드
	public double average() {
		return (double)total() / 3;
	}
}
