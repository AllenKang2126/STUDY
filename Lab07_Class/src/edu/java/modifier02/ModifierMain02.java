package edu.java.modifier02;

// com.naver.traffic.Map
// com.kakao.map.Map
// com.google.xxx.Map 등등 도메인 앞뒤를 바꿈.

import edu.java.modifier01.AccessTest;
// 같은 패키지에 있는 클래스는 import문 없이 변수 선언할 때 클래스 이름을 사용할 수 있음.
// 다른 패키지에 있는 클래스로 변수를 선언할 때는
// (1) import문을 작성하고 클래스 이름을 사용.
//							or
// (2) 패키지를 포함한 클래스의 full name으로 변수를 선언.
// java.lang 패키지의 모든 클래스는 import문 없이 사용 가능 - (예) String

public class ModifierMain02 {

	public static void main(String[] args) {
		// edu.java.modifier01.AccessTest 클래스 인스턴스 생성
		AccessTest test = new AccessTest();
		// test. 을 했을 때 보이는 멤버 : public field, public method
		

	}  // end main()

}  // end class()
