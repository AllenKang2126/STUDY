package edu.java.list03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListMain03 {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// 기본 생성자(default constructor)를 사용해서 Member 클래스의 인스턴스를 생성
		Member m1 = new Member();	// 쌤 코드
		System.out.println("m1 : " + m1);  // 쌤 코드 - toString 메서드를 override하기 전/후의 결과 비교
		// getter : 멤버 변수(필드)의 값을 가져옴(읽어옴.)
		System.out.println("m1.memberId : " + m1.getMemberId());  // 쌤 코드
		System.out.println("m1.memberPassword : " + m1.getMemberPassword());  // 쌤 코드
		// setter : 멤버 변수(필드)의 값 설정.
		m1.setMemberPassword("abcd");  // 쌤 코드
		System.out.println("m1.memberPassword : " + m1.getMemberPassword());  // 쌤 코드
		
		// 파라미터를 갖는 생성자를 사용해서 Member 클래스의 인스턴스를 생성.
		Member m2 = new Member("할머니", "안녕하세요");  // 쌤 코드
		System.out.println("m2 : " + m2);  // 쌤 코드
		
		System.out.println();
		
		int count = 0;
		// Member 타입을 저장할 수 있는 ArrayList를 생성
		List<Member> list = new ArrayList<Member>();  // 생성자를 호출할 때는 ArrayList가 저장하는 타입을 생략할 수 있음.
		System.out.println(list);
		
		// 반복문을 사용해서
		// 아이디와 비밀 번호를 입력받아서 Member 객체를 생성해서
		// ArrayList에 Member 타입 객체 3개를 추가
		for (int i = 0; i < 3; i++) {
			// id / password를 입력 받음.
			System.out.println("아이디를 입력해주세요");
			String id = scanner.nextLine();
			System.out.println("비밀번호를  입력해주세요");
			String pw = scanner.nextLine();
			// Member 객체 생성
			Member member = new Member(id, pw);
			// Member 객체를 ArrayList에 추가
			list.add(member);
			// 회원 정보가 추가된 내용을 출력.
			System.out.println(list);
		}

//		Member member = new Member("123","123");
//		list.add(member);
//		System.out.println(list.get(0).getMemberId());
//		System.out.println(list.get(0).getMemberPassword());

		// 리스트의 내용을 출력 - 각각의 회원의 아이디와 비밀번호가 출력될 수 있도록(toString override test)
		for(Member m : list) {  // 쌤 코드
			System.out.println(m);  // 쌤 코드
		}
		for (int i = 0; i < 3; i++) {
			System.out.println("ID : " + list.get(i).getMemberId() + ", PW : " + list.get(i).getMemberPassword());
		}
		System.out.println();
		// 인덱스 0 위치의 회원 정보 중에서 비밀번호를 변경하고 리스트 내용 출력
		System.out.println("변경할 비밀번호를 입력해주세요");
		String s = scanner.nextLine();
		Member m = list.get(0);  // (1) 인덱스 0 위치의 회원 정보를 찾음.
		m.setMemberPassword(s);  // (2) 그 회원의 비번을 설정(setter).
		// list.get(0).setMemberPassword("ABCD");  // 메서드 연쇄 호출(chain call)
		System.out.println(list);
		System.out.println();
		/*for (int i = 0; i < 3; i++) {
			System.out.println("ID : " + list.get(i).getMemberId() + ", PW : " + list.get(i).getMemberPassword());
		}
		System.out.println();*/  // 내 코드

		// Member m = memberlist.get(0); m.setPwd(새 비번);
		// (1) 인덱스 0 위치의 회원정보를 찾음. (2) 그 회원의 비번을 설정(setter)

		// 인덱스 1 위치의 회원 정보를 삭제하고 리스트 내용을 출력. - list.remove(int index)
		list.remove(1);
		System.out.println(list);  // 쌤 코드
		System.out.println();

		/*for (int i = 0; i < 3; i++) {
			System.out.println("ID : " + list.get(i).getMemberId() + ", PW : " + list.get(i).getMemberPassword());
		}
		System.out.println();*/ // 내코드

		// 아이디가 일치하면 같은 회원으로 간주되도록 Member 클래스를 수정. - equals, hashCode
		// 아이디가 일치하는 회원을 리스트에서 삭제하고 리스트 내용을 출력. - list.remove(Object value)
		Member member = new Member("AAA", "@@@");
		/*for(int i = 0; i < list.size(); i++) {  // 인덱스 0부터 마지막 원소까지 반복하면서
			Member m3 = list.get(i);  // 인덱스 위치에 있는 원소를 가져옴.
			if(m3.getMemberId().equals(member.getMemberId())) {
				// 리스트에 저장된 회원 아이디와 삭제하려고 하는 회원 아이디가 같다면
				list.remove(i);  // 리스트에서 그 인덱스의 원소를 삭제.
				break;  // 반복문 종료
			}
		}*/
		list.remove(member);
		System.out.println(list);
	}

}
