package edu.java.interface03;

public class InterfaceMain03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}  // end class InterfaceMain03
// 상위 클래스 상속(extends)과 인터페이스 구현(implements)를 동시에 하는 경우 :
class SuperClass {}
interface MyInterface {}
class SubClass extends SuperClass
		implements MyInterface{}
