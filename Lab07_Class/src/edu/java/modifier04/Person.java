package edu.java.modifier04;

public class Person {
	// field(멤버 변수)
	public String name;
	public int age;

	// getter : 필드(멤버 변수)를 다른 클래스에게 알려주기 위한 public method
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	// setter : private 필드(멤버 변수)의 값을 변경(설정)하기 위한 public 메서드.
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		if(age >= 0) {  // 나이가 정상적인 값(0 또는 양수)이면
			this.age = age;  // 필드의 값을 변경
		} else {  // 정상적인 값이 아니면
			System.out.println("나이는 0보다 작을 수 없음!!!");  // 경고 메시지 출력. 값은 변경하지 않음.
		}
	}
}
