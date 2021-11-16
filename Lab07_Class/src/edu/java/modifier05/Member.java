package edu.java.modifier05;

import java.util.Scanner;

public class Member {
	// field
	private String memberId;
	private String memberPassword;
	Scanner setPassword = new Scanner(System.in);
	
	// constructor - 파라미터 2개인 생성자만 만듦. 기본 생성자는 만들지 않음.
	public Member(String memberId, String memberPassword)	{
		this.memberId = memberId;
		this.memberPassword = memberPassword;
	}
	
	// 아이디와 비밀번호에 대한 getter(읽기) 메서드 작성
	// getters : 필드(멤버 변수)의 값을 리턴하는 메서드.
	// 쌤 코드
	public String getMemberId() {
		return memberId;
	}
	
	public String getMemberPassword() {
		return memberPassword;
	}
	
	// 내코드
	public void MemberInfo() {
		System.out.println("---------------");
		System.out.println("아이디 : " + memberId);
		System.out.println("비밀번호 : " + memberPassword);
		System.out.println("---------------");
	}
	// 비밀번호에 대한 setter 메서드 작성
	// setter : 필드(멤버 변수)의 값을 설정(변경)하는 메서드.
	// 내코드
	public void SetPassword() {
		System.out.println("새로운 비밀번호를 입력해주세요.");
		String i = setPassword.next();
		if(i != memberPassword) {
			this.memberPassword = i;
		} else {
			System.out.println("이전 비밀번호와 같은 비밀번호는 사용할 수 없습니다.");
		}

	}
	
	
	// 쌤 코드
	public void setMemberPassword(String memberPassword) {
		this.memberPassword = memberPassword;
	}
	
}
