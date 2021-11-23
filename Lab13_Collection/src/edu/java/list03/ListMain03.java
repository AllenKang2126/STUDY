package edu.java.list03;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Scanner;

public class ListMain03 {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int count = 0;
		// Member 타입을 저장할 수 있는 ArrayList를 생성
		ArrayList<Member> list = new ArrayList<Member>();
		// 반복문을 사용해서
		// 아이디와 비밀 번호를 입력받아서 Member 객체를 생성해서
		// ArrayList에 Member 타입 객체 3개를 추가
		for (int i = 0; i < 3; i++) {
			System.out.println("아이디를 입력해주세요");
			String s1 = scanner.nextLine();
			System.out.println("비밀번호를  입력해주세요");
			String s2 = scanner.nextLine();
			Member member = new Member(s1, s2);
			list.add(member);
		}

//		Member member = new Member("123","123");
//		list.add(member);
//		System.out.println(list.get(0).getMemberId());
//		System.out.println(list.get(0).getMemberPassword());

		// 리스트의 내용을 출력 - 각각의 회원의 아이디와 비밀번호가 출력될 수 있도록
		for (int i = 0; i < 3; i++) {
			System.out.println("ID : " + list.get(i).getMemberId() + ", PW : " + list.get(i).getMemberPassword());
		}
		System.out.println();
		// 인덱스 0 위치의 회원 정보 중에서 비밀번호를 변경하고 리스트 내용 출력
		System.out.println("변경할 비밀번호를 입력해주세요");
		String s = scanner.nextLine();
		Member m = list.get(0);
		m.setMemberPassword(s);

		for (int i = 0; i < 3; i++) {
			System.out.println("ID : " + list.get(i).getMemberId() + ", PW : " + list.get(i).getMemberPassword());
		}
		System.out.println();

		// Member m = memberlist.get(0); m.setPwd(새 비번);
		// (1) 인덱스 0 위치의 회원정보를 찾음. (2) 그 회원의 비번을 설정(setter)

		// 인덱스 1 위치의 회원 정보를 삭제하고 리스트 내용을 출력. - list.remove(int index)
		

		for (int i = 0; i < 3; i++) {
			System.out.println("ID : " + list.get(i).getMemberId() + ", PW : " + list.get(i).getMemberPassword());
		}
		System.out.println();

		// 아이디가 일치하면 같은 회원으로 간주되도록 Member 클래스를 수정. - equals, hashCode
		// 아이디가 일치하는 회원을 리스트에서 삭제하고 리스트 내용을 출력. - list.remove(Object value)

	}

}
