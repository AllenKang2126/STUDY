package edu.java.inheritance02;

// class SubClass extends(확장한다) SuperClass
public class BusinessPerson extends Person {
	//필드(멤버 변수, 속성, 특성)
	private String company;
	
	// 생성자
	public BusinessPerson() {
		System.out.println("BusinessPerson() 생성자 호출");
	}
	
	public BusinessPerson(String name, String company) {
		System.out.println("BusinessPerson(name, company) 호출");
		setName(name);
		this.company = company;
	}
	
	// 메서드 - getter & setter
	public String getCompany() {
		return company;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}
	
}
