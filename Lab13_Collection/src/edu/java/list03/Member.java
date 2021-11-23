package edu.java.list03;

public class Member {
	// field
	private String memberId;
	private String memberPassword;
	// TODO : 생성자 - 기본 생성자, 파라미터 2개인 생성자
	public Member() {}
	
	public Member(String memberId, String memberPassword) {
		this.memberId = memberId;
		this.memberPassword = memberPassword;
	}

	
	// TODO : getters & setters
	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPassword() {
		return memberPassword;
	}

	public void setMemberPassword(String memberPassword) {
		this.memberPassword = memberPassword;
	}
	
	
	
	// toString override
}
