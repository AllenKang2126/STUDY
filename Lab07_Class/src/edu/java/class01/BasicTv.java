package edu.java.class01;

// 객체 지향 프로그래밍(OOP: Object-Oriented Programming) 언어: Java, C++, C#, Python, ...

// 클래스(class): 프로그램에서 필요한 데이터(field)와 기능(method)을 묶어서 하나의 "데이터 타입"을 정의한 것.
// 데이터 타입 -> 변수 선언, 파라미터 선언, 리턴 타입 선언

// 클래스 선언: [수식어] class 클래스이름 { ... } => []안의 내용 생략 가능.
// 클래스 이름 작성 방법 : 
// - 영문자, 숫자, _, $를 사용할 수 있음.
// - 숫자로 시작할 수 없음.
// - camel 표기법 권장. 변수와는 다르게 첫글자부터 대문자로하는 것을 권장.
public class BasicTv {
	public static final int MAX = 5; // 채널, 음량의 최댓값
	public static final int MIN = 0; // 채널, 음량의 최솟값

	// 데이터(객체의 상태를 저장하기 위한 변수) - field, instance variable(인스턴스 변수)
	// filed가 지역 변수와 다른 점: 클래스 내부의 모든 메서드가 사용할 수 있는 변수.
	boolean powerOn; // TV의 현재 전원 상태를 저장하기 위한 필드(true: ON, false: OFF)
	int volume; // TV의 현재 음량 상태를 저장하기 위한 필드
	int channel; // TV의 현재 채널 번호를 저장하기 위한 필드

	// 기능(객체의 동작) - method
	/**
	 * TV전원이 On일 때,(powerOn == true) 필드 volume의 값을 1 증가시키고, 증가된 음량을 화면에 출력.
	 */
	public void volumeUp() {
		if (powerOn) { // tv가 켜져 있으면
			if (volume < MAX) { // 현재음량이 음량의 최댓값보다 작으면
				volume++; // (지역 변수가 아니라) 필드의 값을 변경.
			}
			System.out.println("volume: " + volume); // 변경된 내용 출력.
		}
	}

	/**
	 * TV전원이 On일 때,(powerOn == true) 필드 volume의 값을 1 감소시키고, 감소된 음량을 화면에 출력
	 */
	public void volumeDown() {
		if (powerOn) { // TV가 켜져 있으면
			if (volume > MIN) { // 현재 음량이 음량의 최솟값보다 크면
				volume--; // 음량을 1 줄임
			}
			System.out.println("volume: " + volume); // 현재 음량을 출력
		}
	}

	/**
	 * TV전원이 On일 때,(powerOn == true) 필드 channel의 값을 1 증가시키고, 변경된 내용을 출력
	 */
	public void channelUp() {
		if (powerOn) {  // TV가 켜져 있는 경우에
			if(channel < MAX) {  // 현재 채널이 채널의 최댓값보다 작으면
				channel++;  // 채널을 1증가
			} else {  // 채널 최댓값에 도달한 경우에는
				channel = MIN;  // 채널을 최소값으로 순환시킴.
			}
			System.out.println("channel: " + channel);
		}
	}

	/**
	 * TV전원이 On일 때,(powerOn == true) 필드 channel의 값을 1 감소시키고, 변경된 내용을 출력
	 */
	public void channelDown() {
		if (powerOn) {  // TV가 켜져 있을 때
			if (channel > MIN) {  // 현재 채널이 채널의 최소값보다 크면
				channel --;  // 채널을 1감소
			} else {  // 채널 최소값이면
				channel = MAX;  // 채널을 최대값으로 순환시킴.
			}
			System.out.println("channel: " + channel);
		}
	}

	/**
	 * TV가 켜져 있는 상태이면 끄고, TV가 꺼져 있는 상태이면 킴. powerOn의 값이 true이면 false로 변경, powerOn의
	 * 값이 false이면 true로 변경.
	 */
	public void powerOnOff() {
		if (powerOn) { // powerOn의 값이 true이면(TV가 켜져 있으면)
			powerOn = false; // TV를 끔.
			System.out.println("TV OFF");
		} else { // powerOn의 값이 false이면(TV가 꺼져 있으면)
			powerOn = true; // TV를 켬.
			System.out.println("TV ON");
		}
	}

	public void info() {
		System.out.println("--- TV 정보 ---");
		System.out.println("전원: " + powerOn);
		System.out.println("volume: " + volume);
		System.out.println("channel: " + channel);
	}

} // end class BasicTv

// 단축키 : ctrl + shift + F : 소스 코드 포맷팅(들여쓰기 자동으로 해줌.)