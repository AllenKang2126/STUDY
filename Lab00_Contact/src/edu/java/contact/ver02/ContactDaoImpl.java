package edu.java.contact.ver02;

import edu.java.contact.model.Contact;

public class ContactDaoImpl implements ContactDao {

	private static final int MAX_LENGTH = 3; // 배열의 크기
	private Contact[] contacts = new Contact[MAX_LENGTH]; // 연락처를 저장할 배열
	private int count = 0; // 현재까지 배열에 저장된 연락처의 개수

	// Singleton 디자인 패턴 - 1), 2), 3)
	// private static으로 자기자신 타입의 변수를 선언
	private static ContactDaoImpl instance = null;

	// 생성자를 private으로 선언
	private ContactDaoImpl() {
	}

	// 생성자 대신에 인스턴스를 생성할 수 있는 public static 메서드를 제공.
	public static ContactDaoImpl getInstance() {
		if (instance == null) {
			// instance가 null인 경우에만 생성자를 호출
			instance = new ContactDaoImpl();
		}

		return instance; // 생성된 객체의 주소값을 리턴
	}

	@Override
	public Contact[] select() {
		Contact[] result = new Contact[count]; // 저장하고 있는 원소 개수 만큼의 배열 생성
		for (int i = 0; i < count; i++) {
			result[i] = contacts[i];
		}

		return result;
	}

	@Override
	public Contact select(int index) {  // Contact 객체 자체를 리턴
		Contact result = null;
		if(index >= 0 && index < MAX_LENGTH) {  // index 가 정상적인 범위 안에 있는지 여부 확인용.
			result = contacts[index];
		}
		
		return result;
	}

	@Override
	public int insert(Contact c) {  // Ver 0.2에선 연락처의 갯수를 검사를 해야하는 코드가 필요불가결이었음.
		int result = 0;
		if(count < MAX_LENGTH) {  // 배열에 저장된 원소의 개수가 배열 크기보다 작으면
			contacts[count] = c;  // 배열에 저장된 가장 마지막 원소 바로 뒤에 전달받은 연락처를 추가
			count++;
			result = 1;  // 새 연락처 추가 결과를 성공(1)으로 설정.
		}
		
		return result;
	}

	@Override
	public int update(int index, Contact contact) {  // Ver 0.2
		int result = 0;
		if (index >= 0 && index < count) {
			contacts[index] = contact;
//			contacts[index].setName(contact.getName());
//			contacts[index].setPhone(contact.getPhone());
//			contacts[index].setEmail(contact.getEmail());
			result = 1;
		}
		return result;
	}

}