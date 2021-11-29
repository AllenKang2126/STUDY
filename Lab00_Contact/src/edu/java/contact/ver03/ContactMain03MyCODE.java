package edu.java.contact.ver03;

import static edu.java.contact.ver03.MainMenu.*;
import java.util.List;
import java.util.Scanner;

import edu.java.contact.model.Contact;

//public class ContactMain03 {  // 내 코드
//	private static Scanner scanner = new Scanner(System.in);
//	private static ContactDao dao = ContactDaoImpl.getInstance();
//
//	public static void main(String[] args) {
//		System.out.println("*** 연락처 프로그램 Ver 0.3 ***");
//		boolean run = true;
//		while (run) {
//			int menu = chooseMenu();
//			switch (menu) {
//			case QUIT:
//				run = false;
//				break;
//			case SELECT_ALL:
//				selectAllContacts();
//				break;
//			case SELECT_BY_INDEX:
//				selectContactByIndex();
//				break;
//			case INSERT:
//				insertNewContact();
//				break;
////			case UPDATE:
////				updateContactInfo();
////				break;
////			case DELETE:
////				deleteContact();
////				break;
//			default:
//				System.out.println("다시 선택해주세요...");
//
//			} // end switch
//		} // end while
//
//	}
//
//	private static void selectContactByIndex() {
//		System.out.println();
//		System.out.println("--- 인덱스 검색 ---");
//		System.out.println("검색할 인덱스>>>");
//		String s = scanner.nextLine();
//		int index = Integer.parseInt(s);
//		
//		Contact contact = new Contact(name, phone, email);
//		
//		
//	}
//
//	private static void insertNewContact() {
//		System.out.println();
//		System.out.println("--- 새 연락처 추가 ---");
//		System.out.println("이름 입력>>>");
//		String name = scanner.nextLine();
//		System.out.println("전화번호 입력>>>");
//		String phone = scanner.nextLine();
//		System.out.println("e-mail 입력>>>");
//		String email = scanner.nextLine();
//		
//		Contact contact = new Contact(name, phone, email);
//		int result = dao.insert(contact);
//		if(result == 1) {
//			System.out.println("연락처가 추가되었습니다!!");
//		} else {
//			System.out.println("연락처 추가에 실패했습니다...");
//		}
//		
//	}
//
//	private static void selectAllContacts() {
//		System.out.println();
//		System.out.println("---------- 연락처 전체 리스트 ----------");
//		List<Contact> contactList = dao.select();
//		System.out.println(contactList);
//		System.out.println("----------------------------------------");
//
//	}
//
//	private static int chooseMenu() {
//		System.out.println();
//		System.out.println("---------------------------------------------------------------");
//		System.out.println("[1] 전체검색 [2] 인덱스검색 [3] 추가 [4] 수정 [5] 삭제 [0] 종료");
//		System.out.println("---------------------------------------------------------------");
//		System.out.println("선택>>");
//		String s = scanner.nextLine();
//		int menu = Integer.parseInt(s);
//
//		return menu;
//	} // end main()
//
//} // end class()
