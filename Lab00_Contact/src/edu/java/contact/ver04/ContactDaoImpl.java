package edu.java.contact.ver04;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static edu.java.contact.fileutil.ContactFileUtil.*;  // 모든 static 멤버(변수, 메서드)를 import

//import edu.java.contact.fileutil.ContactFileUtil;
import edu.java.contact.model.Contact;

public class ContactDaoImpl implements ContactDao {
	// field(멤버 변수)
	private List<Contact> contacts;  // 연락처 정보를 저장할 리스트
	private File dataFile;  // 연락처 정보 리스트를 저장할 파일.
	private File dataDir;

	// Singleton
	private static ContactDaoImpl instance = null;
	private ContactDaoImpl() {  // <- 생성자
		// 연락처 정보 리스트를 저장하는 파일 관리 객체 생성.
		dataFile = new File(DATA_DIR, DATA_FILE);
		
		// TODO : 현재 작업 디렉토리 (CWD)에 (data 폴더가 없으면) data 폴더를 생성.
		dataDir = initializeDataDir();
		
		// TODO : data폴더에 있는 contacts.dat 파일을 읽어서 필드 contacts를 초기화.
		contacts = initializeData();
	}

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
		contacts.add(c);  // ArrayList가 변경됨
		// TODO : 파일에 변경된 ArrayList를 씀.(write)
		writeDataToFile(contacts, dataFile);
		// 데이터에 변화가 생겼기 때문에 파일에 write해주세요 라는 코드 삽입
		return 1;
	}

	@Override
	public int update(int index, Contact contact) {
		int result = 0;
		if (index >= 0 && index < contacts.size()) {  // 파라미터
//			contacts.set(index, contact);  이 코드 또는
			contacts.get(index).setName(contact.getName());
			contacts.get(index).setPhone(contact.getPhone());
			contacts.get(index).setEmail(contact.getEmail());
			
			writeDataToFile(contacts, dataFile);  // 파일에 변경된 ArrayList를 씀(write).
			
			result = 1;
		}

		return result;
	}

	@Override
	public int delete(int index) {
		int result = 0;
		if (index >= 0 && index < contacts.size()) {
			contacts.remove(index);
			
			// TODO : 파일에 변경된 ArrayList를 씀(Write).
			writeDataToFile(contacts, dataFile);
			
			result = 1;
		}
		return result;
	}

}
