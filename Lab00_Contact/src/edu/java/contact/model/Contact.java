package edu.java.contact.model;

import java.io.Serializable;

// 연락처 프로그램에서 사용할 데이터 객체 - Model, VO(Value Object), DTO(Data Transfer Object)
public class Contact implements Serializable{
	// field
	private String name;
	private String phone;
	private String email;

	// TODO : 생성자 - default, 파라미터 3개인 생성자
	public Contact() {}
	
	public Contact(String name, String phone, String email) {
		this.name = name;
		this.phone = phone;
		this.email = email;
	}
	

	// TODO : getters & setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	
	public String toString() {
		return "contact {name : " + name + ", phone : " + phone + ", e-mail : " + email + "}";
	}


}
