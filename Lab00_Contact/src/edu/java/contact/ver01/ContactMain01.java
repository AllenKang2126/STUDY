package edu.java.contact.ver01;

import java.util.Scanner;

import edu.java.contact.model.Contact;

public class ContactMain01 {
	private static final int MAX_LENGTH = 5;  // 상수 선언
	
	private static Scanner scanner = new Scanner(System.in);
	private static Contact[] contacts = new Contact[MAX_LENGTH];
	private static int count = 0;  // 배열에 현재까지 저장된 연락처 개수

	public static void main(String[] args) {
		System.out.println("*** 연락처 프로그램 ver 0.1 ***");
		while (true) {
			// 메인 메뉴 보여주고 메뉴 선택 입력 받기
				showMainMenu();
			int select = scanner.nextInt();
			if(select == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}  // end if
			// TODO:1~4의 해당 기능 추가
			
		}  // end while
		Contact c = new Contact();
		System.out.println(c);

	}  // end main

	private static void showMainMenu() {
		System.out.println("--------------------------------------------------------");
		System.out.println("[1] 전체 검색 [2] 인덱스 검색 [3] 추가 [4] 수정 [0] 종료");
		System.out.println("--------------------------------------------------------");
		System.out.println("원하는 기능을 입력해주세요>>>");		
	}  // end showMainMenu

}
