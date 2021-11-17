package edu.java.inheritance07;

// final : 최종적인(마지막의), 변경할 수 없는.
// 1) 변수 앞 - 멤버 변수, 지역 변수, 파라미터
// 2) 클래스 앞 - 변경할 수 없는 클래스. 상속할 수 없는 클래스. Sub class를 만들 수 없는 클래스.
// 3) 메서드 앞 - 변경할 수 없는 메서드. override를 할 수 없는 메서드.

public class InheritanceMain07 {
	private static final int MAX = 3;  // 변경할 수 없는 필드(멤버 변수)
	
	public static void main(String[] args) {
		// MAX = 5; cannot be assigned. << 변경 불가로 인해 오류 발생
		final int n = 10;  // 변경할 수 없는 지역 변수
		// n = 100; << 마찬가지 지역변수로 final 붙였을 때도 변경할 수 없어서 오류발생

	}

}  // end Inheritance07

class A {
	public void test() {}
	public final void testFinal() {}
}

// final이 아닌 클래스는 확장(상속)할 수 있음.
class B extends A {
	@Override  // final이 아닌 부모의 메서드는 override가 가능.
	public void test() {
		super.test();  // 부모의 기능을 사용
		// 추가 기능 구현
	}
	// final로 선언된 부모의 메서드는 자식 클래스에서 override가 불가능.
	// public void testFinal() {}
}

final class C {}

// class D extends C {}