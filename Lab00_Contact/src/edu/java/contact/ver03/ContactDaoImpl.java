package edu.java.contact.ver03;

import java.util.ArrayList;
import java.util.List;

import edu.java.contact.model.Contact;

public class ContactDaoImpl implements ContactDao {
	private List<Contact> contacts = new ArrayList<>();
	private static ContactDaoImpl instance = null;
	private static final int MAX_LENGTH = 3;
	private int count = 0;
	
	// 생성자
	private ContactDaoImpl() {}
	
	// 생성자 대신 인스턴스 생성할 수 있는 메서드
	public static ContactDaoImpl getInstance() {
		if (instance == null) {
			instance = new ContactDaoImpl();
		}
		
		return instance;
		
	}
	
	@Override
	public List<Contact> select() {
		List<Contact> list = new ArrayList<>();
		for(Contact c : list) {
			list.get(index)
		}
		return list;
	}

	@Override
	public Contact select(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(Contact c) {
		int result = 0;
		if(count < MAX_LENGTH) {
			contacts.add(c);
			count++;
			result = 1;
		}
		return result;
	}

	@Override
	public int update(int index, Contact contact) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int index) {
		// TODO Auto-generated method stub
		return 0;
	}

}
