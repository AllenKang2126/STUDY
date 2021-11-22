package edu.java.member.view;

import edu.java.member.model.Member;

// MVC(Model-View-Controller) 디자인 패턴
// Model : 데이터 저장을 위한 클래스. VO(Value Object), DTO(Data Transfer Object)
// - edu.java.member.model.Member
// View : UI(User Interface)를 담당하는 클래스.
// - edu.java.member.view.MemberMain
// Controller : 프로그램의 특정 로직(기능, 비즈니스 로직)을 담당하는 클래스. DAO(Data Access Obeject).
// - edu.java.member.controller.MemberDao, MemberDaoImpl
// - 인터페이스와 구현 클래스로 나눔.
// - 구현 클래스는 Singleton 디자인 패턴으로 설계.
 
public class MemberMain {

	public static void main(String[] args) {
		// 회원 관리 프로그램 메인(View)
		Member m = new Member("admin", "memberPassword");
		System.out.println(m);
		
	}

}
