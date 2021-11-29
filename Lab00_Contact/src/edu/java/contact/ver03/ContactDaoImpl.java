package edu.java.contact.ver03;

import java.util.ArrayList;
import java.util.List;

import edu.java.contact.model.Contact;

public class ContactDaoImpl implements ContactDao {
	// field(멤버 변수)
	private List<Contact> contacts = new ArrayList<>();
	// Singleton
	private static ContactDaoImpl instance = null;
//	private static final int MAX_LENGTH = 3;  Ver 0.3에선 필요없음.
//	private int count = 0;

	// 생성자
	private ContactDaoImpl() {
	} // 다른 클래스 역시 생성이 불가하도록 private

	// 생성자 대신 인스턴스 생성할 수 있는 메서드
	public static ContactDaoImpl getInstance() {
		if (instance == null) {
			instance = new ContactDaoImpl();
		}

		return instance;

	}

	@Override
	public List<Contact> select() { // 연락처 정보 저장된 리스트 호출
//		List<Contact> list = new ArrayList<>();
//		for(Contact c : list) {
//			list.get(index)
//		}
//		return list;  // 내 코드
		return contacts;
	}

	@Override
	public Contact select(int index) {
		Contact result = null;
		if (index >= 0 && index < contacts.size()) { // 파라미터 index가 리스트의 index 범위 안에 있으면
			result = contacts.get(index); // list의 index를 get하고 그렇지 않으면 null을 반환
		}
		return result;
	}

	@Override
	public int insert(Contact c) {
		contacts.add(c);

		return 1;
	}

	@Override
	public int update(int index, Contact contact) {
		int result = 0;
		if (index >= 0 && index < contacts.size()) {
//			contacts.set(index, contact);  이 코드 또는
			contacts.get(index).setName(contact.getName());
			contacts.get(index).setPhone(contact.getPhone());
			contacts.get(index).setEmail(contact.getEmail());
			result = 1;
		}

		return result;
	}

	@Override
	public int delete(int index) {
		int result = 0;
		if (index >= 0 && index < contacts.size()) {
			contacts.remove(index);
			result = 1;
		}
		return result;
	}

}
