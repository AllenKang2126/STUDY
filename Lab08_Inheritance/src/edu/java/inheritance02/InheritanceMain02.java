package edu.java.inheritance02;

public class InheritanceMain02 {

	public static void main(String[] args) {
		// 상속과 생성자
		
		// Person 클래스의 기본 생성자를 호출
		Person p1 = new Person();
		System.out.println(p1.getName());
		
		// Person 클래스의 파라미터를 갖는 생성자를 호출
		Person p2 = new Person("둠");
		System.out.println(p2.getName());
		
		System.out.println();
		// BusinessPerson 클래스의 기본 생성자를 호출
		BusinessPerson p3 = new BusinessPerson();
		// -> 상위 클래스인 Person() 생성자가 먼저 호출되고,
		// 하위 클래스의 BusinessPerson() 생성자가 호출됨.
		System.out.println("이름 : " + p3.getName());
		System.out.println("회사 : " + p3.getCompany());
		
		System.out.println();
		
		// BusinessPerson 클래스의 파라미터를 갖는 생성자를 호출
		BusinessPerson p4 = new BusinessPerson("둠", "ITWILL");
		System.out.println("이름 : " + p4.getName());
		System.out.println("회사 : " + p4.getCompany());
		
	}  // end main()

}
