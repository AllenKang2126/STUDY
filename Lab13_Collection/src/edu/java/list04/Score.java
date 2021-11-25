package edu.java.list04;

public class Score {
	// field(member variable)
	private int korean;
	private int english;

	// constructor 생성자
	public Score() {
	}

	public Score(int korean, int english) {
		this.korean = korean;
		this.english = english;
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

	@Override
	public String toString() {
		return "{ Korean : " + this.korean + ", English : " + this.english + " }";
	}

	@Override  // "두 점수가 같다"를 재정의
	public boolean equals(Object obj) {
		boolean result = false;
		if (obj instanceof Score) {
			Score score = (Score) obj;  // casting
			if(this.korean == score.korean && this.english == score.english) {
				result = true;
			}
		}
		
		return result;
	}
	// equals 메서드가 true를 리턴하는  두 객체는 hashCode가 리턴하는 int 값이 같아야 됨!
	// (hashCode 값이 다르면 
	@Override
	public int hashCode() {
		return this.korean * 100 + this.english;
	}
}
